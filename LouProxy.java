/**
 * LouProxy
 */
public class LouProxy implements LouSubject {
    private LouSubject target;

    public LouProxy() {
        this.target = new LouRealSubject();
    }
    
    @Override
    public void build(){
        System.out.println("购买材料");
        target.build();
        System.out.println("封顶");
    }

}