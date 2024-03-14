package AbstractFactory.Juego.Patron_Prototype;

interface Prototype  {

    Prototype clone();
    String getName();
    int getAge();
    String getDocumento();    
}
