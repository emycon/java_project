import java.util.Scanner;

public class PrintWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.close();

        String a = "";
        switch(x){
            case 1:
                a = "一";
                break;
            case 2:
                a = "二";
                break;
            case 3:
                a = "三";
                break;
            case 4:
                a = "四";
                break;
            case 5:
                a = "五";
                break;
            case 6:
                a = "六";
                break;
            case 7:
                a = "七";
                break;
        }
        System.out.println("今天是星期" + a);
    }
}
