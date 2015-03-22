package com.example.user.weathercat1;

import android.content.Context;
import android.location.Location;
import android.util.JsonToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import android.R;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONTokener;

//import andriod.R;

//import com.ssaurel.tinyweather.R;

/**
 * Created by User on 3/19/2015.
 * Created using online tutorial "[Andriod] How to create a weather app - Part 3 - Current Weather"
 */
public class GatherWeather {

    private static final String CURRENT_WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&mode=json&lang=%s";
    private static final String CURRENT_WEATHER_LOCATION_URL = "http://api.openweathermap.org/data/2.5/weather?lat=%s$lon=%s&units=metric&mode=json&lang=%s";

    public static String loadCurrentWeather(Context context, String city)
    {
        return load(context, CURRENT_WEATHER_URL, city);
    }

    private static String load(Context context, String currentWeatherUrl, String city)
    {
        String data = null;
        BufferedReader reader = null;

        try
        {
            URL url = new URL(String.format(currentWeatherUrl, null)); //context.getString(R.string.code_language) 7:30 part 3
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String tmp = "";

            //while((tmp = reader.readLine()) != null)
            //{
                //json.append(tmp).append("\n");
            //}

            //data = json.toString();
        }
        catch (Exception E)
        {

        }

        finally
        {
            if(reader != null)
            {
                try
                {
                    reader.close();
                }
                catch (Exception E)
                {

                }
            }
        }

        return null; //todo
    }

    public static String loadCurrentWeatherLocation(Context context, Location location) {
        return load(context, CURRENT_WEATHER_LOCATION_URL, location);
    }

    private static String load(Context context, String currentWeatherUrl, Location location)
    {
        return null; //todo
    }
}
