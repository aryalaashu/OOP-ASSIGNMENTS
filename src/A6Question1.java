import java.util.Random;
import java.util.Scanner;

public class A6Question1 {



        public static void main(String[] args) {


            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }




        }
    }
class A6Question2 {
    public static void main(String[] args) {


        for (int i = 10; i <= 30; i += 2) {
            System.out.println(i);
        }
    }
}
class A6Question3 {
    public static void main(String[] args) {
        int count1 = 0;


        for (int i = 10; i <= 30; i++) {
            if (i % 2 == 0) {
                count1++;
            }
            System.out.println("No. of even: " + count1);
        }
    }
}
class A6Question4 {
    public static void main(String[] args) {
        int count11 = 0, count12 = 0;


        for (int i = 10; i <= 30; i++) {
            if (i % 2 == 0) {
                count11++;
            } else {
                count12++;
            }
        }
        System.out.println("No. of even: " + count11 + "\nNo.of odd: " + count12);
    }
}
class A6Question5 {
    public static void main(String[] args) {


        for (int n1 = 1; n1 < 10; n1++) {
            int product = n1 * 3;
            System.out.println("3 x " + n1 + " = " + product);
            n1++;
        }
    }
}

class A6Question6 {
    public static void main(String[] args) {
        int count1 = 0;


        for (int i = 1; i <= 10; i++) {
            count1 = count1 + i;
        }
        System.out.println("Sum: " + count1);
    }
}
class A6Question7 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        for (int n1 = 1; n1 <= 10; n1++) {
            int product = n1 * num1;
            System.out.println(num1 + " x " + n1 + " = " + product);
        }
    }
}
class A6Question8 {
    public static void main(String[] args) {
        int count1 = 1, count2 = 1, count3 = 1;
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number: ");

        for (int i = input.nextInt(); i > 0; i--) {
            count1 = count1 * i;
        }
        System.out.println("Factorial: " + count1);
    }
}
class A6Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter exponent: ");
        int pow = input.nextInt();

        int result = 1;

        for (int i = 0; i < pow; i++) {
            result = result * num;
        }
        System.out.println("Result: " + result);
    }
}
class A6Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int digit;
        int i;
        int rev = 0;


        for (i = num; i > 0; i /= 10) {
            digit = i % 10;
            rev = rev * 10 + digit;
        }
        System.out.println(rev);
    }
}
class A6Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int i, digit, even = 0, odd = 0;


        for (i = num; i > 0; i /= 10) {
            digit = i % 10;
            if (digit % 2 == 0) {
                even = even + digit;
            } else {
                odd = odd + digit;
            }
        }
        System.out.println("Sum of even: " + even);
        System.out.println("Sum of odd: " + odd);
    }
}

class A6Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int j = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                j++;
            }
        }
        if (j == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}

class A6Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();


        int i, j = 0;
        for (i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                j = i;
            }
        }
        System.out.println("HCF: " + j);
    }
}

class A6Question14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char decision;
        do{
            System.out.print("Enter a number: ");
            int num1=input.nextInt();
            System.out.print("Enter another number: ");
            int num2=input.nextInt();

            int sum=num1+num2;
            System.out.println("Sum: "+sum);

            System.out.print("Continue?(y/n): ");
            decision = input.next().charAt(0);
        } while (decision == 'y');
    }
}

class A6Question15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char decision;
        int p=0,n=0,z=0,num;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num>0) {
                p++;
            } else if (num<0) {
                n++;
            } else {
                z++;
            }
            System.out.print("Continue?(y/n): ");
            decision = input.next().charAt(0);
        } while (decision == 'y');
        System.out.println("Positive: "+p);
        System.out.println("Negative: "+n);
        System.out.println("Zero: "+z);
    }
}
class A6Question16{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char decision;
        int num,greatest=0,least=0,j=0;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num>greatest) {
                greatest=num;
            } else if (least==0&&num!=0) {
                least = num;
                j=1;
            } else if (num<least&&j>0) {
                least = num;
            } else {
                assert true;
            }
            System.out.print("Continue?(y/n): ");
            decision = input.next().charAt(0);
        } while (decision == 'y');
        System.out.println("Greatest: "+greatest);
        System.out.println("Least: "+least);
    }
}
class A6Question17 {
    public static void main(String[] args) {

        int digit, i;


        for (i = 1; i <= 500; i++) {
            int cube = 0;
            for (int j = i; j > 0; j /= 10) {
                digit = j % 10;
                cube += digit * digit * digit;
            }
            if (cube == i) {
                System.out.println(i);

            }
        }
    }
}

class A6Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int terms = input.nextInt();


        int i, x = 0, y = 1, z = 1;
        for (i = 1; i <= terms; i++) {
            System.out.println(x);
            x = y;
            y = z;
            z = x + y;
        }
    }
}

class A6Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int terms = input.nextInt();


        double i;
        double sum = 0;
        for (i = 1; i <= terms; i++) {
            sum = sum + 1 / i;
        }
        System.out.println(sum);
    }
}

class A6Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int terms = input.nextInt();

        //For loop
        double i;
        double sum = 0;
        for (i = 1; i <= terms; i++) {
            if (i % 2 != 0) {
                sum = sum + 1 / i;
            } else {
                sum = sum - 1 / i;
            }
        }
        System.out.println(sum);
    }
}
class A6Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1,100);

        System.out.print("Enter a number to begin: ");
        int userInput=input.nextInt();
        do {
            if (userInput > num) {
                System.out.println("Too high, try again!");
                userInput = input.nextInt();
            } else if (userInput < num) {
                System.out.println("Too low, try again!");
                userInput = input.nextInt();
            } else {
                break;
            }
        } while (num!=userInput);
        System.out.println("Congratulations! You guessed the number!");
    }
}
class A6Question221 {
    public static void main(String[] args) {
        int i=1;
        do {
            int j=1;
            do {
                System.out.print("*");
                j++;
            } while (j<=10);
            System.out.println();
            i++;
        } while (i<=4);
    }
}






