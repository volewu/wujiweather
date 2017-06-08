package cn.studyjams.s2.a0123.wujiweather.gson;

/**
 * 编写者： Wu
 * Time： 17-6-12.09:16
 * 内容：空气指数与 pm2.5
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
