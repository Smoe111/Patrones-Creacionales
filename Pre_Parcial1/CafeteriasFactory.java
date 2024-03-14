package Pre_Parcial1;

public class CafeteriasFactory implements RestauranteFactory{

    private String plato;
    private String bebida;

    public CafeteriasFactory(String plato, String bebida){
        this.plato=plato;
        this.bebida=bebida;

    }

    @Override
    public Restaurante crearRestaurante(){
        return new Cafeteria(plato,bebida);
    }
}
