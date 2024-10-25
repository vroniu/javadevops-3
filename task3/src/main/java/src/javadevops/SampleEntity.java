package src.javadevops;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sample")
public class SampleEntity {
    @Id
    private String data;
}
