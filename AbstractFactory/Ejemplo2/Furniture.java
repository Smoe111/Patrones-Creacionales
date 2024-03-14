package AbstractFactory.Ejemplo2;

public class Furniture  {
    private Chair chair;
    private Table table;

    public Furniture(FurnitureFactory factory){

        chair=factory.createChair();
        table=factory.createTable();
    }    
}
