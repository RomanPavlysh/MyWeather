package ua.ho.android.myweather.data;

import android.annotation.SuppressLint;
import android.widget.ProgressBar;

import com.squareup.picasso.Picasso;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import ua.ho.android.myweather.App;
import ua.ho.android.myweather.MainActivity;
import ua.ho.android.myweather.R;
import ua.ho.android.myweather.adapters.GridElementAdapter;
import ua.ho.android.myweather.model.city.GetCity;
import ua.ho.android.myweather.model.forecast.Forecast;
import ua.ho.android.myweather.model.forecast10day.Forecast10day;
import ua.ho.android.myweather.model.hourly.Hourly;

public class DataBinder {

    public void getData(MainActivity mainActivity, String bp, String ll) {
        mainActivity.forecastObservable = App.getApi()
                .getForecastData(bp, ll + ".json");
        mainActivity.hourlyObservable = App.getApi()
                .getHourlyData(bp, ll + ".json");
        mainActivity.forecast10dayObservable = App.getApi()
                .getForecast10Day(bp, ll + ".json");
        mainActivity.getCityObservable = App.getGeoApi()
                .getCity(ll, mainActivity.locale, mainActivity.geoApiKey);
        dataBinder(mainActivity,mainActivity.forecastObservable, mainActivity.forecast10dayObservable, mainActivity.hourlyObservable,mainActivity.getCityObservable);
    }

    public void dataBinder(MainActivity mainActivity, Observable<Forecast> of, Observable<Forecast10day> of10d, Observable<Hourly> oh, Observable<GetCity> os){
        of.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Forecast>() {
                    @Override
                    public void onCompleted() {
                    }

                    @SuppressLint("LongLogTag")
                    @Override
                    public void onError(Throwable e) {
                        mainActivity.mTvWeatherDescription.setText(e.getMessage());
                    }
                    @Override
                    public void onNext(Forecast forecast) {
                        mainActivity.mTvCurrentDate.setText(forecast.getForecast()
                                .getSimpleforecast().getForecastday().get(0)
                                .getDate().getWeekdayShort()
                                + "," + forecast.getForecast()
                                .getSimpleforecast().getForecastday().get(0)
                                .getDate().getDay()
                                + " " + forecast.getForecast()
                                .getSimpleforecast().getForecastday().get(0)
                                .getDate().getMonthnameShort());
                        mainActivity.mTvWeatherDescription.setText(forecast.getForecast()
                                .getTxtForecast()
                                .getForecastday().get(0)
                                .getFcttextMetric());
                    }
                });
        oh.debounce(6000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Hourly>() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                    }
                    @Override
                    public void onNext(Hourly hourly) {
                        mainActivity.mTvPressure.setText(hourly.getHourlyForecast().get(0).getMslp().getMetric());
                        mainActivity.mTvWeatherDescriptionShort.setText(hourly.getHourlyForecast().get(0).getWx());
                        mainActivity.mTvCurrentTemperature.setText(hourly.getHourlyForecast().get(0)
                                .getTemp().getMetric());
                        String icName;
                        if (hourly.getHourlyForecast().get(0)
                                .getIconUrl().contains("nt_")) {
                            icName = "file:///android_asset/images/nt_"
                                    + hourly.getHourlyForecast().get(0).getIcon() + ".png";
                        } else
                            icName = "file:///android_asset/images/"
                                    + hourly.getHourlyForecast().get(0).getIcon() + ".png";
                        Picasso.with(mainActivity)
                                .load(icName)
                                .error(R.drawable.ic_weather)
                                .into(mainActivity.mWeatherIcon);
                    }
                });
        of10d.debounce(6000,TimeUnit.MICROSECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Forecast10day>() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                    }
                    @Override
                    public void onNext(Forecast10day forecast10day) {
                        GridElementAdapter gridElementAdapter = new GridElementAdapter(mainActivity, forecast10day);
                        mainActivity.mHorizontalList.setAdapter(gridElementAdapter);
                    }
                });
        os.debounce(6000,TimeUnit.MICROSECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetCity>() {
                    @Override
                    public void onCompleted() {
                    }
                    @SuppressLint("LongLogTag")
                    @Override
                    public void onError(Throwable e) {
                    }
                    @Override
                    public void onNext(GetCity getCity) {
                        String cityName = getCity.getResults().get(0)
                                .getAddressComponents().get(3).getLongName()
                                + " / " + getCity.getResults().get(0)
                                .getAddressComponents().get(6).getLongName();
                        mainActivity.mTvCityName.setText(cityName);
                        mainActivity.mProgressBar.setVisibility(ProgressBar.INVISIBLE);
                    }
                });
    }
}
