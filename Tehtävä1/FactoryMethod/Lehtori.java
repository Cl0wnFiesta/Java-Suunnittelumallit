package FactoryMethod;

public class Lehtori extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    };

}
