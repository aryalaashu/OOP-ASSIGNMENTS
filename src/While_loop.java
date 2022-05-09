import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;

        }
    }
}
class Odd_number{
    public static void main(String[] args) {
        int i = 1;
        while(i<=20){
            System.out.println(i);
            i+=2;
        }
    }
}
class Multiplication3{
    public static void main(String[] args) {
        int i = 1;

        while(i<=10){
            int num = 3*i;
            System.out.println(("3*"+i+"="+num));
            i++;
        }
    }
}

    class  Multiples {
public static void main(String[] args) {
        int i=1, j=1, k=1;

        while (i<=5) {
        int product = i * 3;
        j = j + product;
        i++;
        }
        i=1;
        while (i<=5) {
        int product=i*2;
        k=k+product;
        i++;
        }
        System.out.println(j-k);
   }
}


class Prime_or_not{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= scanner.nextInt();
        int count=0;
        int i=1;
        while(i<=num){
            if (num%i==0){
                count++;
            }
            i++;
        }
        if (count==2){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");


        }
    }
    }


    class Infinite_loop{
        public static void main(String[] args) {
            int i = 1;
            while(true){
                System.out.println((i));

            }
        }
    }

