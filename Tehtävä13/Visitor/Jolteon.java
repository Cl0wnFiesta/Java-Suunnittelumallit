public class Jolteon implements IPokemonState {
    
    public Jolteon() {
        System.out.println("Umbreon has evolved into Jolteon");
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Jolteon attacks");
        pokemon.setHealth(pokemon.getHealth() - 30);
        pokemon.setExp(pokemon.getExp() + 20);

    }

    @Override
    public void heal(Pokemon pokemon) {
        System.out.println("Jolteon heals");
        pokemon.setHealth(pokemon.getHealth() + 20);
    }

    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Jolteon blocks");
    }
    
    @Override
    public void accept(EvolutionVisitor visitor) {
        visitor.visit(this);
    }
}
