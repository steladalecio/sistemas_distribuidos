package com.neogedom.tutorialget.service;

import org.springframework.stereotype.Service;

import com.neogedom.tutorialget.model.Greeting;

@Service
public class GreetingService {
    
    public Greeting create(Greeting greeting) {
        System.out.println("Teste de Criação: " + greeting);
        return greeting;
    }
}
