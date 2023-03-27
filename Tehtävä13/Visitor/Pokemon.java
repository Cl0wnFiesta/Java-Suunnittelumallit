public class Pokemon {
    private IPokemonState state;
    private int health;
    private int exp;

    public Pokemon() {
        this.state = new Eevee();
        this.health = 100;
        this.exp = 0;
    }

    /*
     * public void evolve() {
     * if (state instanceof Eevee) {
     * this.state = new Umbreon();
     * } else if (state instanceof Umbreon) {
     * this.state = new Jolteon();
     * } else {
     * System.out.println("Already at max evolution stage!");
     * }
     * }
     */

    public void attack() {
        state.attack(this);
    }

    public void heal() {
        state.heal(this);
    }

    public void block() {
        state.block(this);
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
        state.accept(new EvolutionVisitor(this));
    }

}
