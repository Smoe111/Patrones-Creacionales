package AbstractFactory.Juego;

public class PersonajeHumano implements PersonajeFactory {

    @Override
    public Personaje crearPersonaje(String tipoPersonaje) {

        if ("mago".equalsIgnoreCase(tipoPersonaje)){
            return new Mago();
        }
        else if ("soldado".equalsIgnoreCase(tipoPersonaje)){
            return new Soldado();

        }
        else if("minero".equalsIgnoreCase(tipoPersonaje)){
            return new Soldado();
        }
    
        return null;
    }
    
}
