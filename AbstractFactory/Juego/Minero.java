package AbstractFactory.Juego;

public class Minero implements Personaje{

    @Override
    public void atacar() {
        System.out.println("El minero ataca con su pico");
    }

    @Override
    public void mover() {
        System.out.println("Al minero le causa dificultad caminar");
    }
    
}
