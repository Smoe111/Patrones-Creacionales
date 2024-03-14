package Pre_Parcial1;

public class SushiFactory implements RestauranteFactory {
    private String plato;
    private String bebida;

    public SushiFactory(String plato, String bebida){
        this.plato=plato;
        this.bebida=bebida;
    }

    @Override
    public Restaurante crearRestaurante(){
        return new Sushi(plato, bebida);
    }
    
}
