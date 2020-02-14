import java.util.Arrays;

public class SystemTest {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.home"));
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        System.arraycopy(a, 0, b, 0, 4);
        System.out.println(Arrays.toString(b));
    }
}