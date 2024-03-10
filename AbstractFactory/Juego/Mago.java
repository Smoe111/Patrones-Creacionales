package AbstractFactory.Juego;

//Especifican los metodos abstractos
public class Mago implements Personaje{

    @Override
    public void atacar() {
        System.out.println("El mago ataca con un hechizo");
    }

    @Override
    public void mover() {
      System.out.println(" El mago se mueve a una velocidad promedio");
    }


}
