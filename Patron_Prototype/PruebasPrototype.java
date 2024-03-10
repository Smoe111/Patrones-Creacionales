package Patron_Prototype;

public class PruebasPrototype {
    public static void main(String[] args) {

        Prototype prototype1= new PrototipoConcreto("Prototipo1");
        Prototype prototype2= new PrototipoConcreto("Prototipo1");

        RegistroPrototype registroPrototype= new RegistroPrototype();
        registroPrototype.addPrototype("Prototipo1",prototype1);
        registroPrototype.addPrototype("Prototipo2",prototype2);        
        
    
        Prototype prototypeClonado1= registroPrototype.getPrototype("prototipo1");
        Prototype prototypeClonado2= registroPrototype.getPrototype("prototipo2");
    
        if(prototypeClonado1!= null && prototypeClonado2 !=null){

            System.out.println("Copia Protoripo 1: " + prototypeClonado1.getName());
            System.out.println("copia protoripo 2: " + prototypeClonado2.getName());
        }
        else{
            System.out.println("No se pudieron clonar los prototipos");
        }        
    }
}
