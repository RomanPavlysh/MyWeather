package ua.ho.android.myweather.apiservise;


import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import ua.ho.android.myweather.model.forecast.Forecast;
import ua.ho.android.myweather.model.forecast10day.Forecast10day;
import ua.ho.android.myweather.model.hourly.Hourly;

public interface GetResponseService {

    @GET("forecast/{lang}/q/{ltlg}")
    Observable<Forecast> getForecastData(@Path("lang") String lang, @Path("ltlg") String ltlg);
    @GET("hourly/{lang}/q/{ltlg}")
    Observable<Hourly> getHourlyData(@Path("lang") String lang, @Path("ltlg") String ltlg);
    @GET("forecast10day/{lang}/q/{ltlg}")
    Observable<Forecast10day>getForecast10Day(@Path("lang") String lang, @Path("ltlg") String ltlg );
}
