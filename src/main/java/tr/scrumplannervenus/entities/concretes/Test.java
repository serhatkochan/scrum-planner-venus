package tr.scrumplannervenus.entities.concretes;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "test")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String name;

    private String surname;
}
