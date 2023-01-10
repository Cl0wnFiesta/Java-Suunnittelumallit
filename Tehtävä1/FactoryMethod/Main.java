package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus rehtori = new Rehtori();
        AterioivaOtus lehtori = new Lehtori();
        opettaja.aterioi();
        rehtori.aterioi();
        lehtori.aterioi();
    }
}
