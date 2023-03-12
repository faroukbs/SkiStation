package tn.esprit.farouk.skistation.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCours;
    Integer niveau;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    Support support;
    Float Prix;
    Integer creneau;
    @OneToMany(mappedBy = "cours" ,cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Inscription>inscriptions;

}
