package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SettleInjectedControllerTest {

    @Autowired
    SettleInjectedController setterInjectedController;
//    @BeforeEach
//    void setUp() {
//        setterInjectedController = new SettleInjectedController();
//        setterInjectedController.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void sayHello(){
        System.out.println(setterInjectedController.sayHello());
    }
}