public class LouClient{
    public static void main(String[] args){
        LouSubject proxy = new LouProxy();
        proxy.build();
    }
}