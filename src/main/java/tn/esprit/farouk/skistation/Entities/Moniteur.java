package tn.esprit.farouk.skistation.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMonitor;
    String nomM;
    String prenomM;

    LocalDate dateRecru ;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Cours> cours;



}
