package DesignPatterns.Decorator.Logger;

public class ScreenLogger extends Logger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
