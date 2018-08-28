package com.example.demo.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service()
@Profile("test")
public class JakisBeanTest implements ProfilInterface {


    @Override
    public String nazwa() {
        return "TEST";
    }
}
