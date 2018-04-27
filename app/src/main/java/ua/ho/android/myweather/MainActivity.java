package ua.ho.android.myweather;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v17.leanback.widget.HorizontalGridView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.squareup.picasso.Picasso;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import ua.ho.android.myweather.adapters.GridElementAdapter;
import ua.ho.android.myweather.data.DataBinder;
import ua.ho.android.myweather.model.city.GetCity;
import ua.ho.android.myweather.model.forecast.Forecast;
import ua.ho.android.myweather.model.forecast10day.Forecast10day;
import ua.ho.android.myweather.model.hourly.Hourly;

public class MainActivity extends BaseActivity {
    public TextView mTvCityName, mTvCelsius,mTvCurrentDate,mTvPressure,mTvCurrentTemperature,mTvWeatherDescription,mTvWeatherDescriptionShort;
    public ImageView mWeatherIcon;
    public HorizontalGridView mHorizontalList;
    public ProgressBar mProgressBar;
    public ImageButton mIbUpdateWeather;
    public SwipeRefreshLayout mRefreshLayout;
    public RotateAnimation rotate ;
    public GridElementAdapter gridElementAdapter;
    public String test, geoApiKey, locale,latlangGeo,buildPath;
    public static Observable<Forecast> forecastObservable = null;
    public static Observable<Hourly> hourlyObservable = null;
    public static Observable<Forecast10day> forecast10dayObservable = null;
    public static Observable<GetCity> getCityObservable = null;
    public DataBinder binder;

    public TextView testttttt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface robotoit = Typeface.createFromAsset(this.getAssets(),
                "font/Roboto-LightItalic.ttf");
        Typeface roboto = Typeface.createFromAsset(this.getAssets(),
                "font/Roboto-Light.ttf");
        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mActionBarToolbar);


//        testttttt=(TextView)findViewById(R.id.testtttt);

//        mProgressBar = (ProgressBar) findViewById(R.id.pb_download);
//        mProgressBar.setVisibility(ProgressBar.VISIBLE);

        mTvPressure = (TextView) findViewById(R.id.tv_pressure);
        mTvPressure.setTypeface(robotoit);
        mTvCityName = (TextView) findViewById(R.id.toolbar_title);
        mTvCityName.setTypeface(robotoit);
        mTvCurrentDate = (TextView) findViewById(R.id.tv_current_date);
        mTvCurrentDate.setTypeface(robotoit);
        mWeatherIcon = (ImageView) findViewById(R.id.weather_icon);
        mTvCurrentTemperature = (TextView) findViewById(R.id.tv_current_temperature);
        mTvCurrentTemperature.setTypeface(robotoit);
        mTvCelsius = (TextView) findViewById(R.id.tv_celsius);
        mTvCelsius.setTypeface(robotoit);
        mTvWeatherDescription = (TextView) findViewById(R.id.tv_weather_description);
        mTvWeatherDescription.setTypeface(robotoit);
        mTvWeatherDescriptionShort = (TextView) findViewById(R.id.tv_weather_description_short);
        mTvWeatherDescriptionShort.setTypeface(robotoit);
        mHorizontalList = (HorizontalGridView) findViewById(R.id.gridView);
        mRefreshLayout =(SwipeRefreshLayout)findViewById(R.id.swipe_refresh);

        mRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        mRefreshLayout.setOnRefreshListener(() -> getData(buildPath, latlangGeo));



        mIbUpdateWeather=(ImageButton)findViewById(R.id.btn_update_weather);
        mIbUpdateWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mProgressBar.setVisibility(ProgressBar.VISIBLE);
                getData(buildPath, latlangGeo);
                if(mIbUpdateWeather !=null){
                    rotate = new RotateAnimation(0, 360,
                            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                            0.5f);
                    rotate.setDuration(100);
                    rotate.setRepeatCount(Animation.REVERSE);
                    mIbUpdateWeather.setAnimation(rotate);
                }
            }
        });
//        testttttt.setText(ltlg);
//        String lat= String.valueOf(current_location.getLatitude());
//        String lang=String.valueOf(current_location.getLatitude());
        locale = getResources().getConfiguration().locale.toString();
        latlangGeo = ltlg;
                //"50.4501,30.5234";
        geoApiKey = getString(R.string.MY_API_KEY);
        buildPath = "lang:" + (new StringBuffer(locale).delete(0, 3));

        getData(buildPath, latlangGeo);

//        binder=new DataBinder();
//        binder.getData(this,buildPath,latlangGeo);
//        binder.dataBinder(this,forecastObservable,forecast10dayObservable,hourlyObservable,getCityObservable);


    }

    private void getData(String bp, String ll) {
        forecastObservable = App.getApi()
                .getForecastData(bp, ll + ".json");
        hourlyObservable = App.getApi()
                .getHourlyData(bp, ll + ".json");
        forecast10dayObservable = App.getApi()
                .getForecast10Day(bp, ll + ".json");
        getCityObservable = App.getGeoApi()
                .getCity(ll, locale, geoApiKey);
        getObservable(forecastObservable, forecast10dayObservable, hourlyObservable,getCityObservable);
    }

    public void getObservable( Observable<Forecast> of, Observable<Forecast10day> of10d, Observable<Hourly> oh, Observable<GetCity> os){
        of.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Forecast>() {
                    @Override
                    public void onCompleted() {
                    }

                    @SuppressLint("LongLogTag")
                    @Override
                    public void onError(Throwable e) {
                        mTvWeatherDescription.setText(e.getMessage());
                    }
                    @Override
                    public void onNext(Forecast forecast) {
                        mRefreshLayout.setRefreshing(false);
                        mTvCurrentDate.setText(forecast.getForecast()
                                .getSimpleforecast().getForecastday().get(0)
                                .getDate().getWeekdayShort()
                                + "," + forecast.getForecast()
                                .getSimpleforecast().getForecastday().get(0)
                                .getDate().getDay()
                                + " " + forecast.getForecast()
                                .getSimpleforecast().getForecastday().get(0)
                                .getDate().getMonthnameShort());
                        mTvWeatherDescription.setText(forecast.getForecast()
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
                        mTvPressure.setText(hourly.getHourlyForecast().get(0).getMslp().getMetric());
                        mTvWeatherDescriptionShort.setText(hourly.getHourlyForecast().get(0).getWx());
                        mTvCurrentTemperature.setText(hourly.getHourlyForecast().get(0)
                                .getTemp().getMetric());
                        String icName;
                        if (hourly.getHourlyForecast().get(0)
                                .getIconUrl().contains("nt_")) {
                            icName = "file:///android_asset/images/nt_"
                                    + hourly.getHourlyForecast().get(0).getIcon() + ".png";
                        } else
                            icName = "file:///android_asset/images/"
                                    + hourly.getHourlyForecast().get(0).getIcon() + ".png";
                        Picasso.with(MainActivity.this)
                                .load(icName)
                                .error(R.drawable.ic_weather)
                                .into(mWeatherIcon);
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
                        GridElementAdapter gridElementAdapter = new GridElementAdapter(MainActivity.this,forecast10day);
                        mHorizontalList.setAdapter(gridElementAdapter);
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
                        mTvCityName.setText(cityName);
//                        mProgressBar.setVisibility(ProgressBar.INVISIBLE);
                    }
                });
    }

}

