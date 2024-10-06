package com.example.weather_service.service;

import com.example.weather_service.model.WeatherData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    public WeatherData getWeather(String cityName) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);

        Map<String, Object> main = (Map<String, Object>) response.get("main");
        List<Map<String, Object>> weather = (List<Map<String, Object>>) response.get("weather");

        WeatherData weatherData = new WeatherData();
        weatherData.setCity(cityName);
        weatherData.setTemperature((Double) main.get("temp"));
        weatherData.setDescription((String) weather.get(0).get("description"));

        return weatherData;
    }
}
