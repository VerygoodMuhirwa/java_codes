public class WithThrows {
    public static int divide(int a, int b)throws  ArithmeticException{
        int quotient = a/b;
        return quotient;
    }

    public static void main(String ... args){
        divide(3,0);
    }
}
