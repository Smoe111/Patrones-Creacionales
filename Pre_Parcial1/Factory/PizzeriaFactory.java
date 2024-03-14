package Pre_Parcial1.Factory;

import Pre_Parcial1.Modelos.Pizzeria;
import Pre_Parcial1.Modelos.Restaurante;

public class PizzeriaFactory  implements RestauranteFactory{
    private String comida;
    private String bebida;

   

    public PizzeriaFactory(String comida, String bebida) {
        this.comida = comida;
        this.bebida = bebida;
    }



    @Override
    public Restaurante crearRestaurante() {
        return new Pizzeria(comida,bebida);
    }

    
}
