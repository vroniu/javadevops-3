package src.javadevops;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class DateResponse {
    private LocalDateTime currentTime;
}
