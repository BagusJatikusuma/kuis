package com.spacesale.controller.web;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bagus on 01/03/18.
 */
@Controller
public class LandingPageController {
    
    private final String HELLO_MESSAGE = "Hello World";

    @RequestMapping("/")
    public String getIndex(Map<String, Object> model) {
        model.put("message", this.HELLO_MESSAGE);
        return "index";
    }

}
