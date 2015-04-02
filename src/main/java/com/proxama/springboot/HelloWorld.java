package com.proxama.springboot;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jon Vallet
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/rest/hello")
    Map<String, Object> home() {

        Map<String, Object> json = new HashMap<>();

        json.put("name", "Jon");
        json.put("Message", "Hello.");
        json.put("age", 36);

        return json;
    }
}
