public class Main {
    public static void main(String[] args) {


            int temp = 25;

            String forecast = "";
            if (temp >= -15 && temp <= -1)
                System.out.println("its too cold");

            else if (temp >=0 && temp <=10)
                System.out.println("wear a coat");
            else forecast = "its Warm";

            //IF - ELSE IF - ELSE STATEMENTS HERE!

            //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"

            //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";

            //else: It's warm. go outside!

            System.out.println(forecast);
            }
        }