package ru.qwerty.service.DB;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class DataBase {
    private final Map<String, String> getDB;

    public void add(String x, String y){
        getDB.put(x, y);
    } // возвращает новый хэшмап?

    public String get (String x){
        return getDB.get(x);
    }

    public void remove (String x){
        getDB.remove(x);
    }

}
