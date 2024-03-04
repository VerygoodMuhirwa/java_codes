import java.io.IOException;

public class ChainedExceptions{
    public static void main(String ... args){
        int a= 3;
        int b= 0;
        try{
            if(b==0){
                ArithmeticException e= new ArithmeticException("Not allowed to divide with zero");
                e.initCause(new IOException("Is the cause"));
                throw  e;
            }

            System.out.println("The quotient of those numbers is "+ a/b);
        }catch (ArithmeticException e){
e.printStackTrace();
        }
        }
}
