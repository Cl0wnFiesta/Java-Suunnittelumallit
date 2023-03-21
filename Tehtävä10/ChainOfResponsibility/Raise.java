
public class Raise {
    private int percentage;
    private String reason;

    public Raise(int percentage, String reason) {
        this.percentage = percentage;
        this.reason = reason;
    }

    public int getAmount() {
        return percentage;
    }

    public String getReason() {
        return reason;
    }
}
