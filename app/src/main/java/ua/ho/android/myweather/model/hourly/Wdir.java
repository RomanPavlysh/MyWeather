
package ua.ho.android.myweather.model.hourly;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Wdir implements Parcelable
{

    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("degrees")
    @Expose
    private String degrees;
    public final static Parcelable.Creator<Wdir> CREATOR = new Creator<Wdir>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Wdir createFromParcel(Parcel in) {
            Wdir instance = new Wdir();
            instance.dir = ((String) in.readValue((String.class.getClassLoader())));
            instance.degrees = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Wdir[] newArray(int size) {
            return (new Wdir[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The dir
     */
    public String getDir() {
        return dir;
    }

    /**
     * 
     * @param dir
     *     The dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * 
     * @return
     *     The degrees
     */
    public String getDegrees() {
        return degrees;
    }

    /**
     * 
     * @param degrees
     *     The degrees
     */
    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(dir);
        dest.writeValue(degrees);
    }

    public int describeContents() {
        return  0;
    }

}
