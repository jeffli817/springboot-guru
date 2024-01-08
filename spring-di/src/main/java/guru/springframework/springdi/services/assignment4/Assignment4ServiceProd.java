package guru.springframework.springdi.services.assignment4;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("assignment4Service")
public class Assignment4ServiceProd implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Prod";
    }
}
