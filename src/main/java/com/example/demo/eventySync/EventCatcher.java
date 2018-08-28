package com.example.demo.eventySync;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;


@Service
public class EventCatcher {

    @EventListener
    void odbierz( PojoSync event ){
        System.out.println("---- listiner  +++++++++ zlapalem event SYNC: " + event.getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" +++++++++ skonczylem przerabiac event SYNC:  " + event.getName());
    }

}
