package src.javadevops;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Rest controller with the sample endpoints.
 */
@org.springframework.web.bind.annotation.RestController
@Slf4j
public final class RestController {

    /**
     * Repository for the entities.
     */
    @Autowired
    private SampleEntityRepository sampleEntityRepository;

    /**
     * Value fetched from properties.
     */
    @Value("${devops}")
    private String devops;

    /**
     * Get test string.
     * @return string with the devops variable
     */
    @GetMapping("/test")
    public String getTest() {
        log.info("Returning test response with property value {}", devops);
        return "Hello from " + devops + "!";
    }

    /**
     * Greet the user.
     * @param name user to be greeted
     * @return greeting
     */
    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable final String name) {
        log.info("Returning greeting for {}", name);
        return "Hello, " + name + "!";
    }

    /**
     * Get the current date.
     * @return response with the current data
     */
    @GetMapping("/date")
    public DateResponse getCurrentDate() {
        log.info("Returning response with current date");
        return new DateResponse(LocalDateTime.now());
    }

    /**
     * Get all the sample entities.
     * @return list of all entities
     */
    @GetMapping("/entity")
    public List<SampleEntity> getAllEntities() {
        return sampleEntityRepository.findAll();
    }

    /**
     * Add a new sample entity.
     * @param entity entity to be added
     * @return created entity
     */
    @PostMapping("/entity")
    public SampleEntity createEntity(@RequestBody final SampleEntity entity) {
        return sampleEntityRepository.save(entity);
    }
}

