//Take 3 inputs from user and check :
//        all are equal
//        any of two are equal
//        ( use && || with ternary operator )

import java.util.Scanner;

public class Q_11_input {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the 1st integer");
        int first = scanner.nextInt();
        System.out.println("Enter the 2nd integer");
        int second = scanner.nextInt();
        System.out.println("Enter the 3rd integer");
        int third= scanner.nextInt();
        String output;
        output = (first==second && second==third)? "All are same":(first == second || second==third ||first==third)?"Two inputs are same":"nothing is same";
        System.out.println(output);
    }
}
