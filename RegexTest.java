import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^1([34578])\\d{9}$");
        Scanner in = new Scanner(System.in);
        String phone = in.nextLine();
        Matcher matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }
}