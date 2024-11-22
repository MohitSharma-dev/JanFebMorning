package DesignPatterns.Decorator.Logger;

public abstract class Logger {
    private String timeStamp;
    private LogLevel logLevel;

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public abstract void log(String message);
}
