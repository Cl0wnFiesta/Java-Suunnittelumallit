public abstract class Handler {
    private Handler successor;

    public void setHander(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Raise raise) {
        if (successor != null) {
            successor.handleRequest(raise);
        }
    }
}
