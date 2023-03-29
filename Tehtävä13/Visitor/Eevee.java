
public class Eevee implements IPokemonState {

    Pokemon p;
    Visitor v;

    public Eevee(Visitor v, Pokemon p) {
        System.out.println("Eevee has been called to battle");
        this.v = v;
        this.p = p;
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Eevee attacks");
        pokemon.setHealth(pokemon.getHealth() - 10);
        pokemon.setExp(pokemon.getExp() + 10);
    }

    @Override
    public void heal(Pokemon pokemon) {
        System.out.println("Eevee heals");
        pokemon.setHealth(pokemon.getHealth() + 5);
        pokemon.setExp(pokemon.getExp() + 2);
    }

    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Eevee blocks");
        pokemon.setExp(pokemon.getExp() + 2);
    }
    @Override
    public void visit(EvolutionVisitor visitor, Pokemon pokemon) {
        visitor.visit(this, pokemon);
    }
}