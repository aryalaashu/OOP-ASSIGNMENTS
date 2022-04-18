//Write a program to take two integer inputs from user and print sum and product of them.
import java.util.Scanner;

public class Q_04_input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a num1");
        float num1 = scanner.nextFloat();
        System.out.println("Enter a num2");
        float num2 = scanner.nextFloat();

        float sum = num1+num2;
        float product = num1*num2;
        System.out.println("The sum is "+sum+"and product is "+product);
    }
}
