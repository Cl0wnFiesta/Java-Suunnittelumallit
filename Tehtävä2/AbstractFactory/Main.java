package AbstractFactory;

public class Main {

    public static void main(String[] args) {
        VaateFactory factory = new AdidasVaatteet();
        Jasper jasper = new Jasper();
        jasper.puePäälle(factory);
        jasper.luettele();
    }

}
