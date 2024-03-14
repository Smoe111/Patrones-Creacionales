package Pre_Parcial1.Modelos;

import java.util.List;

public class Pizzeria implements Restaurante {
    private List<String> comida;
    private List<String> bebida;

    public  Pizzeria(List<String> comida, List<String> bebida){
        this.comida=comida;
        this.bebida= bebida;
    }

    @Override
    public void mostrarInformacion() {
       System.out.println("Plato: " + comida + "Bebida: " + bebida );
    }

    
    
}
