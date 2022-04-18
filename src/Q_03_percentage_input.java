//Write a program to take input of the total marks of four subjects of a student and calculate the total percentage secured. T
import java.util.Scanner;

public class Q_03_percentage_input {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the marks of sub1");
        float sub1 = scanner.nextFloat();
        System.out.println("enter the marks of sub2");
        float sub2 = scanner.nextFloat();
        System.out.println("enter the marks of sub3");
        float sub3 = scanner.nextFloat();
        System.out.println("enter the marks of sub4");
        float sub4 = scanner.nextFloat();

        float total = sub1+sub2+sub3+sub4;
        float percentage = total/400 *100;
        String result;

        result =  (percentage>=70)?"First class": (percentage>=59)? "upper second class": (percentage>=49)? "second class": (percentage>39)? "Third class":"Fail";
        System.out.println("Hey, your result is "+result);
    }
}
