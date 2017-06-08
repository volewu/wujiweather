package cn.studyjams.s2.a0123.wujiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 编写者： Wu
 * Time： 17-6-12.09:29
 * 内容：当前天气
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
