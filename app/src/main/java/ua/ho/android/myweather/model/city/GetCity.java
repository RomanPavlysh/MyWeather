
package ua.ho.android.myweather.model.city;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GetCity implements Parcelable
{

    @SerializedName("results")
    @Expose
    @Valid
    private List<Result> results = new ArrayList<Result>();
    @SerializedName("status")
    @Expose
    private String status;
    public final static Parcelable.Creator<GetCity> CREATOR = new Creator<GetCity>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GetCity createFromParcel(Parcel in) {
            GetCity instance = new GetCity();
            in.readList(instance.results, (ua.ho.android.myweather.model.city.Result.class.getClassLoader()));
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public GetCity[] newArray(int size) {
            return (new GetCity[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(results);
        dest.writeValue(status);
    }

    public int describeContents() {
        return  0;
    }

}
