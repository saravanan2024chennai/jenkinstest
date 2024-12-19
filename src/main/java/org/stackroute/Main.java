package org.stackroute;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final Logger logger= LoggerFactory.getLogger(Main.class);
    public String message() {
        return "Have a Happy & Healthy Day";
    }
    public static void main(String[] args) {
        logger.info("it is a CI job");
         Main greet=new Main();

        System.out.println(greet.message());
    }
}