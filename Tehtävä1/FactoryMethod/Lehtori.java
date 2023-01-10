package factorymethod;

public class Lehtori extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    };

}
