package DesignPatterns.Decorator.Logger;

public class InfoLevelLoggerDecorator extends LoggerDecorator {
    private Logger logger;
    public InfoLevelLoggerDecorator(Logger logger) {
        this.logger = logger;
    }
    @Override
    public void log(String message) {
        logger.log("[ INFO ]: "  + message);
    }
}
