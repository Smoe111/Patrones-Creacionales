package Pre_Parcial1.Modelos;

public class Pizzeria implements Restaurante {
    private String comida;
    private String bebida;

    public  Pizzeria(String comida, String bebida){
        this.comida=comida;
        this.bebida= bebida;
    }

    @Override
    public void mostrarInformacion() {
       System.out.println("Plato: " + comida + "Bebida: " + bebida );
    }
    
}
