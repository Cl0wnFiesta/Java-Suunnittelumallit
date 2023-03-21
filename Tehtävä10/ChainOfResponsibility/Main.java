public class Main {
    public static void main(String[] args) {
        Lahiesimies lahiesimies = new Lahiesimies();
        Paallikko paallikko = new Paallikko();
        CEO ceo = new CEO();

        lahiesimies.setHander(paallikko);
        paallikko.setHander(ceo);

        lahiesimies.handleRequest(new Raise(4, "I derserve this"));
    }
}
