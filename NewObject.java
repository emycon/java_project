public class NewObject {

    public static void main(String[] args) {
        People LiLei = new People(180, 22, 22);

        // LiLei.height = 170;
        LiLei.setHeight(170);
        // LiLei.age = 20;
        LiLei.setAge(20);
        LiLei.sex = 1;

        LiLei.printBaseMes();
    }
}