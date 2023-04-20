public class FlipDownCommand implements ICommand {
    private Screen theScreen;

    public FlipDownCommand(Screen Screen) {
        this.theScreen = Screen;
    }

    public void execute() {
        theScreen.down();
    }

}
