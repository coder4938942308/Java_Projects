//import Scanner

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();


        //add new a line before asking next question.
        System.out.println("Hi " +  name + " I'm Javabot. Where are you from?");
        //Pick up user's home and store it.
        String adress = scan.nextLine();


        //add new a line before asking next question.
        System.out.println("I hear it's beautiful at "+ adress +  " I'm from a place called Oracle");
        System.out.println("How old are you?");
        int age = scan.nextInt();


        //add new a line before asking next question.
        System.out.println("So you're "+ age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        scan.nextLine();
        String codingLang = scan.nextLine();


        //add new a line here.
        System.out.println(codingLang +", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");

        scan.close();


    }
}