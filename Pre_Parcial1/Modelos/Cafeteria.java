package Pre_Parcial1.Modelos;

public class Cafeteria implements Restaurante {

    private String comida;
    private String bebida;

    public Cafeteria(String comida, String bebida){
        this.comida=comida;
        this.bebida=bebida;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Plato: "+ comida+ "Bebida: "+ bebida);
    }

}
