public class Director {
    private IBuilder burgerBuilder;
 
    public void setBurgerBuilder(IBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public void constructBurger() {
        burgerBuilder.createBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();
        burgerBuilder.buildLettuce();
        burgerBuilder.buildTomato();
        burgerBuilder.buildOnion();
        burgerBuilder.buildSauce();
    }
}
