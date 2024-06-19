package hei.school.systemedepointage;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Salaire {
    private float salaireBrut;
    private float salaireNet;

    public Salaire(float salaireBrut) {
        this.salaireBrut = salaireBrut;
        this.salaireNet = calculerSalaireNet(salaireBrut);
    }

    public float calculerSalaireNet(float salaireBrut){
        salaireNet = salaireBrut - (salaireBrut * 20 / 100);
        return salaireNet;
    }
}
