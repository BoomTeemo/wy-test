import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名wy
        String url = "jdbc:mysql://localhost:3306/wy";
        //声明Connection对象
        Connection connection;
        //mysql用户名
        String uer = "root";
        //mysql密码
        String password = "";
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection方法，链接数据库
            connection = DriverManager.getConnection(url,uer,password);
            if (!connection.isClosed()) {
                System.out.println("succeeded");
            }
            //2.创建statement对象，用来执行sql语句
            Statement statement = connection.createStatement();
            //要执行的sql语句
            String sql = "select * from student";
            //3.ResultSet类，用来存放获取的结果集
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("-----------");
            System.out.println("结果如下:");
            System.out.println("name"+"age");
            String name = null;
            String age = null;
            while (resultSet.next()){
                //获取name这列数据
                name = resultSet.getString("name");
                //获取age这列数据
                age = resultSet.getString("age");
                //输出结果
                System.out.println(name+"\t"+age);
            }
            resultSet.close();
            connection.close();
        } catch (ClassNotFoundException e1) {
            //数据库驱动类异常处理
            e1.printStackTrace();
        } catch (SQLException e1) {
            //数据库连接失败异常处理
            e1.printStackTrace();
        }finally {
            System.out.println("数据库数据成功获取");
        }

    }

}