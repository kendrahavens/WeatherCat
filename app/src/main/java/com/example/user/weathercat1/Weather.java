package com.example.user.weathercat1;

import android.location.Location;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Created by User on 3/19/2015.
 */



public class Weather extends Main{

    public WeatherLocation location;
    public String currentCondition;

    //private static final String CURRENT_WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?q=norman,us";

    public Weather()
    {
    }

    public void setLocation(WeatherLocation location1)
    {
        this.location = location1;
    }
    public void setCurrentCondition(String currentCondition1)
    {
        this.currentCondition = currentCondition1;
    }


}
