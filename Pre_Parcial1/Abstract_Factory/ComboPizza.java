package Pre_Parcial1.Abstract_Factory;

import java.util.ArrayList;
import java.util.List;

import Pre_Parcial1.Modelos.Restaurante;

public class ComboPizza implements Combo {

    private List<Restaurante> comida=new ArrayList<>();
    private List<Restaurante> bebida=new ArrayList<>();
    private List<String> combo;

    public List<String> ComboPizza(){
        comida.add(new Pizza("pizza Grande"));
        comida.add(new Salad("Ensalada cesar"));
        bebida.add(new Bebida("Agua"));
        return ComboPizza();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Combo Pizzeria: " + ComboPizza() );

    }
    
}
