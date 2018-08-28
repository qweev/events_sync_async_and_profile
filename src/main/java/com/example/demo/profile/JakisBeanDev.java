package com.example.demo.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service()
@Profile("dev")
public class JakisBeanDev implements ProfilInterface {


    @Override
    public String nazwa() {
        return "DEV";
    }
}
