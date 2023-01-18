package AbstractFactory;

public class AdidasFactory implements VaateFactory{
   
    @Override
    public Farkut pueFarkut() {
        return new Farkut();
    }
    @Override
    public Kenka pueKengät() {
        return new Kenka();
    }
    @Override
    public Lippis pueLippis() {
        return new Lippis();
    }
    @Override
    public Tpaita puePaita() {
        return new Tpaita();
    }
}
