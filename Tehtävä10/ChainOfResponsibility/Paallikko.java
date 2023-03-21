public class Paallikko extends Handler {

    private final double RAISE_LIMIT = 4;

    @Override
    public void handleRequest(Raise raise) {
        if (raise.getAmount() <= RAISE_LIMIT) {
            System.out.println("Päälikkö hyväksyy palkankorotuksen " + raise.getAmount() + " %.");
        } else {
            System.out.println("Päälikkö ei voi hyväksyä palkankorotusta " + raise.getAmount() + " %.");
            super.handleRequest(raise);
        }
    }

}
