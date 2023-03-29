import java.util.List;

public class Pokemon {
    private int health;
    private int exp;
    EvolutionVisitor evolutionVisitor = new EvolutionVisitor();
    private IPokemonState state;

    public Pokemon() {
        this.state = new Eevee(evolutionVisitor, this);
        this.health = 100;
        this.exp = 0;
    }

    public void attack() {
        state.attack(this);
        this.state.visit(evolutionVisitor, this);
    }


    public void heal() {
        state.heal(this);
        this.state.visit(evolutionVisitor, this);
    }

    public void block() {
        state.block(this);
        this.state.visit(evolutionVisitor, this);
    }

    public void setState(IPokemonState state) {
        this.state = state;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

}
