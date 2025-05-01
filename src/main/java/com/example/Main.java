package com.example;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class Main {
    // Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
 
    public static void main(String[] args) {
        logger.info("🚀 Maven Build Success with Logging!");
        logger.debug("This is a DEBUG log example.");
        logger.error("This is an ERROR log example (just for demo).");
    }
}
