import java.util.*;

/**
 * SetTest
 */
public class SetTest {

    public List<Student> students;

    public SetTest() {
        students = new ArrayList<Student>();
    }

    public void testAdd() {
        Student st1 = new Student("1", "张三");
        students.add(st1);

        //添加到List中的类型均为Object，所以取出时还需要强转
        Student st2 = new Student("2","李四");
        students.add(st2);

        Student[] student = {new Student("3", "王五"),new Student("4", "马六")};
        students.addAll(Arrays.asList(student));

        Student[] student2 = {new Student("5", "周七"),new Student("6", "赵八")};
        students.addAll(Arrays.asList(student2));
    }

    public void testForEach() {
        System.out.println("有如下学生（通过for each）：");
        for(Object obj:students){
            Student st = (Student)obj;
            System.out.println("学生：" + st.id + ":" + st.name);
        }
    }

    public void testForEachForSer(PD pd){
        for(Student s: pd.students) {
        System.out.println("选择了学生：" + s.id + ":" + s.name);
        }
    }

    public static void main(String[] args){
        SetTest st = new SetTest();
        st.testAdd();
        st.testForEach();
        PD pd = new PD("1", "张老师");
        System.out.println("请：" + pd.name + "选择小组成员！");
        Scanner console = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            System.out.println("请输入学生 ID");
            String studentID = console.next();
            for (Student s: st.students) {
                if(s.id.equals(studentID)){
                    pd.students.add(s);
                }
            }
        }
        console.close();
        st.testForEachForSer(pd);
    }
}