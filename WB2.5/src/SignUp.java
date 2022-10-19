import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");


        //Task 1 - Using Scanner, ask the user questions

        System.out.println("Frist Name: ");
        String firstName = scan.nextLine();
        System.out.println("Last Name: ");
        String lastName = scan.nextLine();
        System.out.println("Age: ");
        int age = scan.nextInt();
        System.out.println("User Name: ");
        scan.nextLine();
        String userName = scan.nextLine();
        System.out.println("City: ");
        String city = scan.nextLine();
        System.out.println("Country: ");
        String country = scan.nextLine();
        //Ask for their last name.
        //Ask: how old are you?
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        //Ask what city they live in.
        //Ask what country that's from.
        System.out.println("Your Info: ");
        System.out.println("\t" + firstName);
        System.out.println("\t" + lastName);
        System.out.println("\t" + age);
        System.out.println("\t" + userName);
        System.out.println("\t" + country);
        System.out.println("\t" + city);

        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D !
        scan.close();
    }
}
