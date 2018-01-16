package com.example.xkw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xkw on 2018/1/15.
 */

public class Now
{
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
