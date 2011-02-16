public class EvolutionVisitor implements Visitor{
    private Pokemon context;

    public EvolutionVisitor(Pokemon context) {
        this.context = context;
    }

    @Override
    public void visit(Umbreon state) {
        if(context.getExp() >= 100) {
            context.setState(new Jolteon());
            context.setExp(0);
        }
    }

    @Override
    public void visit(Jolteon state) {
        System.out.println("Jolteon has reached max evolution stage");
    }

    @Override
    public void visit(Eevee state) {
        System.out.println("Eevee has evolved into Umbreon");
        if (context.getExp() >= 100) {
            context.setState(new Jolteon());
            context.setExp(0);
        }
    }
    
}
