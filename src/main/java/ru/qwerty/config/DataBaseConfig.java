package ru.qwerty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataBaseConfig {
    @Bean
    public Map<String, String> getDB (){
        return new HashMap<>();
    }


}
