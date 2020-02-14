public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("I");
        s.append(" java");
        s.insert(1, " love");
        String t = s.toString();
        System.out.println(t);
    }

}