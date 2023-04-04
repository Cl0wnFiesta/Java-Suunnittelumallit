public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Build a McDonalds burger

        IBuilder burgerBuilder = new McDonaldsBuilder();
        director.setBurgerBuilder(burgerBuilder);
        director.constructBurger();
        McDonaldsBurger burger = (McDonaldsBurger) burgerBuilder.getBurger();
        System.out.println(burger);

        // Build a Hesburger burger

        IBuilder heseBuilder = new HesburgerBuilder();
        director.setBurgerBuilder(heseBuilder);
        director.constructBurger();
        HeseBurger heseBurger = (HeseBurger) heseBuilder.getBurger();
        System.out.println(heseBurger);

    }
    
}
