
package ua.ho.android.myweather.model.forecast;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class QpfDay implements Parcelable
{

    @SerializedName("in")
    @Expose
    private double in;
    @SerializedName("mm")
    @Expose
    private int mm;
    public final static Parcelable.Creator<QpfDay> CREATOR = new Creator<QpfDay>() {


        @SuppressWarnings({
            "unchecked"
        })
        public QpfDay createFromParcel(Parcel in) {
            QpfDay instance = new QpfDay();
            instance.in = ((double) in.readValue((double.class.getClassLoader())));
            instance.mm = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public QpfDay[] newArray(int size) {
            return (new QpfDay[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The in
     */
    public double getIn() {
        return in;
    }

    /**
     * 
     * @param in
     *     The in
     */
    public void setIn(double in) {
        this.in = in;
    }

    /**
     * 
     * @return
     *     The mm
     */
    public int getMm() {
        return mm;
    }

    /**
     * 
     * @param mm
     *     The mm
     */
    public void setMm(int mm) {
        this.mm = mm;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(in);
        dest.writeValue(mm);
    }

    public int describeContents() {
        return  0;
    }

}
