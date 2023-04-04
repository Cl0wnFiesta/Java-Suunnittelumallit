public class McDonaldsBurger {
    private StringBuilder parts;

    public McDonaldsBurger(StringBuilder burgerParts) {
        this.parts = burgerParts;
    }

    public McDonaldsBurger() {
    }

    public String toString() {
        return "McBurger is made of: " + parts.toString();
    }
    
}
