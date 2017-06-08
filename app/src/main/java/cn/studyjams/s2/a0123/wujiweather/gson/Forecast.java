package cn.studyjams.s2.a0123.wujiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 编写者： Wu
 * Time： 17-6-12.09:34
 * 内容：预测信息
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
