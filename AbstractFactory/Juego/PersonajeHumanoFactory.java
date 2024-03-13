package AbstractFactory.Juego;

public class PersonajeHumanoFactory implements PersonajeFactory{

    @Override
    public Personaje crearPersonaje(){
        return new Personajes();
    }
        
    
}
