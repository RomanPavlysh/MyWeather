
package ua.ho.android.myweather.model.hourly;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class FCTTIME implements Parcelable
{

    @SerializedName("hour")
    @Expose
    private String hour;
    @SerializedName("hour_padded")
    @Expose
    private String hourPadded;
    @SerializedName("min")
    @Expose
    private String min;
    @SerializedName("min_unpadded")
    @Expose
    private String minUnpadded;
    @SerializedName("sec")
    @Expose
    private String sec;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("mon")
    @Expose
    private String mon;
    @SerializedName("mon_padded")
    @Expose
    private String monPadded;
    @SerializedName("mon_abbrev")
    @Expose
    private String monAbbrev;
    @SerializedName("mday")
    @Expose
    private String mday;
    @SerializedName("mday_padded")
    @Expose
    private String mdayPadded;
    @SerializedName("yday")
    @Expose
    private String yday;
    @SerializedName("isdst")
    @Expose
    private String isdst;
    @SerializedName("epoch")
    @Expose
    private String epoch;
    @SerializedName("pretty")
    @Expose
    private String pretty;
    @SerializedName("civil")
    @Expose
    private String civil;
    @SerializedName("month_name")
    @Expose
    private String monthName;
    @SerializedName("month_name_abbrev")
    @Expose
    private String monthNameAbbrev;
    @SerializedName("weekday_name")
    @Expose
    private String weekdayName;
    @SerializedName("weekday_name_night")
    @Expose
    private String weekdayNameNight;
    @SerializedName("weekday_name_abbrev")
    @Expose
    private String weekdayNameAbbrev;
    @SerializedName("weekday_name_unlang")
    @Expose
    private String weekdayNameUnlang;
    @SerializedName("weekday_name_night_unlang")
    @Expose
    private String weekdayNameNightUnlang;
    @SerializedName("ampm")
    @Expose
    private String ampm;
    @SerializedName("tz")
    @Expose
    private String tz;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("UTCDATE")
    @Expose
    private String UTCDATE;
    public final static Parcelable.Creator<FCTTIME> CREATOR = new Creator<FCTTIME>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FCTTIME createFromParcel(Parcel in) {
            FCTTIME instance = new FCTTIME();
            instance.hour = ((String) in.readValue((String.class.getClassLoader())));
            instance.hourPadded = ((String) in.readValue((String.class.getClassLoader())));
            instance.min = ((String) in.readValue((String.class.getClassLoader())));
            instance.minUnpadded = ((String) in.readValue((String.class.getClassLoader())));
            instance.sec = ((String) in.readValue((String.class.getClassLoader())));
            instance.year = ((String) in.readValue((String.class.getClassLoader())));
            instance.mon = ((String) in.readValue((String.class.getClassLoader())));
            instance.monPadded = ((String) in.readValue((String.class.getClassLoader())));
            instance.monAbbrev = ((String) in.readValue((String.class.getClassLoader())));
            instance.mday = ((String) in.readValue((String.class.getClassLoader())));
            instance.mdayPadded = ((String) in.readValue((String.class.getClassLoader())));
            instance.yday = ((String) in.readValue((String.class.getClassLoader())));
            instance.isdst = ((String) in.readValue((String.class.getClassLoader())));
            instance.epoch = ((String) in.readValue((String.class.getClassLoader())));
            instance.pretty = ((String) in.readValue((String.class.getClassLoader())));
            instance.civil = ((String) in.readValue((String.class.getClassLoader())));
            instance.monthName = ((String) in.readValue((String.class.getClassLoader())));
            instance.monthNameAbbrev = ((String) in.readValue((String.class.getClassLoader())));
            instance.weekdayName = ((String) in.readValue((String.class.getClassLoader())));
            instance.weekdayNameNight = ((String) in.readValue((String.class.getClassLoader())));
            instance.weekdayNameAbbrev = ((String) in.readValue((String.class.getClassLoader())));
            instance.weekdayNameUnlang = ((String) in.readValue((String.class.getClassLoader())));
            instance.weekdayNameNightUnlang = ((String) in.readValue((String.class.getClassLoader())));
            instance.ampm = ((String) in.readValue((String.class.getClassLoader())));
            instance.tz = ((String) in.readValue((String.class.getClassLoader())));
            instance.age = ((String) in.readValue((String.class.getClassLoader())));
            instance.UTCDATE = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public FCTTIME[] newArray(int size) {
            return (new FCTTIME[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The hour
     */
    public String getHour() {
        return hour;
    }

    /**
     * 
     * @param hour
     *     The hour
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * 
     * @return
     *     The hourPadded
     */
    public String getHourPadded() {
        return hourPadded;
    }

    /**
     * 
     * @param hourPadded
     *     The hour_padded
     */
    public void setHourPadded(String hourPadded) {
        this.hourPadded = hourPadded;
    }

    /**
     * 
     * @return
     *     The min
     */
    public String getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * 
     * @return
     *     The minUnpadded
     */
    public String getMinUnpadded() {
        return minUnpadded;
    }

    /**
     * 
     * @param minUnpadded
     *     The min_unpadded
     */
    public void setMinUnpadded(String minUnpadded) {
        this.minUnpadded = minUnpadded;
    }

    /**
     * 
     * @return
     *     The sec
     */
    public String getSec() {
        return sec;
    }

    /**
     * 
     * @param sec
     *     The sec
     */
    public void setSec(String sec) {
        this.sec = sec;
    }

    /**
     * 
     * @return
     *     The year
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The mon
     */
    public String getMon() {
        return mon;
    }

    /**
     * 
     * @param mon
     *     The mon
     */
    public void setMon(String mon) {
        this.mon = mon;
    }

    /**
     * 
     * @return
     *     The monPadded
     */
    public String getMonPadded() {
        return monPadded;
    }

    /**
     * 
     * @param monPadded
     *     The mon_padded
     */
    public void setMonPadded(String monPadded) {
        this.monPadded = monPadded;
    }

    /**
     * 
     * @return
     *     The monAbbrev
     */
    public String getMonAbbrev() {
        return monAbbrev;
    }

    /**
     * 
     * @param monAbbrev
     *     The mon_abbrev
     */
    public void setMonAbbrev(String monAbbrev) {
        this.monAbbrev = monAbbrev;
    }

    /**
     * 
     * @return
     *     The mday
     */
    public String getMday() {
        return mday;
    }

    /**
     * 
     * @param mday
     *     The mday
     */
    public void setMday(String mday) {
        this.mday = mday;
    }

    /**
     * 
     * @return
     *     The mdayPadded
     */
    public String getMdayPadded() {
        return mdayPadded;
    }

    /**
     * 
     * @param mdayPadded
     *     The mday_padded
     */
    public void setMdayPadded(String mdayPadded) {
        this.mdayPadded = mdayPadded;
    }

    /**
     * 
     * @return
     *     The yday
     */
    public String getYday() {
        return yday;
    }

    /**
     * 
     * @param yday
     *     The yday
     */
    public void setYday(String yday) {
        this.yday = yday;
    }

    /**
     * 
     * @return
     *     The isdst
     */
    public String getIsdst() {
        return isdst;
    }

    /**
     * 
     * @param isdst
     *     The isdst
     */
    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    /**
     * 
     * @return
     *     The epoch
     */
    public String getEpoch() {
        return epoch;
    }

    /**
     * 
     * @param epoch
     *     The epoch
     */
    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    /**
     * 
     * @return
     *     The pretty
     */
    public String getPretty() {
        return pretty;
    }

    /**
     * 
     * @param pretty
     *     The pretty
     */
    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    /**
     * 
     * @return
     *     The civil
     */
    public String getCivil() {
        return civil;
    }

    /**
     * 
     * @param civil
     *     The civil
     */
    public void setCivil(String civil) {
        this.civil = civil;
    }

    /**
     * 
     * @return
     *     The monthName
     */
    public String getMonthName() {
        return monthName;
    }

    /**
     * 
     * @param monthName
     *     The month_name
     */
    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    /**
     * 
     * @return
     *     The monthNameAbbrev
     */
    public String getMonthNameAbbrev() {
        return monthNameAbbrev;
    }

    /**
     * 
     * @param monthNameAbbrev
     *     The month_name_abbrev
     */
    public void setMonthNameAbbrev(String monthNameAbbrev) {
        this.monthNameAbbrev = monthNameAbbrev;
    }

    /**
     * 
     * @return
     *     The weekdayName
     */
    public String getWeekdayName() {
        return weekdayName;
    }

    /**
     * 
     * @param weekdayName
     *     The weekday_name
     */
    public void setWeekdayName(String weekdayName) {
        this.weekdayName = weekdayName;
    }

    /**
     * 
     * @return
     *     The weekdayNameNight
     */
    public String getWeekdayNameNight() {
        return weekdayNameNight;
    }

    /**
     * 
     * @param weekdayNameNight
     *     The weekday_name_night
     */
    public void setWeekdayNameNight(String weekdayNameNight) {
        this.weekdayNameNight = weekdayNameNight;
    }

    /**
     * 
     * @return
     *     The weekdayNameAbbrev
     */
    public String getWeekdayNameAbbrev() {
        return weekdayNameAbbrev;
    }

    /**
     * 
     * @param weekdayNameAbbrev
     *     The weekday_name_abbrev
     */
    public void setWeekdayNameAbbrev(String weekdayNameAbbrev) {
        this.weekdayNameAbbrev = weekdayNameAbbrev;
    }

    /**
     * 
     * @return
     *     The weekdayNameUnlang
     */
    public String getWeekdayNameUnlang() {
        return weekdayNameUnlang;
    }

    /**
     * 
     * @param weekdayNameUnlang
     *     The weekday_name_unlang
     */
    public void setWeekdayNameUnlang(String weekdayNameUnlang) {
        this.weekdayNameUnlang = weekdayNameUnlang;
    }

    /**
     * 
     * @return
     *     The weekdayNameNightUnlang
     */
    public String getWeekdayNameNightUnlang() {
        return weekdayNameNightUnlang;
    }

    /**
     * 
     * @param weekdayNameNightUnlang
     *     The weekday_name_night_unlang
     */
    public void setWeekdayNameNightUnlang(String weekdayNameNightUnlang) {
        this.weekdayNameNightUnlang = weekdayNameNightUnlang;
    }

    /**
     * 
     * @return
     *     The ampm
     */
    public String getAmpm() {
        return ampm;
    }

    /**
     * 
     * @param ampm
     *     The ampm
     */
    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    /**
     * 
     * @return
     *     The tz
     */
    public String getTz() {
        return tz;
    }

    /**
     * 
     * @param tz
     *     The tz
     */
    public void setTz(String tz) {
        this.tz = tz;
    }

    /**
     * 
     * @return
     *     The age
     */
    public String getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 
     * @return
     *     The UTCDATE
     */
    public String getUTCDATE() {
        return UTCDATE;
    }

    /**
     * 
     * @param UTCDATE
     *     The UTCDATE
     */
    public void setUTCDATE(String UTCDATE) {
        this.UTCDATE = UTCDATE;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(hour);
        dest.writeValue(hourPadded);
        dest.writeValue(min);
        dest.writeValue(minUnpadded);
        dest.writeValue(sec);
        dest.writeValue(year);
        dest.writeValue(mon);
        dest.writeValue(monPadded);
        dest.writeValue(monAbbrev);
        dest.writeValue(mday);
        dest.writeValue(mdayPadded);
        dest.writeValue(yday);
        dest.writeValue(isdst);
        dest.writeValue(epoch);
        dest.writeValue(pretty);
        dest.writeValue(civil);
        dest.writeValue(monthName);
        dest.writeValue(monthNameAbbrev);
        dest.writeValue(weekdayName);
        dest.writeValue(weekdayNameNight);
        dest.writeValue(weekdayNameAbbrev);
        dest.writeValue(weekdayNameUnlang);
        dest.writeValue(weekdayNameNightUnlang);
        dest.writeValue(ampm);
        dest.writeValue(tz);
        dest.writeValue(age);
        dest.writeValue(UTCDATE);
    }

    public int describeContents() {
        return  0;
    }

}
