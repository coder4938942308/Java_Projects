import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to the dealership.");
        System.out.println("Select 'a' to buy a car.");
        System.out.println("Select 'b' to sell a car.");
        String option = scan.nextLine();

        switch  (option){
            case "a": System.out.println("what's your budget?");
            case "b":
                System.out.println("Whats Your cars Value.");
                int value = scan.nextInt();
                System.out.println("Whats Your cars selling price.");
                int price = scan.nextInt();

                if(value > price && price < 30000){
                    System.out.println("We will buy");
                }
                else{
                    System.out.println("sorry not interested");
                }
                break;

        }
        int budget = scan.nextInt();
        if (budget >= 10000) {
            System.out.println("Great a Fiat is available ");
            System.out.println("\nDo you Have insurance Type 'yes' or 'no' ");
            scan.nextLine();
            String insurance = scan.nextLine();
            System.out.println("\nDo you Have License Type 'yes' or 'no' ");
            String license = scan.nextLine();
            if (insurance.equals("yes") && license.equals("yes")){
                System.out.println("Sold!");
            }
        }else{
                System.out.println("you have not met the requirements.");
            }


    scan.close();

    }
}