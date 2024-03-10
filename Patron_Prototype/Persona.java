package Patron_Prototype;

public class Persona implements Prototype {

    String name;
    int age;
    
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Prototype clone() {
        return new Persona(this.name, this.age);
    } 

    public int getAge() {
        return this.age;
    }
    
}
