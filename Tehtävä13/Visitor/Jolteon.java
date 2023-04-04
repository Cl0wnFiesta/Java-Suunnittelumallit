public class Jolteon implements IPokemonState {
    Pokemon p;
    Visitor v;
    public Jolteon(Visitor v, Pokemon p) {
        System.out.println("Umbreon has evolved into Jolteon");
        this.v = v;
        this.p = p;
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
        pokemon.setExp(pokemon.getExp() + 2);
    }

    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Jolteon blocks");
        pokemon.setExp(pokemon.getExp() + 2);
    }
    @Override
    public void visit(EvolutionVisitor visitor, Pokemon pokemon) {
        visitor.visit(this, pokemon);
    }
}
