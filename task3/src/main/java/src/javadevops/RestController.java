package src.javadevops;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@Slf4j
public class RestController {

    @Autowired
    SampleEntityRepository sampleEntityRepository;

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

    @GetMapping("/entity")
    public List<SampleEntity> getAllEntities() {
        return sampleEntityRepository.findAll();
    }

    @PostMapping("/entity")
    public SampleEntity createEntity(@RequestBody SampleEntity entity) {
        return sampleEntityRepository.save(entity);
    }
}

