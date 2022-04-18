//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

import java.util.Scanner;

public class Q_08_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a side1");
        double side1 = scanner.nextDouble();
        System.out.println("Enter a side2");
        double side2 = scanner.nextDouble();
        System.out.println("Enter a side3");
        double side3 = scanner.nextDouble();

        double semi_perimeter = (side1+side2+side3)/2d;

        double area = Math.pow (semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3),0.5d);
        System.out.printf("Hence the are of given triangle is %.2f units\u00B2",area);

        System.out.println("\n");
        System.out.println("Volume of cube with side 1 is "+ side1*side1*side1+" cubic units");
        System.out.println("Volume of cuboid is "+ side1*side2*side3+" cubic units");

        System.out.println("Enter a length of square");
        double sside= scanner.nextDouble();
        System.out.println("Area of square is "+ sside*sside+ "\nAnd, the perimeter is "+4*sside);
    }
}
