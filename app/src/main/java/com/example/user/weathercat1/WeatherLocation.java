package com.example.user.weathercat1;

import android.location.Location;
import android.util.JsonReader;
import android.util.JsonToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

import java.io.BufferedReader;

/**
 * Created by User on 3/19/2015.
 */
public class WeatherLocation extends Weather {

    public float latitude;
    public float longitude;
    public int sunrise;
    public int sunset;
    public String country;
    public String city;

    public void setLatitude(float lat)
    {
        this.latitude = lat;
    }
    public void setLongitude(float longitude1)
    {
        this.longitude = longitude1;
    }
    public void setCountry(String country1)
    {
        this.country = country1;
    }
    public void setCity(String city1)
    {
        this.city = city1;
    }
    public void setSunset(int sunset1)
    {
        this.sunset = sunset1;
    }
    public void setSunrise(int sunrise1)
    {
        this.sunrise = sunrise1;
    }

    public WeatherLocation()
    {
    }

        public static JSONObject getCoordObj() {

        try

        {
            JSONObject coordObj1 = jObj.getJSONObject("coord"); //created in Weather class
            return coordObj1;
        } catch (JSONException e1)

        {
            e1.printStackTrace();
        }

        return null;
    }

    public static JSONObject getSysObj() {

        try

        {
            JSONObject sysObj1 = jObj.getJSONObject("sys"); //created in Weather class
            return sysObj1;
        } catch (JSONException e1)

        {
            e1.printStackTrace();
        }

        return null;
    }

    //the following 4 methods are used from http://www.survivingwithandroid.com/2013/05/build-weather-app-json-http-android.html#sthash.Ni3xmJuI.dpuf
    public static JSONObject getObject(String tagName, JSONObject jObj)  throws JSONException {
        JSONObject subObj = jObj.getJSONObject(tagName);
        return subObj;
    }

    public static String getString(String tagName, JSONObject jObj) throws JSONException {
        return jObj.getString(tagName);
    }

    public static float  getFloat(String tagName, JSONObject jObj) throws JSONException {
        return (float) jObj.getDouble(tagName);
    }

    public static int  getInt(String tagName, JSONObject jObj) throws JSONException {
        return jObj.getInt(tagName);
    }

}
//}