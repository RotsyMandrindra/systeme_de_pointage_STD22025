package hei.school.systemedepointage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Personne {
    private String nom;
    private String prenoms;
    private Date dateDeNaissance;
}
