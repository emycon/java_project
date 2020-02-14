import java.util.Scanner;

public class ConstrastString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        in.close();

        int ln = a.length();

        if(ln == b.length()) {
            for(int i=0; i < ln; i++){
                if(a.charAt(i)!=b.charAt(i)){
                    System.out.println("不同");
                    return;
                }
            }
            System.out.println("相同");
        }
        else {
            System.out.println("不同");
        }
    }
}