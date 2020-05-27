package week6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import week6.service.Null;

@Controller
public class NullController {
    private Null testnull;

    @Autowired
    public void NullController(Null testnull) {
        this.testnull = testnull;
    }

    @RequestMapping(value = "/NullCheck", method = RequestMethod.GET)
    public String searchTest() {
        testnull.ThrowNull();
        return "NullCheck";
    }

}
