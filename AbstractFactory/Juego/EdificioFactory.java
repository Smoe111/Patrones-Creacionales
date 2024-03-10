package AbstractFactory.Juego;


//Fabrica abstracta de Edificio
public interface EdificioFactory {

   public Edificio crearEdificio(String tipoEdificio);
    
}
