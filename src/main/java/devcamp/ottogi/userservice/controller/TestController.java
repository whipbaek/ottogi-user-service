package devcamp.ottogi.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class TestController {

    @GetMapping("/hello")
    public String test(){
        return "hello user service!";
    }
}
