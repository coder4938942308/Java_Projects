import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
        int wordchose = randomWord();
        String word = words[wordchose];
        char[] placeholders = new char[word.length()];
        for (int i = 0; i < placeholders.length; i++) {
            placeholders[i] = '_';
        }


        char[] charArray = word.toCharArray();

        char blank = '_';
        System.out.println("Word :   ");

        int misses = 0;
        char[] wrongGuess = new char[6];
            while (misses < 6) {
                System.out.print(gallows[misses]);

                System.out.print("Word:   ");
                printPlaceholders(placeholders);
                System.out.print("\n");

                System.out.print("Misses:   ");
                printMissedGuesses(wrongGuess);
                System.out.print("\n\n");

                System.out.print("Guess:   ");
                char guess = scan.nextLine().charAt(0);
                System.out.print("\n");

                if (checkGuess(word, charArray, guess)) {
                    updatePlaceholders(word, placeholders, guess);
                } else {
                    wrongGuess[misses] = guess;
                    misses++;
                }

                if (Arrays.equals(placeholders, word.toCharArray())) {
                    System.out.print(gallows[misses]);
                    System.out.print("\nWord:   ");
                    printPlaceholders(placeholders);
                    System.out.println("\nGOOD WORK!");
                    break;
                }
            }

            if (misses == 6) {
                System.out.print(gallows[6]);
                System.out.println("\nRIP!");
                System.out.println("\nThe word was: '" + word + "'");
            }
            scan.close();
    }
    public static int randomWord(){
        double randomNumber = Math.random() * 64;
        randomNumber += 1;
        return (int)randomNumber;
    }
    public static boolean checkGuess(String word , char[] charArray, char pick) {

        for (int i = 0; i < word.length(); i++) {
            if (charArray[i] == pick ) {
                return true;
            }
        }
        return false;




}
    public static void updatePlaceholders(String word, char[] placeholders, char guess) {

        for (int j = 0; j < word.length(); j++) {

            if (word.charAt(j) == guess) {
                placeholders[j] = guess;
            }
        }
    }
    public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            System.out.print(" " + placeholders[i]);
        }
        System.out.print("\n");
    }

        public static String[] gallows = {"+---+\n" +
                "|   |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "=========\n",

                "+---+\n" +
                        "|   |\n" +
                        "O   |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",

                "+---+\n" +
                        "|   |\n" +
                        "O   |\n" +
                        "|   |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",

                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|   |\n" +
                        "     |\n" +
                        "     |\n" +
                        " =========\n",

                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
                        "     |\n" +
                        "     |\n" +
                        " =========\n",

                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n" +
                        "/    |\n" +
                        "     |\n" +
                        " =========\n",

                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n" +
                        "/ \\  |\n" +
                        "     |\n" +
                        " =========\n"};


    public static void printMissedGuesses(char[] misses) {
        for (int i = 0; i < misses.length; i++) {
            System.out.print(misses[i]);
        }
    }

}







