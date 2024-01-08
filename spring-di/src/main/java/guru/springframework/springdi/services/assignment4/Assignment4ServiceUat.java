package guru.springframework.springdi.services.assignment4;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("assignment4Service")
public class Assignment4ServiceUat implements GreetingService {
    @Override
    public String sayGreeting() {
        return "UAT";
    }
}
