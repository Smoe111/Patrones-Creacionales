package Pre_Parcial1.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Plato  {
    private List<String> comida;
    private List<String> bebida;

    public Plato(){
        this.comida= new ArrayList<>();
        this.bebida= new ArrayList<>();
    }


    public List<String> getComida() {
        return comida;
    }

    public  void setComida(List<String> comida) {
        this.comida = comida;
    }

    public List<String> getBebida() {
        return bebida;
    }

    public void setBebida(List<String> bebida) {
        this.bebida = bebida;
    }

    
    
}
