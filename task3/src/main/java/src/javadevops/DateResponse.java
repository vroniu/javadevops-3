package src.javadevops;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Response with the current date time.
 */
@Data
@AllArgsConstructor
public class DateResponse {
    /**
     * The current date time.
     */
    private LocalDateTime currentTime;
}
