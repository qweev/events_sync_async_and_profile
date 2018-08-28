package com.example.demo.eventyAsync;


import com.example.demo.eventySync.PojoSync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventGeneratorAsync {

    @Autowired
    ApplicationEventPublisher publisher;

    public void wyslij(String s){
        System.out.println("+++++ wysylam event z Pojo");

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        publisher.publishEvent(new PojoAsync(s));

    }

}
