package Pre_Parcial1;

public class Pizzeria implements Restaurante {
    private String plato;
    private String bebida;
    public  Pizzeria(String plato, String bebida){
        this.plato=plato;
        this.bebida= bebida;
    }

    @Override
    public void mostrarInformacion() {
       System.out.println("Plato: " + plato + "Bebida: " + bebida );
    }
    
}
