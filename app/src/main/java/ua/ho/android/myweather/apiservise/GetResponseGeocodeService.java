package ua.ho.android.myweather.apiservise;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import ua.ho.android.myweather.model.city.GetCity;

public interface GetResponseGeocodeService {
    @GET("maps/api/geocode/json?")
    Observable<GetCity> getCity(@Query("latlng") String latlng,@Query("language") String language,@Query("key") String key);
}
