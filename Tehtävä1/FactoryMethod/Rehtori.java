package FactoryMethod;

public class Rehtori extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Limsa();
    };

}
