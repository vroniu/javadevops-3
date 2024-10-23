package src.javadevops;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
@Slf4j
public class RestController {

    @Value("${devops}")
    private String devops;

    @GetMapping("/test")
    public String getTest() {
        log.info("Returning test response with property value {}", devops);
        return "Hello from " + devops + "!";
    }

    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable String name) {
        log.info("Returning greeting for {}", name);
        return "Hello, " + name + "!";
    }

    @GetMapping("/date")
    public DateResponse getCurrentDate() {
        log.info("Returning response with current date");
        return new DateResponse(LocalDateTime.now());
    }
}

