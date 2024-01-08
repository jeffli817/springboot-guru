package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
