package AbstractFactory;

public class Main {

    public static void main(String[] args) {
        VaateFactory factory;

        factory = new BossVaatteet();
        Jasper jasper = new Jasper();
        jasper.puePäälle(factory);
        jasper.luettele();
        //jasper.pueFarkut(factory);
        //jasper.pueLippis(factory);
        //jasper.pueKengät(factory);
        //jasper.pueTpaita(factory);
    }

}
