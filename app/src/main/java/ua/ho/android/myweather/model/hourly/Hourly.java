
package ua.ho.android.myweather.model.hourly;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Hourly implements Parcelable
{

    @SerializedName("response")
    @Expose
    @Valid
    private Response response;
    @SerializedName("hourly_forecast")
    @Expose
    @Valid
    private List<HourlyForecast> hourlyForecast = new ArrayList<HourlyForecast>();
    public final static Parcelable.Creator<Hourly> CREATOR = new Creator<Hourly>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Hourly createFromParcel(Parcel in) {
            Hourly instance = new Hourly();
            instance.response = ((Response) in.readValue((Response.class.getClassLoader())));
            in.readList(instance.hourlyForecast, (ua.ho.android.myweather.model.hourly.HourlyForecast.class.getClassLoader()));
            return instance;
        }

        public Hourly[] newArray(int size) {
            return (new Hourly[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * 
     * @return
     *     The hourlyForecast
     */
    public List<HourlyForecast> getHourlyForecast() {
        return hourlyForecast;
    }

    /**
     * 
     * @param hourlyForecast
     *     The hourly_forecast
     */
    public void setHourlyForecast(List<HourlyForecast> hourlyForecast) {
        this.hourlyForecast = hourlyForecast;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(response);
        dest.writeList(hourlyForecast);
    }

    public int describeContents() {
        return  0;
    }

}
