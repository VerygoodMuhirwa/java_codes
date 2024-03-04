import java.util.Scanner;
public class YourError {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: ");
            int a= scanner.nextInt();
            System.out.println("Enter the second number: ");
            int b= scanner.nextInt();

            if(b==0){
                throw  new ArithmeticException("Please, you are not allowed to divide a number with zero");
            }
            int quotient= a/b;
            System.out.println("The quotient of that number is "+quotient);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
