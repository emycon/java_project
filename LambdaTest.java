import java.util.List;
import java.util.ArrayList;

public class LambdaTest {
    // final static String salutation = "Hello ";

    public static void main(String args[]) {
        List<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Linda");
        names.add("Smith");
        names.add("Zack");
        names.add("Bob");

        names.forEach(System.out::println);

        // LambdaTest tester = new LambdaTest();

        // MathOperation addition = (int a, int b) -> a + b;
        // MathOperation subtraction = (a, b) -> a - b;
        // MathOperation multiplication = (int a, int b) -> {
        //     return a * b;
        // };
        // MathOperation division = (int a, int b) -> a / b;

        // // 输出结果
        // System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        // System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        // System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        // System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 没有括号的表达式
        // GreetingService greetService1 = message -> System.out.println(salutation + message);

        // 有括号的表达式
        // GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        // 调用sayMessage方法输出结果
        // greetService1.sayMessage("Shiyanlou");
        // greetService2.sayMessage("Classmate");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
          return mathOperation.operation(a, b);
       }

}