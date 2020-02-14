import java.util.ArrayList;
import java.util.List;

public class Test {
    public void testDemo(List<?> s) {
        for (Object obj : s) {
            System.out.println("我的类型是" + obj.getClass().getName());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Dog a0 = new Dog();
        Animal a1 = new Animal();
        List<Animal> s = new ArrayList<Animal>();
        s.add(a0);
        s.add(a1);
        test.testDemo(s);
        // Test test = new Test();
        // Dog d = new Dog();
        // Animal a0 = new Animal();
        // Animal a1 = test.testDemo(a0, d);
        // System.out.println("我是整数 a，我的类型是" + a1.getClass().getName());
    }

    // void f(int i) {
    // System.out.println("i=" + i);
    // }

    // void f(float f) {
    // System.out.println("f=" + f);
    // }

    // void f(String s) {
    // System.out.println("s=" + s);
    // }

    // void f(String s1, String s2) {
    // System.out.println("s1+s2="+(s1+s2));
    // }

    // void f(String s, int i) {
    // System.out.println("s="+s+",i="+i);
    // }
}