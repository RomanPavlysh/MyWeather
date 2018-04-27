
package ua.ho.android.myweather.model.city;

import javax.annotation.Generated;
import javax.validation.Valid;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Viewport implements Parcelable
{

    @SerializedName("northeast")
    @Expose
    @Valid
    private Northeast_ northeast;
    @SerializedName("southwest")
    @Expose
    @Valid
    private Southwest_ southwest;
    public final static Parcelable.Creator<Viewport> CREATOR = new Creator<Viewport>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Viewport createFromParcel(Parcel in) {
            Viewport instance = new Viewport();
            instance.northeast = ((Northeast_) in.readValue((Northeast_.class.getClassLoader())));
            instance.southwest = ((Southwest_) in.readValue((Southwest_.class.getClassLoader())));
            return instance;
        }

        public Viewport[] newArray(int size) {
            return (new Viewport[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The northeast
     */
    public Northeast_ getNortheast() {
        return northeast;
    }

    /**
     * 
     * @param northeast
     *     The northeast
     */
    public void setNortheast(Northeast_ northeast) {
        this.northeast = northeast;
    }

    /**
     * 
     * @return
     *     The southwest
     */
    public Southwest_ getSouthwest() {
        return southwest;
    }

    /**
     * 
     * @param southwest
     *     The southwest
     */
    public void setSouthwest(Southwest_ southwest) {
        this.southwest = southwest;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(northeast);
        dest.writeValue(southwest);
    }

    public int describeContents() {
        return  0;
    }

}
