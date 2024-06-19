package hei.school.systemedepointage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employe {
    private Personne personne;
    private int numeroMatricule;
    private Date dateDEmbauche;
    private Date dateFinContrat;
    private Salaire salaire;
    private Categorie categorie;
    private int heureSuplementaire;
}
