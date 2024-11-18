package DesignPatterns.Factory;

// Simple Factory
public class PlatformFactory {
    public static Platform getPlatform(String platformName) {
        Platform platform = null;
        if(platformName.equals("IOS")){
            platform = new IOS();
        } else if(platformName.equals("Android")){
            platform = new Android();
        }
        return platform;
    }
}
