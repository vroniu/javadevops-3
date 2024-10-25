package src.javadevops;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sample")
public class SampleEntity {
    private String data;
}
