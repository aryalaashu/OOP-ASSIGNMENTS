
package src;
import java.util.Scanner;

public class PTR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal");
        double princp = scanner.nextDouble();
        System.out.println("enter rate");
        double rate = scanner.nextDouble();
        System.out.println("enter time");
        double time = scanner.nextDouble();
        double SI = princp*time*rate;

    }
}
