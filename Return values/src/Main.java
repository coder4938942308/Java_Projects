import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area1 = areaOfRectangle(10.5, 80.2, "area");

        System.out.println(area1);

    }


    public static double areaOfRectangle(double length, double width, String option) {
        if (length < 0 || width < 0) {
            System.out.println("ERROR");
        }
            switch (option) {
                case "area":
                    return length * width;
                case "perimeter":
                    return 2 * (length + width);
                default:
                    return 404;

        }

    }
        public static void stringPrinter ( double length, double width, double area){
            System.out.println("the area is " + length + " * " + width + " = " + area);
        }
    }

/**
 * Function name: areaOfRectangle - calcs the area of a rectangle
 * @param length, width (double)
 * @return area (double)
 *
 * Inside function:
 * 1. double area = length * width;
 * returns area
 */