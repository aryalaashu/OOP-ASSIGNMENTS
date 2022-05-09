import java.util.Scanner;

public class Break_and_continue {
    public static void main(String[] args) {
        for ( int i = 1; i<= 10; i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }

    }
}
class Even_or_odd_through_switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int day = scanner.nextInt();

        switch ((day % 2 == 0 ) ? 0 : 1)  {
            case 0 -> System.out.println("number is even");
            case 1-> System.out.println("Number is odd");

        }
    }
}

class Even_number_from_0_to_1{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0) {
                continue;

            }
            System.out.println(i);
        }
    }}
class Except_prime{
    public static void main(String[] args) {
        for( int i = 1; i<=30; i++){
            for (int j = i-1; j>1; j--){
                if (i%j==0){
                    System.out.println(i);
                    break;
                }
            }
        }

    }

}
class While{
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            if (i%2==0){
                i++;
                continue;

            }
            System.out.println(i);
            i++;
        }

    }
}


