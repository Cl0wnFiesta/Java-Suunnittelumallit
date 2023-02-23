public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        for (int i = 0; i < 3; i++) {
            pokemon.attack();
            pokemon.heal();
            pokemon.block();
            pokemon.evolve();
            System.out.println("Current health: " + pokemon.getHealth());
        }
    }
}
