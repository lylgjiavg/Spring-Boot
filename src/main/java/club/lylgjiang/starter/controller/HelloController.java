package club.lylgjiang.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description Spring Boot Hello World
 * @Date 2019/10/11 9:24
 * @Created by Jiavg
 */

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello() {
        
        return "Hello World";
    }
    
}
