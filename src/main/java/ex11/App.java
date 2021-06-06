/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex11;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int euros = myApp.getEuro();
        float exRate = myApp.getExRate();
        double exchange = myApp.getExchange(euros, exRate);
        String outputString = myApp.generateOutputString(euros, exRate, exchange);
        myApp.printOutput(outputString);
    }

    public int getEuro() {
        System.out.print("How many euros are you exchanging? ");
        return in.nextInt();
    }

    public float getExRate() {
        System.out.print("What is the exchange rate? ");
        return in.nextFloat();
    }

    public  double getExchange(int euros, float exRate ) {
        double exchange = euros * exRate;
        exchange = Math.round(exchange*100d)/100.0d;
        return exchange;
    }
    
    public String generateOutputString(int euros, float exRate, double exchange) {
        return euros+" euros at an exchange rate of "+exRate+" is\n"+exchange+" U.S. dollars.";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}




