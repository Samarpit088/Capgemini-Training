package Regex;
import java.util.regex.*;
// Extract All Email Addresses from a Text
public class Q4 {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        extractEmails(text);
    }
    public static void extractEmails(String text) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
