
package ua.ho.android.myweather.model.forecast;

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
public class TxtForecast implements Parcelable
{

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("forecastday")
    @Expose
    @Valid
    private List<Forecastday> forecastday = new ArrayList<Forecastday>();
    public final static Parcelable.Creator<TxtForecast> CREATOR = new Creator<TxtForecast>() {


        @SuppressWarnings({
            "unchecked"
        })
        public TxtForecast createFromParcel(Parcel in) {
            TxtForecast instance = new TxtForecast();
            instance.date = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.forecastday, (ua.ho.android.myweather.model.forecast.Forecastday.class.getClassLoader()));
            return instance;
        }

        public TxtForecast[] newArray(int size) {
            return (new TxtForecast[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The forecastday
     */
    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    /**
     * 
     * @param forecastday
     *     The forecastday
     */
    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(date);
        dest.writeList(forecastday);
    }

    public int describeContents() {
        return  0;
    }

}
