//Take two integer inputs from user. First calculate the sum of two and then product.
//        Finally, calculate the division of thus obtained sum and product and print the result.

import java.util.Scanner;

public class Q_05_input {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter a num1");
    float num1 = scanner.nextFloat();
    System.out.println("Enter a num2");
    float num2 = scanner.nextFloat();

    float sum = num1+num2;
    float product = num1*num2;
    float div = product/sum;
    System.out.println("The sum is "+sum+"and product is "+product);

        System.out.println("Now the division of sum and product is "+div);
    }
}
