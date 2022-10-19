public class Main {
    public static void main(String[] args) {
        greet();
        printText("bob", 67);

        System.out.println("Hello world!");
        areaOfRectangle(20,60);
    }

    /**
     * Function name : greet
     * inside function:
     * 1. prints Hi
     */
    public static void greet() {
        System.out.println("Hi");
    }
    /**
     * Function name : printText
     * @ params name, age (string)
     * inside function:
     * 1. prints name and age
     */

    public static void printText(String name, int age) {
        System.out.println("Name: " +name + "age: "+ age);

    }
    /**
     * Function name: areaOfRectangle - calcs the area of a rectangle
     * @param length, width (double)
     * @return area (double)

     * Inside function:
     * 1. double area = length * width;
     * returns area
     */
    public static double areaOfRectangle(double length, double width){
        double area = length * width;
        return area;
    }

}