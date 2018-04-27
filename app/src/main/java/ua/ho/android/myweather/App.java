package ua.ho.android.myweather;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.ho.android.myweather.apiservise.GetResponseGeocodeService;
import ua.ho.android.myweather.apiservise.GetResponseService;


public class App extends Application {
    private Retrofit retrofit;
    private Retrofit retrofitGeocoding;
    private static GetResponseService response;
    private static GetResponseGeocodeService responseGeocoding;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit=new Retrofit.Builder()
                .baseUrl("http://api.wunderground.com/api/59fe6aff19a72516/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        retrofitGeocoding=new Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        response = retrofit.create(GetResponseService.class);
        responseGeocoding=retrofitGeocoding.create(GetResponseGeocodeService.class);
    }
    public static GetResponseService getApi(){
        return response;
    }
    public static GetResponseGeocodeService getGeoApi(){
        return responseGeocoding;
    }
}
