package org.digital.nurture;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a log message from the main application.");
        
        // Additional log messages
        logger.log("Singleton pattern ensures only one instance of Logger.");
    }
}
