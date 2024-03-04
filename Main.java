public class Main {
    public static void main(String[] args){
        try{
            int [] myNumbers = {1,2,4,5};
            int a =4;
            int b=0;
            int quotient= a/b;
            System.out.println(myNumbers[10]);
            System.out.println(quotient);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            //You can also use e.getMessage to return the message or description of the error
            System.out.println(e.getMessage());
            System.out.println("Something went wrong ");

        }finally {
            System.out.println("Try catch block has already been finished");
        }

    }
}
