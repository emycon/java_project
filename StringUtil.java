import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        in.close();

        StringBuilder res = new StringBuilder(a);
        for(int i=0; i<res.length(); i++){
            if (res.charAt(i)==' ') {
                // System.out.println(i);
                res.deleteCharAt(i);
                i--;
            }
            //else{
            //     res.charAt(i);
            // }
        }
        System.out.println(res.toString());
    }
}