package com;

public class Logger {
    // Private static instance 
    private static Logger instance;

    // Private constructor 
    private Logger() {
        
    }

    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    
    public void log(String m) {
        System.out.println("Log message: " + m);
    }
}
