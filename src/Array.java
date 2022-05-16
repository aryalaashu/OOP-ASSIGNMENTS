import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(b[0]);
        System.out.println(a.length);
        int sum = 0;

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            sum += i;
            if (i%2==0) {
                System.out.println(i);

            }
        }
        System.out.println(sum);
    }




    }
    class Input_array{
        public static void main(String[] args) {
            int[] c = new int[10];
            Scanner scanner = new Scanner(System.in);
            int i;
            for (i = 0; i < c.length; i++) {
                System.out.println("Enter a number");
                int input = scanner.nextInt();
                c[i] = input;


            }

            System.out.println(Arrays.toString(c));

        }
    }

class DOUBLE_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int[] a = new int[10];
        for (int i=0;i<a.length;i++){
            System.out.println("Enter a number: ");
            a[i]=input.nextInt();

            if (a[i]%2!=0) {
                sum+=a[i];
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println("Sum: "+sum);
    }
}

class ClassQuestion {
    public static void main(String[] args) {
        System.out.println(createArray());
    }

    public static String createArray () {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];

        for (int i=0;i<a.length;i++) {
            System.out.println("Enter a number: ");
            a[i] = input.nextInt();
        }
        return (Arrays.toString(a));
    }
}

class ars{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
    }

    public static String[] createArray() {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a word:");
            String input = scanner.next();
            a[i] = input;

        }
        return a;
    }
}

class Q1 {
    public static void main(String[] args) {
        Scanner matrix = new Scanner(System.in);
        int[] a = new int[10];
        int j=0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            int num = matrix.nextInt();
            a[i] = num;
        }
        maxMin(a);
    }

    public static void maxMin(int[] a) {
        int min = a[0], max = 0;
        for (int j : a) {
            if (j < min) {
                min = j;
            } else if (j > max) {
                max = j;
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
}

class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 2, col = 3;
        int[][] arr = new int[row][col];

        for (int k = 1; k <= 2; k++) {
            System.out.println("For matrix " + k + ":");

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println("Enter Number (a" + (i + 1) + (j + 1) + "): ");
                    arr[i][j] += input.nextInt();
                }
            }
        }
        System.out.println("Sum of two matrices: "+Arrays.deepToString(arr));
    }
}

class Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 2, col = 3;
        int[][] arr = new int[row][col];

        for (int k = 1; k <= 2; k++) {
            System.out.println("For matrix " + k + ":");

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println("Enter Number (a" + (i + 1) + (j + 1) + "): ");
                    if (k == 1) {
                        arr[i][j] = 1;
                    }
                    arr[i][j] *= input.nextInt();
                }
            }
        }
        System.out.println("Multiplication of two matrices: "+Arrays.deepToString(arr));
    }
}

