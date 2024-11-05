package src.javadevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main Spring Boot app entry point.
 */
@SpringBootApplication
public final class JavadevopsApplication {
    private JavadevopsApplication() { }

    /**
     * Run the main app.
     * @param args arguments for the app
     */
    public static void main(final String[] args) {
        SpringApplication.run(JavadevopsApplication.class, args);
    }

}
