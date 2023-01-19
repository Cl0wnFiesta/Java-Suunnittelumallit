package AbstractFactory;

import AbstractFactory.interfaces.Farkut;
import AbstractFactory.interfaces.Lippis;
import AbstractFactory.interfaces.Kenka;
import AbstractFactory.interfaces.Tpaita;

public interface VaateFactory {
    public abstract Tpaita puePaita();
    public abstract Farkut pueFarkut();
    public abstract Lippis pueLippis();
    public abstract Kenka pueKengät();
}
