
package ua.ho.android.myweather.model.hourly;

import javax.annotation.Generated;
import javax.validation.Valid;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class HourlyForecast implements Parcelable
{

    @SerializedName("FCTTIME")
    @Expose
    @Valid
    private ua.ho.android.myweather.model.hourly.FCTTIME FCTTIME;
    @SerializedName("temp")
    @Expose
    @Valid
    private Temp temp;
    @SerializedName("dewpoint")
    @Expose
    @Valid
    private Dewpoint dewpoint;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("fctcode")
    @Expose
    private String fctcode;
    @SerializedName("sky")
    @Expose
    private String sky;
    @SerializedName("wspd")
    @Expose
    @Valid
    private Wspd wspd;
    @SerializedName("wdir")
    @Expose
    @Valid
    private Wdir wdir;
    @SerializedName("wx")
    @Expose
    private String wx;
    @SerializedName("uvi")
    @Expose
    private String uvi;
    @SerializedName("humidity")
    @Expose
    private String humidity;
    @SerializedName("windchill")
    @Expose
    @Valid
    private Windchill windchill;
    @SerializedName("heatindex")
    @Expose
    @Valid
    private Heatindex heatindex;
    @SerializedName("feelslike")
    @Expose
    @Valid
    private Feelslike feelslike;
    @SerializedName("qpf")
    @Expose
    @Valid
    private Qpf qpf;
    @SerializedName("snow")
    @Expose
    @Valid
    private Snow snow;
    @SerializedName("pop")
    @Expose
    private String pop;
    @SerializedName("mslp")
    @Expose
    @Valid
    private Mslp mslp;
    public final static Parcelable.Creator<HourlyForecast> CREATOR = new Creator<HourlyForecast>() {


        @SuppressWarnings({
            "unchecked"
        })
        public HourlyForecast createFromParcel(Parcel in) {
            HourlyForecast instance = new HourlyForecast();
            instance.FCTTIME = ((ua.ho.android.myweather.model.hourly.FCTTIME) in.readValue((FCTTIME.class.getClassLoader())));
            instance.temp = ((Temp) in.readValue((Temp.class.getClassLoader())));
            instance.dewpoint = ((Dewpoint) in.readValue((Dewpoint.class.getClassLoader())));
            instance.condition = ((String) in.readValue((String.class.getClassLoader())));
            instance.icon = ((String) in.readValue((String.class.getClassLoader())));
            instance.iconUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.fctcode = ((String) in.readValue((String.class.getClassLoader())));
            instance.sky = ((String) in.readValue((String.class.getClassLoader())));
            instance.wspd = ((Wspd) in.readValue((Wspd.class.getClassLoader())));
            instance.wdir = ((Wdir) in.readValue((Wdir.class.getClassLoader())));
            instance.wx = ((String) in.readValue((String.class.getClassLoader())));
            instance.uvi = ((String) in.readValue((String.class.getClassLoader())));
            instance.humidity = ((String) in.readValue((String.class.getClassLoader())));
            instance.windchill = ((Windchill) in.readValue((Windchill.class.getClassLoader())));
            instance.heatindex = ((Heatindex) in.readValue((Heatindex.class.getClassLoader())));
            instance.feelslike = ((Feelslike) in.readValue((Feelslike.class.getClassLoader())));
            instance.qpf = ((Qpf) in.readValue((Qpf.class.getClassLoader())));
            instance.snow = ((Snow) in.readValue((Snow.class.getClassLoader())));
            instance.pop = ((String) in.readValue((String.class.getClassLoader())));
            instance.mslp = ((Mslp) in.readValue((Mslp.class.getClassLoader())));
            return instance;
        }

        public HourlyForecast[] newArray(int size) {
            return (new HourlyForecast[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The FCTTIME
     */
    public ua.ho.android.myweather.model.hourly.FCTTIME getFCTTIME() {
        return FCTTIME;
    }

    /**
     * 
     * @param FCTTIME
     *     The FCTTIME
     */
    public void setFCTTIME(ua.ho.android.myweather.model.hourly.FCTTIME FCTTIME) {
        this.FCTTIME = FCTTIME;
    }

    /**
     * 
     * @return
     *     The temp
     */
    public Temp getTemp() {
        return temp;
    }

    /**
     * 
     * @param temp
     *     The temp
     */
    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    /**
     * 
     * @return
     *     The dewpoint
     */
    public Dewpoint getDewpoint() {
        return dewpoint;
    }

    /**
     * 
     * @param dewpoint
     *     The dewpoint
     */
    public void setDewpoint(Dewpoint dewpoint) {
        this.dewpoint = dewpoint;
    }

    /**
     * 
     * @return
     *     The condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * 
     * @param condition
     *     The condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 
     * @param iconUrl
     *     The icon_url
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * 
     * @return
     *     The fctcode
     */
    public String getFctcode() {
        return fctcode;
    }

    /**
     * 
     * @param fctcode
     *     The fctcode
     */
    public void setFctcode(String fctcode) {
        this.fctcode = fctcode;
    }

    /**
     * 
     * @return
     *     The sky
     */
    public String getSky() {
        return sky;
    }

    /**
     * 
     * @param sky
     *     The sky
     */
    public void setSky(String sky) {
        this.sky = sky;
    }

    /**
     * 
     * @return
     *     The wspd
     */
    public Wspd getWspd() {
        return wspd;
    }

    /**
     * 
     * @param wspd
     *     The wspd
     */
    public void setWspd(Wspd wspd) {
        this.wspd = wspd;
    }

    /**
     * 
     * @return
     *     The wdir
     */
    public Wdir getWdir() {
        return wdir;
    }

    /**
     * 
     * @param wdir
     *     The wdir
     */
    public void setWdir(Wdir wdir) {
        this.wdir = wdir;
    }

    /**
     * 
     * @return
     *     The wx
     */
    public String getWx() {
        return wx;
    }

    /**
     * 
     * @param wx
     *     The wx
     */
    public void setWx(String wx) {
        this.wx = wx;
    }

    /**
     * 
     * @return
     *     The uvi
     */
    public String getUvi() {
        return uvi;
    }

    /**
     * 
     * @param uvi
     *     The uvi
     */
    public void setUvi(String uvi) {
        this.uvi = uvi;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * 
     * @return
     *     The windchill
     */
    public Windchill getWindchill() {
        return windchill;
    }

    /**
     * 
     * @param windchill
     *     The windchill
     */
    public void setWindchill(Windchill windchill) {
        this.windchill = windchill;
    }

    /**
     * 
     * @return
     *     The heatindex
     */
    public Heatindex getHeatindex() {
        return heatindex;
    }

    /**
     * 
     * @param heatindex
     *     The heatindex
     */
    public void setHeatindex(Heatindex heatindex) {
        this.heatindex = heatindex;
    }

    /**
     * 
     * @return
     *     The feelslike
     */
    public Feelslike getFeelslike() {
        return feelslike;
    }

    /**
     * 
     * @param feelslike
     *     The feelslike
     */
    public void setFeelslike(Feelslike feelslike) {
        this.feelslike = feelslike;
    }

    /**
     * 
     * @return
     *     The qpf
     */
    public Qpf getQpf() {
        return qpf;
    }

    /**
     * 
     * @param qpf
     *     The qpf
     */
    public void setQpf(Qpf qpf) {
        this.qpf = qpf;
    }

    /**
     * 
     * @return
     *     The snow
     */
    public Snow getSnow() {
        return snow;
    }

    /**
     * 
     * @param snow
     *     The snow
     */
    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    /**
     * 
     * @return
     *     The pop
     */
    public String getPop() {
        return pop;
    }

    /**
     * 
     * @param pop
     *     The pop
     */
    public void setPop(String pop) {
        this.pop = pop;
    }

    /**
     * 
     * @return
     *     The mslp
     */
    public Mslp getMslp() {
        return mslp;
    }

    /**
     * 
     * @param mslp
     *     The mslp
     */
    public void setMslp(Mslp mslp) {
        this.mslp = mslp;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(FCTTIME);
        dest.writeValue(temp);
        dest.writeValue(dewpoint);
        dest.writeValue(condition);
        dest.writeValue(icon);
        dest.writeValue(iconUrl);
        dest.writeValue(fctcode);
        dest.writeValue(sky);
        dest.writeValue(wspd);
        dest.writeValue(wdir);
        dest.writeValue(wx);
        dest.writeValue(uvi);
        dest.writeValue(humidity);
        dest.writeValue(windchill);
        dest.writeValue(heatindex);
        dest.writeValue(feelslike);
        dest.writeValue(qpf);
        dest.writeValue(snow);
        dest.writeValue(pop);
        dest.writeValue(mslp);
    }

    public int describeContents() {
        return  0;
    }

}
