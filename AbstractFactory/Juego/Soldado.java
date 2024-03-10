package AbstractFactory.Juego;


public class Soldado implements Personaje{

    @Override
    public void atacar() {
        System.out.println("El soldado ataca con su espada");
    }

    @Override
    public void mover() {
       System.out.println("EL soldado se desplaza rapidamente");
    }
    
}
