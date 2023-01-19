package AbstractFactory;

import AbstractFactory.interfaces.Farkut;
import AbstractFactory.interfaces.Lippis;
import AbstractFactory.interfaces.Kenka;
import AbstractFactory.interfaces.Tpaita;

public class BossVaatteet extends VaateFactory{

    @Override
    public Farkut pueFarkut() {
        return new FarkutB();
    }
    @Override
    public Kenka pueKengät() {
        return new KenkaB();
    }
    @Override
    public Lippis pueLippis() {
        return new LippisB();
    }
    @Override
    public Tpaita puePaita() {
        return new TpaitaB();
    }
}
