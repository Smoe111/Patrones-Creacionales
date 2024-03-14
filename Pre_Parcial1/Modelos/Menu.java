package Pre_Parcial1.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Plato> listaPlatos;
    PlatoDirector director;

    public Menu(){
        listaPlatos=new ArrayList<>();
    }

    public void adicionarPlatoPizzeria(List<String>comida,List<String> bebida){

        Pizzeria builder= new Pizzeria();
        director= new PlatoDirector(builder);
        director.Construct(comida, bebida);
        listaPlatos.add(builder.build());
    }
    

    public void adicionarPlato(Plato plato){
        listaPlatos.add(plato);
    }
}
