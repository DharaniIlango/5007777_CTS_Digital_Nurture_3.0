// app/src/main/java/org/digital/nurture/Logger.java
package org.digital.nurture;

public class Logger {
    // private static instance of Logger
    private static Logger instance;

    // private constructor to prevent instantiation
    private Logger() {
        // initialization code
    }

    // public static method to get the instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // logging method
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
