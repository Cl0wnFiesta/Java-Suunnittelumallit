package AbstractFactory;

import AbstractFactory.interfaces.Farkut;
import AbstractFactory.interfaces.Lippis;
import AbstractFactory.interfaces.Kenka;
import AbstractFactory.interfaces.Tpaita;

public class AdidasVaatteet extends VaateFactory {

    @Override
    public Farkut pueFarkut() {
        return new FarkutA();
    }

    @Override
    public Kenka pueKengät() {
        return new KenkaA();
    }

    @Override
    public Lippis pueLippis() {
        return new LippisA();
    }

    @Override
    public Tpaita puePaita() {
        return new TpaitaA();
    }
}
