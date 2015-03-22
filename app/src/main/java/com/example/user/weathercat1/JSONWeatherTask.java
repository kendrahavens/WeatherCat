package com.example.user.weathercat1;

import org.json.JSONException;

/**
 * Created by User on 3/22/2015.
 */

//Referenced Surviving With Andriod
public class JSONWeatherTask {

    protected Weather doInBackground(String... params) {
        Weather weather = new Weather();
        String data = ( (new WeatherClient()).getWeatherData(params[0]));

        //try {
           //weather = getWeather(data);
            // Let's retrieve the icon
           // weather.iconData = ( (new WeatherClient()).getImage(weather.currentCondition.getIcon()));

        //} catch (JSONException e) {
         //   e.printStackTrace();
        //}
        //return weather;
        return null;
    }
}
