package com.example;
 
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
 
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
 
    public static void main(String[] args) {

        logger.info("✅ Logging initialized with SLF4J + Logback");

        logger.info("Hello from Java with standard logging!");

        logger.debug("This is a DEBUG log message");

        logger.error("This is an ERROR log example (for demo)");

    }

}

 
