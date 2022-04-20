import java.util.Scanner;

 class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid Day");
                break;



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



class A5Question10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the week number:");
        int day= input.nextInt();

        switch (day) {
            case 1 -> System.out.println("It is Sunday");
            case 2 -> System.out.println("It is Monday");
            case 3 -> System.out.println("It is Tuesday");
            case 4 -> System.out.println("It is Wednesday");
            case 5 -> System.out.println("It is Thursday");
            case 6 -> System.out.println("It is Friday");
            case 7 -> System.out.println("It is Saturday");
            default -> System.out.println("Invalid Number!");
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
