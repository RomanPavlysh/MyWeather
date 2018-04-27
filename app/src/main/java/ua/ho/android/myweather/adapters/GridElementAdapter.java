package ua.ho.android.myweather.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import rx.Observable;
import ua.ho.android.myweather.MainActivity;
import ua.ho.android.myweather.R;
import ua.ho.android.myweather.model.forecast10day.Forecast10day;
import ua.ho.android.myweather.model.forecast10day.Forecastday;

public class GridElementAdapter extends RecyclerView.Adapter<GridElementAdapter.SimpleViewHolder>{
    private Context context;
    private String weekDay,minTemp,maxTemp,icName;
    private Forecast10day forecast10day;

   // public static Observable<Forecast10day> forecast10dayObservable=null;
    public GridElementAdapter(@NonNull Context context, Forecast10day forecast10day) {
        this.context=context;
        this.forecast10day=forecast10day;
    }

    public static class SimpleViewHolder extends RecyclerView.ViewHolder {
        public final TextView mTvWeekDay;
        public final ImageView mIvItemIcoWeather;
        public final TextView mTvMaxTemp;
        public final TextView mTvMinTemp;
        public final RelativeLayout lLayout;

        public SimpleViewHolder(View view) {
            super(view);
            Typeface robotoit = Typeface.createFromAsset(view.getContext().getAssets(),
                    "font/Roboto-LightItalic.ttf");
            Typeface roboto = Typeface.createFromAsset(view.getContext().getAssets(),
                    "font/Roboto-Light.ttf");
            mTvWeekDay = (TextView) view.findViewById(R.id.tv_week_day);
            mTvWeekDay.setTypeface(roboto);
            mIvItemIcoWeather = (ImageView)view.findViewById(R.id.iv_item_ico_weather);
            mTvMaxTemp = (TextView) view.findViewById(R.id.tv_max_temp);
            mTvMaxTemp.setTypeface(robotoit);
            mTvMinTemp = (TextView) view.findViewById(R.id.tv_min_temp);
            mTvMinTemp.setTypeface(robotoit);
            lLayout=(RelativeLayout)view.findViewById(R.id.rl_item);
        }
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(this.context).inflate(R.layout.grid_element, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        int relativBackground = forecast10day.getForecast()
                .getSimpleforecast()
                .getForecastday().get(position)
                .getPeriod();
        if (relativBackground%2==0){
            holder.lLayout.setBackgroundColor(ContextCompat.getColor(context,R.color.colorDay));
        }else
            holder.lLayout.setBackgroundColor(ContextCompat.getColor(context,R.color.colorNight));
        weekDay =forecast10day.getForecast()
                .getSimpleforecast().getForecastday()
                .get(position).getDate().getWeekdayShort();
        maxTemp=forecast10day.getForecast()
                .getSimpleforecast().getForecastday().get(position).getHigh().getCelsius();
        minTemp = forecast10day.getForecast()
                .getSimpleforecast().getForecastday().get(position).getLow().getCelsius();
        icName = "file:///android_asset/images/"
                + forecast10day.getForecast()
                .getSimpleforecast().getForecastday().get(position).getIcon()+ ".png";;
        holder.mTvWeekDay.setText(weekDay);
        holder.mTvMaxTemp.setText(maxTemp+" °");
        holder.mTvMinTemp.setText(minTemp+" °");
        Picasso.with(context)
                .load(icName)
                .error(R.drawable.ic_weather)
                .into(holder.mIvItemIcoWeather);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return this.forecast10day.getForecast().getSimpleforecast().getForecastday().size();
    }
}
