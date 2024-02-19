import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] emails = {
                "example@example.com",
                "user@domain.co.in",
                "user@domain.com",
                "user@domain.com",
                "12345@example.com",
                "user123@example.com",
                "user_123@example.com",
                "user+123@example.com",
                "user.123@example.com",
                "user-123@example.com"
        };

        for (String email : emails) {
            System.out.println(email + " is valid? " + isValidEmail(email));
        }
    }
}
