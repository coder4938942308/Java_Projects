public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        allArea();
        //Task 5 – Call area functions.

        // double square = area of square with a side of 2.
        // double rectangle = area of rectangle with a length of 1, and a width of 2.
        // double triangle = area of triangle with a base of 1, and a width of 2.
        // double circle = area of circle with a radius of 2.


        //Task 7 – Call a function that prints all the areas.

    }

    public static double areaOfSquare(double side){
        double area = side * (double)2;
        return area;

    }
    //Task 1 - Write a function that calculates the area of a square.


    /**
     * Function name: areaSquare - returns the area of a square.
     * @param, side (double)
     * @return the area (double)
     *
     * Inside the function:
     *  1. If the side is negative, prints "Error: impossible" and terminates the java program.
     *  2. Calculates the area of the square. A = side²
     */



    //Task 2 - Write a function that calculates the area of a rectangle.

    public static double areaOfRectangle(double length, double width){
        double area = length * width;
        return area;

    }
    /**
     * Function name: areaRectangle – returns the area of a rectangle.
     * @param, length, width  (double).
     * @return the area (double)
     *
     * Inside the function:
     *  1. If the length OR width is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the rectangle. A = length * width
     */

    public static double areaOfTriangle(double base, double hieght){
        double area = (base * hieght)/2.0;
        return area;

    }
    //Task 3 - Write a function that calculates the area of a triangle.

    /**
     * Function name: areaTriangle – it returns the area of a triangle.
     * @param, base: (double).
     * @param, height: (double).
     * @return the area (double)
     *
     * Inside the function:
     *  1. If the base OR height is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the triangle. A = (base * height)/2
     */

    //Task 4 - Write a function that calculates the area of circle.
    public static double areaOfCircle(double radius){
        double area = (radius * radius) * 3.14;
        return area;

    }

    /**
     * Function name: areaCircle – it returns the area of a circle.
     * @param radius (double).
     * @return area (double)
     *
     * Inside the function:
     *  1. If the radius is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the circle.
     */




    //Task 6: Write a function that prints every area.


    /**
     * Function name: printAreas – it prints four areas
     * @param, square – square area (double)
     * @param, rectangle – rectangle area (double)
     * @param, triangle – triangle area (double)
     * @param, circle – circle area (double)
     *
     * Inside the function:
     *  1. print: ("Square area: <square area>")
     *  2. print: ("Rectangle area: <rectangle area>")
     *  3. print: ("Triangle area: <triangle area>")
     *  4. print: ("Circle area: <circle area>")
     *
     */

    public static void allArea(){
        System.out.println(areaOfCircle(4));
        System.out.println(areaOfRectangle(10,5));
        System.out.println(areaOfTriangle(4, 10));
        System.out.println(areaOfSquare(4));

    }
}
