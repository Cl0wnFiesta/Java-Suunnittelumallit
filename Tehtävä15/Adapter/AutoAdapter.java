public class AutoAdapter implements LeluRekka {
    private HenkilöAuto auto;
    public AutoAdapter(HenkilöAuto auto) {
        this.auto = auto;
    }
    public void työnnä() {
        auto.kerroNopeus();
    }
}
