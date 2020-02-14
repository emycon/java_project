import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * MapTest
 */
public class MapTest {
    public Map<String, Course> courses;

    public MapTest() {
        this.courses = new HashMap<String, Course>();
    }

    public void testPut() {
        Scanner console = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            System.out.println("请输入课程 ID：");
            String ID = console.next();

            Course cr = courses.get(ID);
            if (cr == null) {
                //提示输入课程名称
                System.out.println("请输入课程名称：");
                String name = console.next();
                //创建新的课程对象
                Course newCourse = new Course(ID,name);
                //通过调用 courses 的 put 方法，添加 ID-课程映射
                courses.put(ID, newCourse);
                System.out.println("成功添加课程：" + courses.get(ID).name);
            }
            else {
                System.out.println("该课程 ID 已被占用");
                continue;
            }
        }
        console.close();
    }

    public void testKeySet() {
        Set<String> keysSet = courses.keySet();
        for (String crID: keysSet) {
            Course cr = courses.get(crID);
            if(cr != null) {
                System.out.println("课程：" + cr.name);
            }
        }
    }

    public void testRemove() {
        //获取从键盘输入的待删除课程 ID 字符串
        Scanner console = new Scanner(System.in);
        while(true){
            //提示输出待删除的课程 ID
            System.out.println("请输入要删除的课程 ID！");
            String crID = console.next();
            //判断该 ID 是否对应的课程对象
            Course cr = courses.get(crID);
            if(cr == null) {
                //提示输入的 ID 并不存在
                System.out.println("该 ID 不存在！");
                continue;
            }
            courses.remove(crID);
            System.out.println("成功删除课程" + cr.name);
            break;
        }
        console.close();
    }

    public void testEntrySet() {
        Set<Entry<String, Course>> entrySet = courses.entrySet();
        for(Entry<String,Course> entry: entrySet) {
            System.out.println("取得键：" + entry.getKey());
            System.out.println("对应的值为：" + entry.getValue().name);
        }
    }

    public void testModify() {
        System.out.println("请输入要修改的课程 ID：");
        //创建一个 Scanner 对象，去获取从键盘上输入的课程 ID 字符串
        Scanner console = new Scanner(System.in);
        while(true) {
            //取得从键盘输入的课程 ID
            String crID = console.next();
            //从 courses 中查找该课程 ID 对应的对象
            Course course = courses.get(crID);
            if(course == null) {
                System.out.println("该 ID 不存在！请重新输入！");
                continue;
            }
            //提示当前对应的课程对象的名称
            System.out.println("当前该课程 ID，所对应的课程为：" + course.name);
            //提示输入新的课程名称，来修改已有的映射
            System.out.println("请输入新的课程名称：");
            String name = console.next();
            Course newCourse = new Course(crID,name);
            courses.put(crID, newCourse);
            System.out.println("修改成功！");
            break;
        }
        console.close();
    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
        mt.testRemove();
        mt.testModify();
        mt.testEntrySet();

    }
}