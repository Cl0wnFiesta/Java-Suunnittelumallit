import java.util.List;

public class HeseBurger {
    protected List<Object> parts;

    public HeseBurger(List<Object> parts) {
        this.parts = parts;
    }

    public HeseBurger() {
    }

    public String toString() {
        // Method returns a string that contains all of the parts of the burger
        // that have been added.
        String burger = "Hese Burger is made of: ";
        for (Object part : parts) {
            burger += part + " ";
        }
        return burger;
    }

}
