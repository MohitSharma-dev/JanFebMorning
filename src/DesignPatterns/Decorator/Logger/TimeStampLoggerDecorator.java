package DesignPatterns.Decorator.Logger;

public class TimeStampLoggerDecorator extends LoggerDecorator {
    private Logger logger = null;
    public TimeStampLoggerDecorator(Logger logger) {
        this.logger = logger;
    }
    @Override
    public void log(String message) {
        logger.log("[ " + java.time.LocalDateTime.now() + " ]"+ message);
    }
}
