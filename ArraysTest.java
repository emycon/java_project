import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        int[] arr = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, 33);
        System.out.println("值为33的元素索引："+i);
    }

}