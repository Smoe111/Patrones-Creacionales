package Patron_Prototype;

class PrototipoConcreto implements Prototype {
    
    private String name;

    public PrototipoConcreto(String name){
        this.name = name;
    }
     
   
    @Override
    public Prototype clone(){
        return new PrototipoConcreto(this.name);
    }


    @Override
    public String getName() {
        return this.name;
    }  

}