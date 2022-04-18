import java.util.Scanner;

//Ask user to give two double input for length and breadth of a rectangle and print area type cast to int.
public class Q_06_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth");
        double breadth = scanner.nextDouble();

        double area = length*breadth;
        int a = (int)area;

        System.out.println("The area of given rectangle is: "+a);

    }


}
