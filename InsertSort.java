import java.util.Arrays;

/**
 * InsertSort
 */
public class InsertSort {
    public static void sort(int[] arr) {
        int temp;
        for (int i=1; i<arr.length; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {5, 3, 4, 1, 2};
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}