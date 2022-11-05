package com.neogedom.exceptionhandling.controller;

import com.neogedom.exceptionhandling.exception.ExceptionResponse;
import com.neogedom.exceptionhandling.exception.InvalidCharacterException;
import com.neogedom.exceptionhandling.model.OlaMundo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {

    

    @GetMapping(value="/sum/{num1}/{num2}")
    public Integer Sum(@PathVariable Integer num1, @PathVariable Integer num2){
        return num1 + num2;
        
    }

    @GetMapping(value = "/{num}")
    public Integer sumInteger(@PathVariable Integer num1, @PathVariable Integer num2 ){
        if (num1 () .anyMatch num2()::isDigit) {
           num1 Integer = new num1 (num);
           num2 Integer = new num2 (num);
            return Sum(num1, num2).getSum();
        } else {
            throw new InvalidCharacterException("Não é permitido letras no número!");
        }
    }
}
