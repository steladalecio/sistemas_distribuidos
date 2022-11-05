package com.neogedom.tutorialget.resource;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.neogedom.tutorialget.model.Greeting;
import com.neogedom.tutorialget.service.GreetingService;

@RestController
@RequestMapping(value = "/greeting") // indica que o retorno será um objeto e não uma view HTML
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingService service;

    // Método GET com Path Param
    @GetMapping(value = "/{name}")
    public Greeting greetingPathParam(@PathVariable(value = "name") String name) {
       
        // Ao invés de um HTML (padrão em aplicações Web), envia apenas um JSON
        // Biblioteca Jackson embutida no Spring converte automaticamente Greeting para JSON
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

     // Método GET com Query Param
     @GetMapping
     public Greeting greetingQueryParam(@RequestParam(value = "name", defaultValue = "World") String name) {
        
         return new Greeting(counter.incrementAndGet(), String.format(template, name));
     }

     // Método POST com Body Params
     @PostMapping
     @ResponseStatus(HttpStatus.NO_CONTENT) // É possível predeterminar todos os Status Code lançados por um método
     public Greeting greetingPost (@RequestBody Greeting greeting) {
        
        // Ao chamar uma classe do pacote Service, estou efetivamente usando a arquitetura em camadas
        return service.create(greeting);
     }

}
