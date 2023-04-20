public class WallButton {
    private ICommand command;

    public WallButton(ICommand command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
