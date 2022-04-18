//Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
public class Q_4_percentage {
    public static void main(String[] args) {
        float sub1 = 80;
        float sub2 = 80;
        float sub3 = 80;
        float sub4 = 80;

        float total = sub1+sub2+sub3+sub4;
        float percentage = total/400 *100;
        String result;

        result =  (percentage>=70)?"First class": (percentage>=59)? "upper second class": (percentage>=49)? "second class": (percentage>39)? "Third class":"Fail";
        System.out.println("Hey, your result is "+result);
    }
}
