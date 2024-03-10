package AbstractFactory.Juego;

public class Barraca implements Edificio {

    @Override
    public void producirUnidades() {

        System.out.println("La barraca produce un soldado a la vez");
    }
    
}
