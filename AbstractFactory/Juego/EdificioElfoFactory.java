package AbstractFactory.Juego;

public class EdificioElfoFactory implements EdificioFactory{

    @Override
    public Edificio crearEdificio() {
        return new Edificio();
    }



}
