package Pre_Parcial1.Constructores;

import java.util.List;

import Pre_Parcial1.Modelos.Plato;

class PlatoDirector{
    private PlatoDirector builder;

    public PlatoDirector(PlatoDirector builder){
        this.builder=builder;
    }

    public Plato construct(List<String> comida, List<String> bebida){

        builder.comida(comida);
        builder.bebida(bebida);
        return builder.build();
    }

    private Plato build() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'build'");
    }

    private void bebida(List<String> bebida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bebida'");
    }

    private void comida(List<String> comida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comida'");
    }
}