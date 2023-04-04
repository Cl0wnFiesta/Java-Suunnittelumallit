public class EvolutionVisitor implements Visitor{

    public EvolutionVisitor() {
    }

    @Override
    public void visit(Umbreon state, Pokemon p) {
        if(p.getExp() >= 100) {
            p.setState(new Jolteon(this, p));
            p.setExp(0);
        }
    }

    @Override
    public void visit(Jolteon state, Pokemon p) {
        System.out.println("Jolteon has reached max evolution stage");
    }

    @Override
    public void visit(Eevee state, Pokemon p) {
        if (p.getExp() >= 100) {
            p.setState(new Umbreon(this, p));
            p.setExp(0);
        }
    }
    
    
}
