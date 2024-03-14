package Pre_Parcial1.Constructores.Modelos;

public class Sushi implements Restaurante {
    private String comida;
    private String bebida;

    public Sushi(String comida, String bebida){
        this.comida=comida;
        this.bebida=bebida;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Plato: "+ comida+ "bebida: "+ bebida);
    }
}
