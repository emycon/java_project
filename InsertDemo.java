import java.sql.*;

public class InsertDemo {
    public static Connection connection = null;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            Statement statement = connection.createStatement();
            //单条插入
            boolean execute = statement.execute("insert into user values (10,'shiyanlou',22,'男')");
            if (execute) {
                System.out.println("插入失败");
            }else {
                System.out.println("单条插入成功");
            }
            statement.close();
            connection.close();
            //提交到数据库
            // connection.commit();
            // System.out.println("提交批量插入完成");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}