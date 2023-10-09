package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.springframework.stereotype.*;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I`m in controller");

        return greetingService.sayGreeting();
    }

    public void afterInit() {
        System.out.println("## - AfterInit called by Bean Post Processor");
    }

    public void beforeInit() {
        System.out.println("## - BeforeInit called by Bean Post Processor");
    }
}
