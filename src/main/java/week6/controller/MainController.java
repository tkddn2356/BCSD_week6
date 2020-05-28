package week6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start() {
        return "Main";
    }

    @RequestMapping(value = "/Main", method = RequestMethod.GET)
    public String home() {
        return "Main";
    }

}
