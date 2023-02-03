public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logMessage("Hello Teacher!");
        logger.logMessage("This is a test message!");
        System.out.println(logger.getLog());
    }
}
