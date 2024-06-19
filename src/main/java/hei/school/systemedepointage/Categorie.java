package hei.school.systemedepointage;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Categorie {
    private String nom;
    private final int heuresNormals;
    private int heuresSupplementaires;

    public boolean pouvoirFaireHeureSup(String nom){
        if (!nom.contains("Cadre Supérieur")){
            return true;
        };
        return false;
    }
}
