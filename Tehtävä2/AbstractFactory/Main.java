package AbstractFactory;

public class Main {

    public static void main(String[] args) {
        Jasper jasper = puePäälle();
        jasper.luettele();
    }
    private static Jasper puePäälle(){
        Jasper jasper;
        VaateFactory factory;

        factory = new AdidasFactory();
        jasper = new Jasper(factory);
        return(jasper);
    }
}
