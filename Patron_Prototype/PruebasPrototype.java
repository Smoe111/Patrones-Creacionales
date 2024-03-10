package Patron_Prototype;

public class PruebasPrototype {
    public static void main(String[] args) {

        RegistroPrototype registroPrototype= new RegistroPrototype();
        RegistroPrototype.addPrototype("Prototipo2", new PrototipoConcreto("prototipo2"));        
        RegistroPrototype.addPrototype("Prototipo1", new PrototipoConcreto("prototipo1"));
    
        Prototype prototypeClonado1= registroPrototype.getPrototype("prototipe1");
        Prototype prototypeClonado2= registroPrototype.getPrototype("prototipo2");
    }
}
