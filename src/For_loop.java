import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5 ; i++){
            System.out.println("Aashutosh");
        }

    }
}


class MultipleOf3 {
    public static void main(String[] args) {
        int j=0;
        for (int i=1; i<=20; i++){
            if (i%3==0) {
                j++;
            }
        }
        System.out.println("Number of factors: "+j);
    }
}


class Sum_of_first_ten_natural_number {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 10; i++) {
            k += i;
        }
        System.out.println(k);
    }
}

class Prime_number{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int a  = scanner.nextInt();
        int count = 0;
        for (int i = 1; i<=a; i++){
            if (a%i==0){
                count++;
            }
        }
        if (count == 0){
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        }

    }
}
class Prime30 {
    public static void main(String[] args) {

        for (int num=2;num<=30;num++){
            int factors=0;
            for (int i=2;i<num;i++) {
                if (num % i == 0) {
                    factors = 1;
                    break;
                }
            }
            if(factors==0) {
                System.out.println(num);
            }


        }
    }




class Infinite_loop{
    public static void main(String[] args) {
        for (;;){
            System.out.println("infinite");
        }
    }
}



class Nested_loop
{
    public static void main(String[] args)
    {

        for(int i = 1; i <= 3 ; i++)
        {

            for(int j = 4; j <=6 ; j++)
            {
                System.out.println("Outer loop "+ i +" Inner loop: "+ j );
            }
        }
    }
}}

class Prime50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        for (int num=2;num<=a;num++){
            int factors=0;
            for (int i=2;i<num;i++) {
                if (num % i == 0) {
                    factors = 1;
                    break;
                }
            }
            if(factors==0) {
                System.out.println(num);
            }


        }
    }}






