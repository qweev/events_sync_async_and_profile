package com.example.demo.eventySync;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
public class JakisRestDoEventow {


    @Autowired
    private EventGenerator generator;

    @GetMapping(path="/eventySync")
    public ResponseEntity eventy()
    {


        for (int i = 0; i<10 ; i++){
            generator.wyslij("!!! ++ jakis nowy event numer " + i + " ++");
        }


        return ResponseEntity.status(HttpStatus.OK).body("OK  ");
    }



}
