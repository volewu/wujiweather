package cn.studyjams.s2.a0123.wujiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 编写者： Wu
 * Time： 17-6-12.09:31
 * 内容：提示信息
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }

}
