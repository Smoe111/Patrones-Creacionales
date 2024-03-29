package AbstractFactory.Juego;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    
    public static void main(String[] args) {
        
        List <Personaje> personajes= new ArrayList<>();
        List <Edificio> edificios= new ArrayList<>();

        // se crea y agrega a la lista al personaje mago humano
        PersonajeFactory personajeHumano= new PersonajeHumanoFactory();
        Personaje mago= personajeHumano.crearPersonaje();
        personajes.add(mago);

        // se crea y agrega a la lista al personaje minero elfo
        PersonajeFactory personajeElfo= new PersonajeElfoFactory();
        Personaje minero= personajeElfo.crearPersonaje();
        personajes.add(minero);

        // se crea y agrega a la lista los edificios correspondientes 
        EdificioHumanoFactory edificioHumano= new EdificioHumanoFactory();
        Edificio castillo= edificioHumano.crearEdificio();
        edificios.add(castillo);

        EdificioElfoFactory edificioElfo= new EdificioElfoFactory();
        Edificio mina= edificioElfo.crearEdificio();
        edificios.add(mina);


    }


    
    
}
