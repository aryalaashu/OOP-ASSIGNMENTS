import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
//        list.add(0, 6);
//        list.add(0, 7);
//        list.add(0, 8);
//        list.add(0, 9);
//        list.add(0, 10);
//        System.out.println(list);
//        list.set(0,11);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);


//        ArrayList<String> List = new ArrayList<>();
//        List.add("Aashutosh");
//        List.add("Utasv");
//        List.add("Abhishek");
//        List.add("bimali");
//        List.add("Abhyas");
//
//        System.out.println(List.get(0));
//        for (int i = 1; i<=list.size(); i++){
//            System.out.println(list.get(0));
//
//        }
//        list.remove(1);
//        list.remove("bimali");
//        System.out.println(list);


                Scanner input = new Scanner(System.in);
                ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
                for (int i = 1; i <= 10; i++) {
                    System.out.print("Enter a number: ");
                    int num = input.nextInt();
                    arrayList.add(num);
                }
                System.out.println("Sum of prime: " + sumPrime(arrayList));
            }

            public static int sumPrime(ArrayList<Integer> a) {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    int factors = 0;
                    for (int j = 2; j < a.get(i); j++) {
                        if (a.get(i) % j == 0) {
                            factors++;
                            break;
                        }
                    }
                    if (factors == 0) {
                        sum += a.get(i);
                    }
                }
                return sum;
            }
        }

class A10Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i=0; i<=2; i++) {
            System.out.print("Enter the name: ");
            String carName = input.next();
            arrayList.add(carName);
        }
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}

class A10Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
        for (int i=1; i<=10; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            arrayList.add(num);
        }
        System.out.println("Sum of prime: "+sumPrime(arrayList));
    }

    public static int sumPrime(ArrayList<Integer> a) {
        int sum=0;
        for (int i=0; i<10; i++){
            int factors=0;
            for (int j = 2; j<a.get(i); j++){
                if (a.get(i)%j==0) {
                    factors++;
                    break;
                }
            }
            if (factors==0) {
                sum+=a.get(i);
            }
        }
        return sum;
    }
}

class A10Question3 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        ArrayList<Integer> array= new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            System.out.print("Enter the number ");
            int num= demo.nextInt();
            array.add(num);
        }
        System.out.println("Original Array: "+array);
        ascendingSort(array);
        descendingSort(array);
    }
    public static void ascendingSort(ArrayList<Integer> array){
        int a,b,len= array.size();
        for (int i=0;i< len;i++){
            for (int j=0;j< len-i-1;j++){
                a= array.get(j);
                b= array.get(j+1);
                if (a>b){
                    array.set(j,b);
                    array.set(j+1,a);
                }
            }
        }
        System.out.println("Ascending Order: "+array);
    }

    public static void descendingSort(ArrayList<Integer> array){
        int a,b,len= array.size();
        for (int i=0;i< len;i++){
            for (int j=0;j< len-i-1;j++){
                a= array.get(j);
                b= array.get(j+1);
                if (a<b){
                    array.set(j,b);
                    array.set(j+1,a);
                }
            }
        }
        System.out.println("Descending Order: "+array);
    }
}



