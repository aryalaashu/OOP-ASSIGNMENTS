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
