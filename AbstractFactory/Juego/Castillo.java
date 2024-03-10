package AbstractFactory.Juego;

public class Castillo implements Edificio{

    @Override
    public void producirUnidades() {

        System.out.println("El castillo produce un mago a la vez");
       
    }
    
}
