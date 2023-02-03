import java.util.ArrayList;
import java.util.List;

public class Logger {
    
    private static Logger instance = null;
    private List<String> logMessages;

    private Logger() {
        logMessages = new ArrayList<String>();
    }

    public synchronized static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logMessage(String messageText) {
        logMessages.add(messageText);
    }


    public List<String> getLog() {
        return logMessages;
    }
}