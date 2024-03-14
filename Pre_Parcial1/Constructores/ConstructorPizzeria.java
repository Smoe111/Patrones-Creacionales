package Pre_Parcial1.Constructores;

import java.util.ArrayList;
import java.util.List;

import Pre_Parcial1.Modelos.Plato;

public class ConstructorPizzeria implements Platobuilder{

    private List<String> comida;
    private List<String> bebida;


    public ConstructorPizzeria(){
        this.comida= new ArrayList<>();
        this.bebida= new ArrayList<>();
    }

    
    public void bebida(List<String> bebida) {
        this.bebida=bebida;   
    }

    
    public void comida(List<String> comida) {
        this.comida=comida;
        
    }

    public Plato build(){
        Plato plato = new Plato();
        plato.setComida(comida);
        plato.setBebida(bebida);
        return plato;
    }
}
