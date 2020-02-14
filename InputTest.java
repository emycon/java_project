import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] data = new String[100];
        int i = 0;
        while (!in.hasNext("end") && i<100) {
            data[i] = in.nextLine();
            i++;
        }
        //关闭输入
        in.close();
        for (String a:data){
            if (a==null)
                break;
            System.out.println(a);
        }

    }
}