package Pre_Parcial1;


public class PizzeriaFactory  implements RestauranteFactory{
    private String plato;
    private String bebida;

   

    public PizzeriaFactory(String plato, String bebida) {
        this.plato = plato;
        this.bebida = bebida;
    }



    @Override
    public Restaurante crearRestaurante() {
        return new Pizzeria(plato,bebida);
    }

    
}
