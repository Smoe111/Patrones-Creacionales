package AbstractFactory.Juego;

//Implementaciones concretas de Edificio
public class Mina implements Edificio {

    @Override
    public void producirUnidades() {
        System.out.println("La mina produce un minero a la vez");
    
    }
}

