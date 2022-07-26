package ru.qwerty.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.qwerty.service.DB.DataBase;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    private final DataBase dataBase;

    public Controller( DataBase dataBase){
        this.dataBase = dataBase;
    }

//    Map<String, String> map = new HashMap<>();
    @PostMapping (value = "/add")
    public ResponseEntity <String> add(@RequestParam(value = "name") String x, @RequestParam(value = "num") String y){
        dataBase.add(x,y);
        return ResponseEntity.status(200).body("успешно добавлено");
    }

    @GetMapping (value = "/hello")
    public ResponseEntity <String> sayHello(){
        return ResponseEntity.status(200).body("hello world");
    }
    @GetMapping (value = "/hello/{id}")
    public ResponseEntity <String> qqq(@PathVariable int id){
        return ResponseEntity.status(200).body(id + "");
    }
    @GetMapping (value = "/get")
    public ResponseEntity <String> get(@RequestParam(value = "name") String x){
        String result = dataBase.get(x);
        if(result != null){
            return ResponseEntity.status(200).body(result);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("not found");
        }
    }
    @PutMapping (value = "/change")
    public ResponseEntity <String> put (@RequestParam(value = "name") String x, @RequestParam(value = "num") String y){
        dataBase.add(x,y);
        return ResponseEntity.status(200).body("успешно изменено");
    }
    @DeleteMapping (value = "/delete/{name}")
    public ResponseEntity <String> delete (@PathVariable String name){
        if(dataBase.get(name) != null){
            dataBase.remove(name);
            return ResponseEntity.status(200).body("удалено");
        }
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("not found");
    }
}
