
public class Eevee implements IPokemonState {

    public Eevee() {
        System.out.println("Eevee has been called to battle");
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
    }

    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Eevee blocks");
    }
    
    @Override
    public void accept(EvolutionVisitor visitor) {
        visitor.visit(this);
    }
}