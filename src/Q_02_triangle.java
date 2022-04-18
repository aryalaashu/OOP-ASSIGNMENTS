//Write a program to calculate SI, Area of triangle and Volume of Cube and Cuboid.
public class Q_02_triangle {
    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 6;
        double side3 = 7;
        double semi_perimeter = (side1+side2+side3)/2d;

        double area = Math.pow (semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3),0.5d);
        System.out.printf("Hence the are of given triangle is %.2f units\u00B2",area);

        System.out.println("\n");
        System.out.println("Volume of cube with side 1 is "+ side1*side1*side1+" cubic units");
        System.out.println("Volume of cuboid is "+ side1*side2*side3+" cubic units");

    }
}
