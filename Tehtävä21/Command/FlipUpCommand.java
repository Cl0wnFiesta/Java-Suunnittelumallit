public class FlipUpCommand implements ICommand {
    private Screen theScreen;

    public FlipUpCommand(Screen Screen) {
        this.theScreen = Screen;
    }

    public void execute() {
        theScreen.up();
    }

}
