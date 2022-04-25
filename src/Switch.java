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
class A5Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        switch ((num1 % 5 == 0 && num1 % 11 == 0) ? 1 : 0) {
            case 1 -> System.out.println("Divisible by 5 and 11!");
            case 0 -> System.out.println("Not divisible by 5 and 11!");
        }
    }
}
class A5Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        switch (year%4) {
            case 0 : switch (year%100) {
                case 0 :
                    switch (year % 400) {
                        case 0 -> System.out.println("Leap Year");
                        default -> System.out.println("Normal Year");
                    }
                    break;
                default:
                    System.out.println("Leap Year");
                    break;
            }break;
            default:
                System.out.println("Normal Year");
                break;
        }
    }
}
class A5Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character ");
        char char1;
        char1 = Character.toLowerCase(input.next().charAt(0));
        switch (char1) {
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> System.out.println("The character is an alphabet.");
            default -> System.out.println("The character is not an alphabet.");
        }
    }
}
class A5Question8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the character ");
        char char1 ;
        char1= Character.toLowerCase(input.next().charAt(0));
        switch (char1) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> System.out.println("The character is a digit.");
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> System.out.println("The character is an alphabet.");
            default -> System.out.println("The character is a special character");
        }
    }
}
class A5Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char upperLower = input.next().charAt(0);
        char check = Character.toLowerCase(upperLower);

        switch ((upperLower==check)?0:1) {
            case 1 -> System.out.println("Character is uppercase");
            case 0 -> System.out.println("Character is lowercase");
        }
    }
}
class A5Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient of x\u00b2: ");
        int a = input.nextInt();
        System.out.println("Enter coefficient of x: ");
        int b = input.nextInt();
        System.out.println("Enter constant: ");
        int c = input.nextInt();
        double d = (b * b) - (4 * a * c);

        switch (d >= 0 ? 1 : 0) {
            case 1 -> {
                double e = Math.sqrt(d);
                double root1 = (e - b) / (2 * a);
                double root2 = -(b + e) / (2 * a);
                System.out.println("Solution 1: " + root1 + "\nSolution 2: " + root2);
            }
            case 0 -> System.out.println("Result includes complex number.");
        }
    }
}
class A5Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp = input.nextInt();
        System.out.print("Enter SP:");
        int sp = input.nextInt();

        switch (sp > cp ? 0 : 1) {
            case 1 -> System.out.println("Profit");
            case 0 -> System.out.println("Loss");
            default -> System.out.println("Neither profit nor loss");
        }
    }
}
class A5Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;
        int salaryInt = (salary-1)/10000;

        switch (salaryInt) {
            case 0 -> {
                hra = 0.2 * salary;
                da = 0.8 * salary;
            }
            case 1 -> {
                hra = 0.25 * salary;
                da = 0.9 * salary;
            }
            default -> {
                hra = 0.3 * salary;
                da = 0.95 * salary;
            }
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}
class A5Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        int unitsInt = units/50;
        switch (unitsInt) {
            case 0 -> price=units*0.5;
            case 1,2 -> price=25+(units-50)*0.75;
            case 3,4 -> price=25+75+(units-150)*1.2;
            default -> price=25+75+120+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}
class A5Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = input.nextInt();
        hours = hours%24;
        System.out.println("Enter minutes: ");
        input.nextInt();

        switch (hours) {
            case 0,1,2,3,4,5,6,7,8,9,10,11 -> System.out.println("AM");
            case 13,14,15,16,17,18,19,20,21,22,23 -> System.out.println("PM");
        }
    }
}
class A5Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(-num);
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
class A5Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (a): ");
        int a = input.nextInt();
        System.out.println("Enter another number (b): ");
        int b = input.nextInt();
        int temp;

        switch (a == b ? 0 : 1) {
            case 1 -> {
                temp = b;
                b = a;
                a = temp;
                System.out.println("Swapped value of a: " + a);
                System.out.println("Swapped value of b: " + b);
            }
            case 0 -> System.out.println("Numbers are equal!");
        }
    }
}
class A5Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,x;
        System.out.print("Enter the number ");
        num= input.nextInt();
        x= num%2;
        switch (x) {
            case 0 -> num += 1;
        }
        System.out.println(num);
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


