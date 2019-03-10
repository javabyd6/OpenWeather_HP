package pl.sda.openWeather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openWeather.model.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author perczynski
 */
public class WeatherService {
    public static Weather getCityWeather(String city) throws MalformedURLException
    {
        ObjectMapper mapper = new ObjectMapper();
        String apiKey = "key=3e11d5ea24914379b62120104191003";
        URL finalURL = new URL("http://api.apixu.com/v1/current.json?"+apiKey+"&q="+city);
        Weather pogoda = null;
        try
        {
            pogoda = mapper.readValue(finalURL, Weather.class);
        } catch(IOException e)
        {
            e.printStackTrace();
        }
        return pogoda;
    }

}
