public class McDonaldsBuilder implements IBuilder {
    private McDonaldsBurger burger;
    private StringBuilder burgerParts;

    public McDonaldsBuilder() {
        burgerParts = new StringBuilder();
    }
    public void createBurger() {
        burger = new McDonaldsBurger();
    }
    public void buildBun() {
        burgerParts.append("Bun ");
    }
    public void buildPatty() {
        burgerParts.append("Patty ");
    }
    public void buildCheese() {
        burgerParts.append("Cheese ");
    }
    public void buildLettuce() {
        burgerParts.append("Lettuce ");
    }
    public void buildTomato() {
        burgerParts.append("Tomato ");
    }
    public void buildOnion() {
        burgerParts.append("Onion ");
    }
    public void buildSauce() {
        burgerParts.append("Sauce ");
    }
    public McDonaldsBurger getBurger() {
        return new McDonaldsBurger(burgerParts);
    }
    
}
    
