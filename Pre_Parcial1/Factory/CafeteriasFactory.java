package Pre_Parcial1.Factory;

import Pre_Parcial1.Constructores.Modelos.Cafeteria;
import Pre_Parcial1.Constructores.Modelos.Restaurante;

public class CafeteriasFactory implements RestauranteFactory{

    private String comida;
    private String bebida;

    public CafeteriasFactory(String comida, String bebida){
        this.comida=comida;
        this.bebida=bebida;

    }

    @Override
    public Restaurante crearRestaurante(){
        return new Cafeteria(comida,bebida);
    }
}
