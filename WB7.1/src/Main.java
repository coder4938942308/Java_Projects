import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        person.setSeatNumber(10);

        System.out.println("Name: " + person.getName() + "\n"
                +                  "Nationality: " + person.getNationality() + "\n"
                +                  "Date of Birth: " + person.getDateOfBirth() + "\n"
                +                  "Seat Number: " + person.getSeatNumber() + "\n");
        Person person2 = new Person(person);
        person2.setName("Jad Slim");
        person2.setSeatNumber(3);
        System.out.println("Name: " + person2.getName() + "\n"
                +                  "Nationality: " + person2.getNationality() + "\n"
                +                  "Date of Birth: " + person2.getDateOfBirth() + "\n"
                +                  "Seat Number: " + person2.getSeatNumber() + "\n");
        if (person.applyPassport() == true) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("We're sorry " + person.getName() + ". We cannot process your application.");
        }


        scan.close();

    }

}
