
package ua.ho.android.myweather.model.forecast;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Features implements Parcelable
{

    @SerializedName("forecast")
    @Expose
    private int forecast;
    public final static Parcelable.Creator<Features> CREATOR = new Creator<Features>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Features createFromParcel(Parcel in) {
            Features instance = new Features();
            instance.forecast = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public Features[] newArray(int size) {
            return (new Features[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The forecast
     */
    public int getForecast() {
        return forecast;
    }

    /**
     * 
     * @param forecast
     *     The forecast
     */
    public void setForecast(int forecast) {
        this.forecast = forecast;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(forecast);
    }

    public int describeContents() {
        return  0;
    }

}
