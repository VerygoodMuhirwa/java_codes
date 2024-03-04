import java.util.Scanner;

class Minor extends Exception{
    public Minor(String message){
        super(message);
    }
}

public class Custom  extends Exception{
    public static void main(String ...args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter your age: ");
            int age= scanner.nextInt();
            if(age< 18){
                throw new Minor("You are not allowed to vote, too young");
            }else if (age > 30){
                throw new Minor("You are old enough, and that makes you not eligible to vote ");
            }
        }catch (Minor e){
            e.printStackTrace();

        }fina
    }
}
