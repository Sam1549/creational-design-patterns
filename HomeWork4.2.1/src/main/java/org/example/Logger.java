package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger = null;
    protected int num = 1;

    protected Date date = new Date();
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

    private Logger() {
    }


    public void log(String msg) {
        System.out.println("[" + formatDate.format(date) + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        //...
        if (logger == null) logger = new Logger();
        return logger;
    }
}
