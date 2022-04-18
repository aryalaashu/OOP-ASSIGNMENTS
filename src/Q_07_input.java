//Take name, roll number and field of interest from user and print in the format below :Hey,
//        my name is xyz and my roll number is xyz. My field of interest are xyz
import java.math.BigInteger;
import java.util.Scanner;

public class Q_07_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the students name");
        String name = scanner.nextLine();

        System.out.println("enter the class of student");
        int roll = scanner.nextInt();

        scanner.nextLine();
        System.out.println("enter the interest of student");
        String interest = scanner.nextLine();

        System.out.printf("Hey, my name is %s and my roll number is %d. My field of interest are %s",name,roll,interest);
    }
}
