public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        ICommand flipUpCommand = new FlipUpCommand(screen);
        ICommand flipDownCommand = new FlipDownCommand(screen);
        WallButton wallButtonUp = new WallButton(flipUpCommand);
        WallButton wallButtonDown = new WallButton(flipDownCommand);

        wallButtonUp.press();
        wallButtonDown.press();
    }
}
