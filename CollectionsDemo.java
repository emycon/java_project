import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CollectionsDemo
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(12);
        System.out.print("初始顺序：");
        list.forEach(v -> System.out.print(v + "\t"));

        Collections.shuffle(list);
        System.out.print("\n打乱顺序：");
        list.forEach(v -> System.out.print(v + "\t"));

        Collections.reverse(list);
        System.out.print("\n反转集合：");
        list.forEach(v -> System.out.print(v + "\t"));

        Collections.swap(list,0,list.size()-1);
        System.out.print("\n交换第一位和最后一位：");
        list.forEach(v -> System.out.print(v + "\t"));

        Collections.sort(list);
        System.out.print("\nSort排序后：");
        list.forEach(v -> System.out.print(v + "\t"));

        System.out.print("\n二分查找数值7的位置："+Collections.binarySearch(list, 7));

        // List<Integer> synchronizedList = Collections.synchronizedList(list);
    }

}