package AbstractFactory.Juego;

public class PersonajeElfoFactory implements PersonajeFactory{

    @Override
    public Personaje crearPersonaje() {
        return new Personaje();
    }
      
    
}
