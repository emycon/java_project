public class People {

    // private String name = "LiLei";
    // static String ID = "510xxx199X0724XXXX";
    public void peopleInfo() {
        final String sex = "man";
        class Student {
            String ID = "20151234";
            public void print() {
                System.out.println("访问外部类的方法中的常量sex：" + sex);
                System.out.println("访问内部类中的变量ID:" + ID);
            }
        }

        Student a = new Student();
        a.print();
    }

    public void peopleInfo2(boolean b) {
        if(b){
            final String sex = "man";
            class Student {
                String ID = "20151234"; //内部类中的常量
                public void print() {
                    System.out.println("访问外部类的方法中的常量sex：" + sex);
                    System.out.println("访问内部类中的变量ID:" + ID);
                }
            }
            Student a = new Student();
            a.print();
        }
    }
    // public static class Student {
    //     String ID = "20151234";

    //     public void stuInfo() {
    //         System.out.println("访问外部类中的name：" + (new People().name));
    //         System.out.println("访问外部类中的ID：" + People.ID);
    //         System.out.println("访问内部类中的ID：" + ID);
    //     }
    // }

    //测试成员内部类
    public static void main(String[] args) {
        People b = new People();
        System.out.println("定义在方法内：===========");
        b.peopleInfo();
        System.out.println("定义在作用域内：===========");
        b.peopleInfo2(true);
        // People a = new People();     //创建外部类对象，对象名为a
        // Student b = new Student(); //使用外部类对象创建内部类对象，对象名为b
        // 或者为 People.Student b = a.new Student();
        // b.stuInfo();   //调用内部对象的suInfo方法
    }
    // private double height;
    // private int age;
    // int sex;

    // public People(double h, int a, int s){
    //     height = h;
    //     age = a;
    //     sex = s;
    // }

    // public double getHeight() {
    //     return height;
    // }

    // public void setHeight(double newHeight) {
    //     height = newHeight;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // void cry() {
    //     System.out.println("我在哭！");
    // }

    // void laugh() {
    //     System.out.println("我在笑！");
    // }

    // void printBaseMes() {
    //     System.out.println("我的身高是"+height+"cm");
    //     System.out.println("我的年龄是"+age+"岁");
    //     if(this.sex==0)
    //         System.out.println("我是男性！");
    //     else
    //         System.out.println("我是女性！");
    // }

}