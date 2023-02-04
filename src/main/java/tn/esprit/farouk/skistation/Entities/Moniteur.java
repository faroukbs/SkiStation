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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue
    Long numMonitor;
    String nomM;
    String prenomM;
    @Temporal(TemporalType.DATE)
    Date dateRecru ;

    @OneToMany
    Set<Cours> cours;


}
