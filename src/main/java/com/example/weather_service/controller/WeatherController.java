package com.example.weather_service.controller;

import com.example.weather_service.model.WeatherData;
import com.example.weather_service.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherData getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

    @PostMapping("/favorite-city")
    public String setFavoriteCity(@RequestBody Map<String, String> request) {
        String city = request.get("city");
        return "Cidade favorita definida para: " + city;
    }

    @GetMapping("/sobre")
    public Map<String, String> getSobre() {
        Map<String, String> sobre = new HashMap<>();
        sobre.put("estudante", "Gabriel Guzzatti");
        sobre.put("projeto", "Serviço de Meteorologia (Avaliação 02 de Backend)");
        return sobre;
    }
}
