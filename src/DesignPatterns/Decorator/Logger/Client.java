package DesignPatterns.Decorator.Logger;

import java.sql.Time;

public class Client {
    public static void main(String[] args) {
        Logger logger = new ScreenLogger();
        logger.setLogLevel(LogLevel.INFO);
        logger.setTimeStamp("");

        logger = new TimeStampLoggerDecorator(logger);
        logger.log(" A random log message");
        logger = new InfoLevelLoggerDecorator(logger);
        logger.log(" A random log message");
    }
}

