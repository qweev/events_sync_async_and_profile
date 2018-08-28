package com.example.demo.eventyAsync;

import com.example.demo.eventySync.PojoSync;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import sun.awt.windows.ThemeReader;


@Service
public class EventCatcherAsync {

    @Async
    @EventListener
    void odbierz( PojoAsync event ){
        System.out.println(" +++++++++ zlapalem event ASYNC:  " + event.getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" +++++++++ skonczylem przerabiac event ASYNC:  " + event.getName());
    }


}
