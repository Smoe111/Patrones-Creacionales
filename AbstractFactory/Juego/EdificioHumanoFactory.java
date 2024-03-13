package AbstractFactory.Juego;

public class EdificioHumanoFactory  implements EdificioFactory{

    @Override
    public Edificio crearEdificio(){
        return new Edificio();
    }

        
    
}
