package shopcart.core;

import java.io.Console;

public class Shopcart {

    public static void main (String[] args){
        
        Console cons = System.console();

        String input = cons.readLine("Welcome to your shopping cart");
        input = input.trim();

        String[] cart = new String[0];

        if (input.equals("list") && cart.equals(null))
            System.out.println("Your cart is empty");
        else
            System.out.println("Your cart is not empty");

        switch(input){
            case "add apple":
                System.out.println("apple added to cart");

                break;

            case "add pear":
                System.out.println("pear added to cart");
                
                break;

            case "add orange":
                System.out.println("orange added to cart");
                break;

            case "add grapes":
                System.out.println("grapes added to cart");

        };



        }


        
        }
    
