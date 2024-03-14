package AbstractFactory.Ejemplo2;

public class ModernTable implements Table{

    @Override
    public void mostrarInformacion(){
        System.out.println("Se ha creado mesa moderna");
    }
}
