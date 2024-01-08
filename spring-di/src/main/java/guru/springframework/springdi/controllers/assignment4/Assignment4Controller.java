package guru.springframework.springdi.controllers.assignment4;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Assignment4Controller {

    private final GreetingService greetingService;

    public Assignment4Controller(@Qualifier("assignment4Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String returnEnv(){
        return greetingService.sayGreeting();
    }

}
