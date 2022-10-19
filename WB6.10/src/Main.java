import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many toppings");
        int numToppings = scan.nextInt(); scan.nextLine();
        String[] toppings = new String[numToppings];
        /**  Task 1:
         *
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("great enter each topping");
        for (int i = 0; i < toppings.length; i++){
            toppings[i] = scan.nextLine();
        }
        for (int i = 0; i < toppings.length; i++){
            System.out.println(toppings[i]);
        }
        System.out.println("Click Enter To Confirm");
        scan.nextLine();

        // Task 2 – Create the array here

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         *
         */

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *
         *  See the workbook article for more detail  
         *
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *
         *  See the workbook article for more detail   
         *
         */

        /** Task 6 –  Confirm the order
         *
         *  See the workbook article for more detail  
         *
         */

        scan.close();



    }
}
