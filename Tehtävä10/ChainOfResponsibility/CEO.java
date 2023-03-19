public class CEO extends Handler {

    private final double RAISE_LIMIT = 50;


    @Override
    public void handleRequest(Raise raise) {
        if (raise.getAmount() <= RAISE_LIMIT ) {
            System.out.println("CEO accepts raise of " + raise.getAmount() + " %.");
        } else {
            System.out.println("CEO cannot accept raise of " + raise.getAmount() + " %.");
        }
    }
    
}
