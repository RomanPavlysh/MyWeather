
package ua.ho.android.myweather.model.forecast;

import javax.annotation.Generated;
import javax.validation.Valid;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Forecast implements Parcelable
{

    @SerializedName("response")
    @Expose
    @Valid
    private Response response;
    @SerializedName("forecast")
    @Expose
    @Valid
    private Forecast_ forecast;
    public final static Parcelable.Creator<Forecast> CREATOR = new Creator<Forecast>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Forecast createFromParcel(Parcel in) {
            Forecast instance = new Forecast();
            instance.response = ((Response) in.readValue((Response.class.getClassLoader())));
            instance.forecast = ((Forecast_) in.readValue((Forecast_.class.getClassLoader())));
            return instance;
        }

        public Forecast[] newArray(int size) {
            return (new Forecast[size]);
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
    public Forecast_ getForecast() {
        return forecast;
    }

    /**
     * 
     * @param forecast
     *     The forecast
     */
    public void setForecast(Forecast_ forecast) {
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
