package Patron_Prototype;

public class PruebasPrototype {
    public static void main(String[] args) {

    // Crear instancia de prototipo

        Prototype prototypePersona1= new Persona("Sebas",20,10515616516);
    
    // Registro de prototipos   

        RegistroPrototype registroPrototype= new RegistroPrototype();
        registroPrototype.addPrototype("Persona 1",prototypePersona1);
               
        
    // Obtener clones del registro

        Prototype prototypeClonado1= registroPrototype.getPrototype("Persona1");
        
    // Verificar que el clon es diferente al original

        if(prototypeClonado1!= null){
            System.out.println("Copia persona 1: " + prototypeClonado1.getName() + ", Age: " + prototypeClonado1.getAge());
        }
        else{
            System.out.println("No se pudo clonar la persona");
        }        
    }
}
