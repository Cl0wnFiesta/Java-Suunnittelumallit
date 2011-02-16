public interface IPokemonState {
    public void attack(Pokemon pokemon);
    public void heal(Pokemon pokemon);
    public void block(Pokemon pokemon);
    public void accept(EvolutionVisitor visitor);
}
