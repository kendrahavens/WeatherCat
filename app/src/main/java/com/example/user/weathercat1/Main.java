package com.example.user.weathercat1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import static com.example.user.weathercat1.WeatherLocation.createObject;
import static com.example.user.weathercat1.WeatherLocation.getObject;
import static com.example.user.weathercat1.WeatherLocation.getString;
import static com.example.user.weathercat1.WeatherLocation.getSysObj;
import static com.example.user.weathercat1.WeatherLocation.getCoordObj;
import static com.example.user.weathercat1.WeatherLocation.getFloat;
import static com.example.user.weathercat1.WeatherLocation.getInt;

/**
 * Created by User on 3/20/2015.
 */
public class Main {

    //test info for Norman
    static float testValue;
    static JSONObject sysObj = getSysObj();
    static WeatherLocation testLocation = new WeatherLocation();
    static Weather testWeather;
    static JSONObject coordObj = getCoordObj();

    //public static getWeather()
    static JSONTokener data;

    public static JSONObject createObject(JSONTokener data1) {

        //The root JSon object

        try

        {
            JSONObject jObj1 = new JSONObject(data1);
            return jObj1;
        }

        catch(JSONException e1)

        {
            e1.printStackTrace();
        }

        return null;

    }

    static JSONObject jObj = createObject(data);

    //set Latitude and Longitude
    static {
        try {
            testLocation.setLatitude(getFloat("lat", coordObj));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            testLocation.setLongitude(getFloat("lon", coordObj));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    //set Country and City
    static {
        try {
            testLocation.setCountry(getString("country", sysObj));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            testLocation.setCity(getString("name", sysObj));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    //set Sunrise and Sunset
    static {
        try {
            testLocation.setSunrise(getInt("sunrisey", sysObj));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            testLocation.setSunset(getInt("sunset", sysObj));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    //set the Test Location
    static {
        testWeather.location=testLocation;
    }

    // We get weather info (This is an array)
    public static JSONArray createJArray() {
        try {
            JSONArray jArr1 = jObj.getJSONArray("weather");
            return jArr1;
        } catch (JSONException e) {
            e.printStackTrace();
        }
       return null;
    }

    static JSONArray jArr = createJArray();

    static {
        // We use only the first value
        JSONObject JSONWeather = null;
        try {
            JSONWeather = jArr.getJSONObject(0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //testWeather.currentCondition.setWeatherId(getInt("id", JSONWeather));
        //testWeather.currentCondition.setDescr(getString("description", JSONWeather));
        //testWeather.currentCondition.setCondition(getString("main", JSONWeather));
        //testWeather.currentCondition.setIcon(getString("icon", JSONWeather));

        JSONObject mainObj = null;
        try {
            mainObj = getObject("main", jObj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //testWeather.currentCondition.setHumidity(getInt("humidity", mainObj));
        //testWeather.currentCondition.setPressure(getInt("pressure", mainObj));
        //testWeather.temperature.setMaxTemp(getFloat("temp_max", mainObj));
        //testWeather.temperature.setMinTemp(getFloat("temp_min", mainObj));
        //testWeather.temperature.setTemp(getFloat("temp", mainObj));

        // Wind
        //JSONObject wObj = getObject("wind", jObj);
        //testWeather.wind.setSpeed(getFloat("speed", wObj));
//        testWeather.wind.setDeg(getFloat("deg", wObj));

        // Clouds
  //      JSONObject cObj = getObject("clouds", jObj);
    //    weather.clouds.setPerc(getInt("all", cObj));



    }
}//end of class
