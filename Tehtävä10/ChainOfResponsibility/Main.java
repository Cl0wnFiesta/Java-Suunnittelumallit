public class Main {
    public static void main(String[] args) {
        Lahiesimies lahiesimies = new Lahiesimies();
        Paallikko paallikko = new Paallikko();
        CEO ceo = new CEO();

        lahiesimies.setHander(paallikko);
        paallikko.setHander(ceo);

        lahiesimies.handleRequest(new Raise(2, "I derserve this")); // Lähiesimies hyväksyy palkankorotuksen 2 %.
        lahiesimies.handleRequest(new Raise(4, "I derserve this")); // Päälikkö hyväksyy palkankorotuksen 4 %.
        lahiesimies.handleRequest(new Raise(7, "I derserve this")); // CEO hyväksyy palkankorotuksen 7 %.
        lahiesimies.handleRequest(new Raise(11, "I derserve this")); // CEO ei hyväksy palkankorotusta 11 %, korotus on liian iso.

    }
}
