package cn.studyjams.s2.a0123.wujiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 编写者： Wu
 * Time： 17-6-12.09:13
 * 内容：基本的信息
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
