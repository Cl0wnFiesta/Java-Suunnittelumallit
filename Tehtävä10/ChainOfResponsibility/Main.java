public class Main {
    public static void main(String[] args) {
        Handler lahiesimies = new Lahiesimies();
        Handler paallikko = new Paallikko();
        Handler ceo = new CEO();

        lahiesimies.setHander(paallikko);
        paallikko.setHander(ceo);

        lahiesimies.handleRequest(new Raise(4, "I derserve this"));
    }
}
