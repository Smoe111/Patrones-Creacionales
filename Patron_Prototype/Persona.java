package Patron_Prototype;

public class Persona implements Prototype {

    String name;
    int age;
    String documento;
    
    public Persona(String name, int age, String documento) {
        this.name = name;
        this.age = age;
        this.documento= documento;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDocumento() {
        return this.documento;
    }


    @Override
    public Prototype clone() {
        return new Persona(this.name, this.age, this.documento);
    }

    @Override
    public int getAge() {
        return this.age;
    }    
}
