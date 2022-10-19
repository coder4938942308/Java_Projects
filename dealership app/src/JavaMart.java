public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        if (toyCar <= wallet) {
            wallet -= toyCar;
            System.out.println("yes");
        }
            System.out.println(wallet);


        //if you have enough money
        //       print: Sure!
        //       pay for the toy car

        //else:  Sorry, I only have <wallet> left.


        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        //if you have enough money
        //       print: Sure!
        //       pay for the nike shoes
        if (nike <= wallet){
            wallet -= nike;
            System.out.println("yes");
        }
        else System.out.println("sorry no");
        //else: Sorry, I only have <wallet> left.

    }
}