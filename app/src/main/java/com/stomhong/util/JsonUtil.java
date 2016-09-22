package com.stomhong.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * @author StomHong
 * @since 2016-5-17
 */
public class JsonUtil {

    public static String toJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);

    }

    public static void parseJson(String json, Object object) {
        Gson gson = new Gson();
        Type type = new TypeToken<Object>() {}.getType();
        gson.fromJson(json, type);
    }
}
