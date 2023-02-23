public class Umbreon implements IPokemonState {
    public Umbreon() {
        System.out.println("Eevee has evolved into Umbreon");
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Umbreon attacks");
        pokemon.setHealth(pokemon.getHealth() - 20);
    }

    @Override
    public void heal(Pokemon pokemon) {
        System.out.println("Umbreon heals");
        pokemon.setHealth(pokemon.getHealth() + 10);
    }

    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Umbreon blocks");
    }

}
