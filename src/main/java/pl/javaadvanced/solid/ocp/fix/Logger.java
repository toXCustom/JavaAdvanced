package pl.javaadvanced.solid.ocp.fix;

public class Logger {
    MessageLogger messageLogger;

    public Logger(MessageLogger messageLogger) {

        this.messageLogger = messageLogger;
    }


    public void log(String message) throws Exception {
        messageLogger.log(message);
    }
}
