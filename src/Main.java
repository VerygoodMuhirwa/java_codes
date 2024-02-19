import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p= Pattern.compile(".ca");
        Matcher m= p.matcher("rca");
        boolean s= m.matches();
        boolean n= Pattern.matches("[amn]", "m");
        boolean a= Pattern.matches("^[a-zA-Z]","e       ");
        System.out.println(n);
        System.out.println(a);

        // this is also more about characters in regular expressions
        boolean b= Pattern.matches("[a-z &&[^p-q]]","p");
        System.out.println(b);

    }
}