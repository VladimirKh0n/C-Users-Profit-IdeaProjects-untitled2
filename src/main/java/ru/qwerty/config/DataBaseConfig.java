package ru.qwerty.datasurce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataBase {
    @Bean
    public Map<String, String> getDB (){
        return new HashMap<>();
    }
    @Bean
    public Map<String, String> getDB2 (){
        return new HashMap<>();
    }

}
