import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Function function = new Function();


        System.out.println(function.helloWorld( "lED"));
        System.out.println(function.additionNumber(2,4));
        System.out.println(function.subractionNumber(4, 2));
        System.out.println(function.divisionNumber(9,3));
        System.out.println(function.multiPlication(9,5));


    }
//    Static function without any parameters and return type
    public static String helloWorld( String data){
//        System.out.println("Hello World");


        return data;
    }




    public   int additionNumber(int a, int b){
        return a+b;


    }

    public   int subractionNumber(int c, int d){
        return c-d;


    }
    public   int divisionNumber(int e, int f){
        return e/f;

}
    public   int multiPlication(int g, int h){
        return g*h;




}}


class FunctionProgram {
    public static void main(String[] args) {
        System.out.println("Sum: "+addition(5,10));
        subtraction();
        division(5,10);
        System.out.println("Product: "+multiplication());
    }

    public static int addition (int a, int b) {
        return a+b;
    }

    public static void subtraction () {
        int a=5;
        int b=10;
        int c=b-a;
        System.out.println("Difference: "+c);
    }

    public static void division (int a, int b) {
        int c=b/a;
        System.out.println("Quotient: "+c);
    }

    public static int multiplication () {
        int a=5, b=10;
        return a*b;
    }
}

class Multiplication {
    public static void main(String[] args) {
        System.out.println(product(5,10,15));
    }

    public static int product (int a, int b, int c) {
        return a*b*c;
    }
}

class SI {
    public static void main(String[] args) {
        sI();
    }
    public static void sI() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double principle = input.nextDouble();
        System.out.print("Enter Time (In Years): ");
        double time = input.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = input.nextDouble();

        double simpleInterest=(principle*time*rate)/100;
        System.out.println("Simple interest in "+time+" year(s): Rs."+simpleInterest);
    }
}

class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Area: "+areaCircle());
    }
    public static double areaCircle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = input.nextDouble();

        return (22.0/7.0)*r*r;
    }
}

class PrimeComposite {
    public static void main(String[] args) {
        System.out.println(primeComposite());
    }

    public static String primeComposite() {
        String b="";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int j=0;
        for (int i=2; i<num; i++) {
            if (num%i==0) {
                j++;
                break;
            }
        }if (j==0) {
            return "Prime";
        } else {
            return "Composite";
        }
    }
}

class Prime_between_30_and_50 {
    public static void main(String[] args) {
        primeBetween30and50();
    }

    public static void primeBetween30and50 () {

        for (int num = 30; num <= 50; num++) {
            int factors = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    factors = 1;
                    break;
                }
            }
            if (factors == 0) {
                System.out.println(num);
            }
        }


    }
}

//write a java program to find  sum of multiples of 5 and 11 which are present in the between of a and b
class Sum_of_multiples_of_5_and_11{
    public static void main(String[] args) {
        sumMultiples();

    }
     public static void sumMultiples(){

                 Scanner input = new Scanner(System.in);
                 int a,b;
                 do {
                     System.out.println("Enter starting point: ");
                     a = input.nextInt();
                     System.out.println("Enter ending point: ");
                     b = input.nextInt();
                 } while (a>b);

                 System.out.println("Sum: "+multiple(a,b));
             }

             public static int multiple (int start, int end) {
                 int sum=0;
                 for (int a = start; a<=end; a++ ) {
                     if (a%5==0&&a%11==0) {
                         sum+=a;
                     }
                 }
                 return sum;
             }
         }








