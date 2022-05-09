import java.util.Scanner;

public class Do_while_Loop {
    public static void main(String[] args) {
        int i = 6;
        do{
            System.out.println(i);
            i++;

        }
        while ((i<=5));
    }
}

class SUM_OF_Numbers{
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do{

            sum = sum+i;
            i++;
        }
        while(i<=10);
        System.out.println(sum);



    }
}


class Natural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num; int sum=0;
        do {
            System.out.print("Enter number: ");
            num = input.nextInt();
            sum = sum + num;
                }
        while (num != 0);
                System.out.println(sum);
            }
        }









