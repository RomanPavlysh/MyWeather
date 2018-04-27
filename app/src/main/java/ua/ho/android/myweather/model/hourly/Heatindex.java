
package ua.ho.android.myweather.model.hourly;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Heatindex implements Parcelable
{

    @SerializedName("english")
    @Expose
    private String english;
    @SerializedName("metric")
    @Expose
    private String metric;
    public final static Parcelable.Creator<Heatindex> CREATOR = new Creator<Heatindex>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Heatindex createFromParcel(Parcel in) {
            Heatindex instance = new Heatindex();
            instance.english = ((String) in.readValue((String.class.getClassLoader())));
            instance.metric = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Heatindex[] newArray(int size) {
            return (new Heatindex[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The english
     */
    public String getEnglish() {
        return english;
    }

    /**
     * 
     * @param english
     *     The english
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * 
     * @return
     *     The metric
     */
    public String getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(english);
        dest.writeValue(metric);
    }

    public int describeContents() {
        return  0;
    }

}
