package com.example.demo.profile;


import com.example.demo.profile.ProfilInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Set;

@RestController
@Validated
public class CosRestowego {


    @Autowired
    private ProfilInterface profil;

    @GetMapping(path="/p")
    public ResponseEntity pobierzBeanProfilowy()
    {

        String n = profil.nazwa();
        return ResponseEntity.status(HttpStatus.OK).body("OK  " + n);
    }

    @GetMapping(path="/s/{id}")
    public ResponseEntity pobierzPozycjeDoZmiany( @Size(min = 3 ,max=5)@PathVariable("id") String id)
    {

        String n = id;
        return ResponseEntity.status(HttpStatus.OK).body("OK  " + n);
    }

    @GetMapping(path="/i/{id}")
    public ResponseEntity pobier( @Min(11) @PathVariable("id") Integer id)
    {

        Integer n = id;
        return ResponseEntity.status(HttpStatus.OK).body("OK  " + n.toString());
    }


    @ExceptionHandler(value = { ConstraintViolationException.class })
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public String handleResourceNotFoundException(ConstraintViolationException e) {
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        StringBuilder strBuilder = new StringBuilder();
        for (ConstraintViolation<?> violation : violations ) {
            strBuilder.append(violation.getMessage() + "\n");
        }
        return strBuilder.toString();
    }

}
