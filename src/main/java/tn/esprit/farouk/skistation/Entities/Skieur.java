package tn.esprit.farouk.skistation.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSkieur;
    String nomS;
    String prenomS;
    @Temporal(TemporalType.DATE)
    Date dateNaissance;
    String ville;
    @OneToOne
    Abonnement abonnement;
    @ManyToMany
    Set<Piste>pistes;
    @OneToMany(mappedBy = "skieur" , cascade = CascadeType.REMOVE)
    Set<Inscription>inscriptions;
}
