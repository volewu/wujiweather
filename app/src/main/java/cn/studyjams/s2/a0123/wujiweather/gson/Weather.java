package cn.studyjams.s2.a0123.wujiweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 编写者： Wu
 * Time： 17-6-12.09:37
 * 内容：总信息
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
