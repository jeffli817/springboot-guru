package guru.springframework.springdi.controllers.assignment4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"dev","EN"})
class Assignment4ControllerTestDev {
    @Autowired
    Assignment4Controller assignment4Controller;
    @Test
    void testDev(){
        System.out.println(assignment4Controller.returnEnv());
    }
}

@SpringBootTest
@ActiveProfiles({"qa","EN"})
class Assignment4ControllerTestQa {
    @Autowired
    Assignment4Controller assignment4Controller;
    @Test
    void testDev(){
        System.out.println(assignment4Controller.returnEnv());
    }
}

@SpringBootTest
@ActiveProfiles({"prod","EN"})
class Assignment4ControllerTestProd {
    @Autowired
    Assignment4Controller assignment4Controller;
    @Test
    void testDev(){
        System.out.println(assignment4Controller.returnEnv());
    }
}

@SpringBootTest
@ActiveProfiles({"uat","EN"})
class Assignment4ControllerTestUat {
    @Autowired
    Assignment4Controller assignment4Controller;
    @Test
    void testDev(){
        System.out.println(assignment4Controller.returnEnv());
    }
}

@SpringBootTest
class Assignment4ControllerTestDefault {
    @Autowired
    Assignment4Controller assignment4Controller;
    @Test
    void testDev(){
        System.out.println(assignment4Controller.returnEnv());
    }
}