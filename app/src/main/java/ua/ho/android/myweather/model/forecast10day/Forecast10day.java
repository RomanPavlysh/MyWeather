
package ua.ho.android.myweather.model.forecast10day;

import javax.annotation.Generated;
import javax.validation.Valid;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Forecast10day implements Parcelable
{

    @SerializedName("response")
    @Expose
    @Valid
    private Response response;
    @SerializedName("forecast")
    @Expose
    @Valid
    private Forecast forecast;
    public final static Parcelable.Creator<Forecast10day> CREATOR = new Creator<Forecast10day>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Forecast10day createFromParcel(Parcel in) {
            Forecast10day instance = new Forecast10day();
            instance.response = ((Response) in.readValue((Response.class.getClassLoader())));
            instance.forecast = ((Forecast) in.readValue((Forecast.class.getClassLoader())));
            return instance;
        }

        public Forecast10day[] newArray(int size) {
            return (new Forecast10day[size]);
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
     *     The forecast
     */
    public Forecast getForecast() {
        return forecast;
    }

    /**
     * 
     * @param forecast
     *     The forecast
     */
    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(response);
        dest.writeValue(forecast);
    }

    public int describeContents() {
        return  0;
    }

}
