import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pick Rock, Paper or Scissors");
        Scanner scan = new Scanner(System.in);
        String object = scan.nextLine();
        if (object.equals("Rock")) {
            System.out.println("You Chose Rock");
        } else if (object.equals("Paper")) {
            System.out.println("You Chose Paper");
        } else System.out.println("You Chose Scissors");

        int randomNumber = computersChose();

        if (randomNumber == 0) {
            System.out.println("Computer Chose Rock");
        } else if (randomNumber == 1) {
            System.out.println("Computer Chose Paper");
        } else System.out.println("Computer Chose Scissors");


        if (object.equals("Rock") && randomNumber == 0) {
            System.out.println("You Both Chose Rock It's a Draw");
        }
        else if (object.equals("Rock") && randomNumber == 1) {
            System.out.println("You Lost!");
        }
        else  if (object.equals("Rock") && randomNumber == 2)
            System.out.println("You Won!");

        if (object.equals("Paper") && randomNumber == 1) {
            System.out.println("You Both Chose Paper It's a Draw");
        }
        else if (object.equals("Paper") && randomNumber == 2) {
            System.out.println("You Lost!");
        }
        else if (object.equals("Paper") && randomNumber == 0)
            System.out.println("You Won!");


        if (object.equals("Scissors") && randomNumber == 2) {
            System.out.println("You Both Chose Scissors It's a Draw");
        }
        else if (object.equals("Scissors") && randomNumber == 0) {
            System.out.println("You Lost!");
        }
        else if (object.equals("Scissors") && randomNumber == 1)
            System.out.println("You Won!");

        scan.close();
    }
    public static int computersChose(){
        double random = Math.random() * 3;
        return (int)random;

    }
}
