package shopcart.core;

import java.io.Console;

public class Shopcart2 {
    Console cons = System.console();
    
    System.out.printf("READ: %s\n", input);

    //list <list of space separated items>
    //del <idx>
    //end
    String[] terms = input.split(" ");
    String[] cmd = terms [0];

    switch (cmd) {
        case "add":
            break;

        case "list":
            if (cart.size() > 0) {
                for (int i = 0; i < cart.size(); i++) {
                    System.out.printf("%d. %s\n", (i+1), (cart.get(i)));

                } else {
                    System.out.println("Your cart is empty");
                }
            }
    }

}
