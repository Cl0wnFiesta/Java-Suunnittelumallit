public class CEO extends Handler {

    private final int RAISE_LIMIT = 5;

    @Override
    public void handleRequest(Raise raise) {
        if (raise.getAmount() >= RAISE_LIMIT && raise.getAmount() <= 10) {
            System.out.println("CEO accepts raise of " + raise.getAmount() + " %.");
        } else {
            System.out.println("CEO cannot accept raise of " + raise.getAmount() + " %. The raise is too high.");
        }
    }

}
