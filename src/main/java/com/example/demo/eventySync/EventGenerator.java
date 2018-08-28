package com.example.demo.eventySync;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventGenerator {

    @Autowired
    ApplicationEventPublisher publisher;

    public void wyslij(String s){
        System.out.println("+++++ publisher - wysylam event z contentem Pojo");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        publisher.publishEvent(new PojoSync(s));

    }

}
