import java.util.ArrayList;
import java.util.List;

import BurgerParts.Bun;
import BurgerParts.Cheese;
import BurgerParts.Lettuce;
import BurgerParts.Onion;
import BurgerParts.Patty;
import BurgerParts.Sauce;
import BurgerParts.Tomato;

public class HesburgerBuilder implements IBuilder{
    private HeseBurger burger;
    private List<Object> burgerParts;

    public HesburgerBuilder() {
        burgerParts = new ArrayList<>();
    }
    public void createBurger() {
        burger = new HeseBurger();
    }
    public void buildBun() {
        burgerParts.add(new Bun());
    }
    public void buildPatty() {
        burgerParts.add(new Patty());
    }
    public void buildCheese() {
        burgerParts.add(new Cheese());
    }
    public void buildLettuce() {
        burgerParts.add(new Lettuce());
    }
    public void buildTomato() {
        burgerParts.add(new Tomato());
    }
    public void buildOnion() {
        burgerParts.add(new Onion());
    }
    public void buildSauce() {
        burgerParts.add(new Sauce());
    }
    public HeseBurger getBurger() {
        return new HeseBurger(burgerParts);
    }
    
}
