package src.javadevops;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Sample entity.
 */
@Entity
@Table(name = "sample")
@Getter
@Setter
public class SampleEntity {
    /**
     * Automatically generated ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Data as a string.
     */
    private String data;
}
