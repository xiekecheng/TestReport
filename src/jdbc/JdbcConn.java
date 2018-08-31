package jdbc;

import java.sql.*;

/**
 * @program: TestReport
 * @description: 数据库连接
 * @author: Mr.Xie
 * @create: 2018-08-26 19:56
 **/
public class JdbcConn {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/form?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "xkc19950";
    public static Connection conn;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Statement st;


    public static Connection getConnection() {
        //加载Mysql驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
