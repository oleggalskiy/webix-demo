package my.edu.webixedu.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

}
