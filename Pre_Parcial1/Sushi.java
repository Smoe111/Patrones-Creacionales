package Pre_Parcial1;

public class Sushi implements Restaurante {
    private String plato;
    private String bebida;

    public Sushi(String plato, String bebida){
        this.plato=plato;
        this.bebida=bebida;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Plato: "+ plato+ "bebida: "+ bebida);
    }
}
