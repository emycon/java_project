import java.util.Arrays;

public class MaxAndMin {

    public static void main(String[] args) {
        int[] data = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        Arrays.sort(data);
        System.out.println(data[0]);
        System.out.println(data[data.length-1]);
    }
}