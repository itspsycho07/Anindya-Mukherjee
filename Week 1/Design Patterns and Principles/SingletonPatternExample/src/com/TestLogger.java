package com;

import com.Logger;

public class TestLogger {
    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}
