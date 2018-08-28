package com.example.demo.eventyAsync;


import com.example.demo.eventySync.EventGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JakisRestDoEventowAsync {


    @Autowired
    private EventGeneratorAsync generator;

    @GetMapping(path="/eventyAsync")
    public ResponseEntity eventy()
    {

        for (int i = 0; i<10 ; i++){
            generator.wyslij("!!! ++ jakis nowy event numer " + i + " ++");
        }
        return ResponseEntity.status(HttpStatus.OK).body("OK  ");
    }




}
