import java.util.Scanner;

 class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("invalid Day");
        }
    }
}


class A5Question1 {
    public static void main(String[] args) {
        String[] subjects = {"Physics", "Chemistry", "Biology", "Maths", "Computer"};
        Scanner input = new Scanner(System.in);
        double marks = 0;

        for (String i : subjects) {
            System.out.print("Enter marks in " + i + ": ");
            marks = marks + input.nextDouble();
        }

        double total = marks;
        double percentage = total / 5;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        double percentage10=percentage/10;
        int intPer= (int) percentage10;

        switch (intPer) {
            case 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            case 4 -> System.out.println("Grade: E");
            default -> System.out.println("Grade: F");
        }
    }
}





class A5Question11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int day= input.nextInt();

        switch (day) {
            case 1,3,5,7,8,10,12 -> System.out.println("No. of Days: 31");
            case 4,6,9,11 -> System.out.println("No. of Days: 30");
            case 2 -> System.out.println("No. of Days: 28");
            default -> System.out.println("Invalid Number!");
        }
    }
}

class Odd_or_even{
    public static void main(String[] args) {
        Scanner number = new Scanner((System.in));
        System.out.println("Enter the number");
        int num = number.nextInt();
        int rem = num%2;

        switch(rem){
            case 0-> System.out.println("number is even");
            case 1-> System.out.println(("number is odd"));
        }
    }

}
class Max {
    public static void main(String[] args) {
        Scanner max = new Scanner((System.in));
        System.out.println("enter the number");
        int a = max.nextInt();
        System.out.println("enter the number");
        int b = max.nextInt();
        int greater = (a>b)? 0:1;
        switch ((greater)){
            case 0 -> System.out.println( a +" is greater");
            case 1 -> System.out.println((b +"is greater"));
        }


    }
}
class Three {
    public static void main(String[] args) {
        Scanner max = new Scanner((System.in));
        System.out.println("enter the number");
        int a = max.nextInt();
        System.out.println("enter the second  number");
        int b = max.nextInt();
        System.out.println("enter the second  number");
        int c = max.nextInt();
        int greater = (a>b && a>c)? 0:(b>a&& b>c)? 1:(c>a&& c>b)? 2 :3;
        switch ((greater)){
            case 0 -> System.out.println( a +" is greater");
            case 1 -> System.out.println((b +"is greater"));
            case 2-> System.out.println((c+ "c is greater"));
            default -> System.out.println("all are equal");
        }


    }
}
class triangle{
    public static void main(String[] args) {
        Scanner tri = new Scanner(System.in);
        System.out.println("enter the first side");
        int a = tri.nextInt();
        System.out.println("enter the second side");
        int b = tri.nextInt();
        System.out.println("enter the third side");
        int c = tri.nextInt();
        switch ((a==b && a==c)? 0:1) {
            case 0: System.out.println("triangle is equilateral");
            break;
            case 1 : switch ((a==b)||(b==c)||(c==a)? 0:1){
                case 0->System.out.println("triangle is isosceles");
                case 1 -> System.out.println("triangle is scalene");


            }break;

        }
    }
}
class Angle {
    public static void main(String[] args) {
        Scanner max = new Scanner((System.in));
        System.out.println("enter the first angle");
        int a = max.nextInt();
        System.out.println("enter the second angle");
        int b = max.nextInt();
        System.out.println("enter the third angle");
        int c = max.nextInt();
        int greater = (a==b && a==c)? 0:((a==b)||(b==c)||(c==a))? 1:((c!=a)||(b!=a)||(b!=c))? 2 :3;
        switch ((greater)){
            case 0 -> System.out.println("triangle is Equilateral");
            case 1 -> System.out.println((" triangle is isoscles"));
            case 2-> System.out.println((c+ "triangle is scalene"));

        }


    }
}


