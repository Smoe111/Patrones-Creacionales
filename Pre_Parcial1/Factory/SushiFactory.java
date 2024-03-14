package Pre_Parcial1.Factory;

import Pre_Parcial1.Constructores.Modelos.Restaurante;
import Pre_Parcial1.Constructores.Modelos.Sushi;

public class SushiFactory implements RestauranteFactory {
    private String comida;
    private String bebida;

    public SushiFactory(String comida, String bebida){
        this.comida=comida;
        this.bebida=bebida;
    }

    @Override
    public Restaurante crearRestaurante(){
        return new Sushi(comida, bebida);
    }
    
}
