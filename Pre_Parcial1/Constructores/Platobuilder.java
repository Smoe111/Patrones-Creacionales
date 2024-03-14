package Pre_Parcial1.Constructores;

import java.util.List;

import Pre_Parcial1.Constructores.Modelos.Plato;

public interface Platobuilder {
    void comida(List<String> comida);
    void bebida(List<String> bebida);
    Plato build();    
}
