public class Umbreon implements IPokemonState {
    Pokemon p;
    Visitor v;
    public Umbreon(Visitor v, Pokemon p) {
        System.out.println("Eevee has evolved into Umbreon");
        this.v = v;
        this.p = p;
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Umbreon attacks");
        pokemon.setHealth(pokemon.getHealth() - 20);
        pokemon.setExp(pokemon.getExp() + 30);
    }
    
    @Override
    public void heal(Pokemon pokemon) {
        System.out.println("Umbreon heals");
        pokemon.setHealth(pokemon.getHealth() + 10);
        pokemon.setExp(pokemon.getExp() + 2);
    }
    
    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Umbreon blocks");
        pokemon.setExp(pokemon.getExp() + 2);
    }
    @Override
    public void visit(EvolutionVisitor visitor, Pokemon pokemon) {
        visitor.visit(this, pokemon);
    }

}
