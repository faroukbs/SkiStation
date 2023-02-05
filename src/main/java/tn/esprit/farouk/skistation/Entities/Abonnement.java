package tn.esprit.farouk.skistation.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numAbon;
    @Temporal(TemporalType.DATE)
    Date dateDebut;
    @Temporal(TemporalType.DATE)
    Date dateFin;
    Float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbonnement;




}
