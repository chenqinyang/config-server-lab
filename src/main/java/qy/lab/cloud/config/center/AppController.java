package qy.lab.cloud.config.center;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
//	@Value("${config.name}")
//	String name = "World";

    @RequestMapping("/hello")
    public String hello() {
        String name = "QY";
        return "Hello " + name;
    }
}
