public class Lahiesimies extends Handler {

    private final double RAISE_LIMIT = 2;

    @Override
    public void handleRequest(Raise raise) {
        if (raise.getAmount() <= RAISE_LIMIT) {
            System.out.println("Lähiesimies hyväksyy palkankorotuksen " + raise.getAmount() + " %.");
        } else {
            System.out.println("Lähiesimies ei voi hyväksyä palkankorotusta " + raise.getAmount() + " %.");
            super.handleRequest(raise);
        }
    }

}
