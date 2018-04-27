
package ua.ho.android.myweather.model.hourly;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Features implements Parcelable
{

    @SerializedName("hourly")
    @Expose
    private int hourly;
    public final static Parcelable.Creator<Features> CREATOR = new Creator<Features>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Features createFromParcel(Parcel in) {
            Features instance = new Features();
            instance.hourly = ((int) in.readValue((int.class.getClassLoader())));
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
     *     The hourly
     */
    public int getHourly() {
        return hourly;
    }

    /**
     * 
     * @param hourly
     *     The hourly
     */
    public void setHourly(int hourly) {
        this.hourly = hourly;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(hourly);
    }

    public int describeContents() {
        return  0;
    }

}
