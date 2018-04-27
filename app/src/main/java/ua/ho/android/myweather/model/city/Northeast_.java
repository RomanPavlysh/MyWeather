
package ua.ho.android.myweather.model.city;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Northeast_ implements Parcelable
{

    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lng")
    @Expose
    private double lng;
    public final static Parcelable.Creator<Northeast_> CREATOR = new Creator<Northeast_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Northeast_ createFromParcel(Parcel in) {
            Northeast_ instance = new Northeast_();
            instance.lat = ((double) in.readValue((double.class.getClassLoader())));
            instance.lng = ((double) in.readValue((double.class.getClassLoader())));
            return instance;
        }

        public Northeast_[] newArray(int size) {
            return (new Northeast_[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(double lng) {
        this.lng = lng;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(lat);
        dest.writeValue(lng);
    }

    public int describeContents() {
        return  0;
    }

}
