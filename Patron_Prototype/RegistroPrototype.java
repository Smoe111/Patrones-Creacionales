package Patron_Prototype;

import java.util.HashMap;
import java.util.Map;

class RegistroPrototype{

    private Map<String,Prototype> prototypes;

    public RegistroPrototype() {
        this.prototypes= new HashMap<>();
    }

    public void addPrototype( String key, Prototype prototype){
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key){
        return prototypes.get(key).clone();
    }

}