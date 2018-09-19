package jdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created with IntelliJ IDEA.
 * Description:jdbc 获取MySQL连接并映射到Java对象
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/11 14:27
 */
public class JdbcMain {

    public static void main(String[] args) throws SQLException {
        Connection conn=null;
//        Statement statement=null;
        PreparedStatement sta=null;
        ResultSet rs=null;
        JdbcUser user=new JdbcUser();
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
            //定义sql
            String sql="select * from users";
            //获取statement
//            statement = conn.createStatement();
            //执行sql
//            ResultSet rs= statement.executeQuery(sql);

            //PreparedStatement继承自Statement，比Statement的效率更高，并且可以防止SQL注入，使用较多;
            sta= (PreparedStatement) conn.prepareStatement(sql);
            rs=sta.executeQuery();
            while(rs.next()){

                System.out.println(rs.getInt("u_id")+",");
                System.out.println(rs.getString("u_username")+",");
                System.out.println(rs.getString("u_password")+",");

                user.setuId(rs.getInt("u_id"));
                user.setuUserName(rs.getString("u_username"));
                user.setuUserName(rs.getString("u_password"));
            }
            System.out.println("------------分割线----------------");
            System.out.println(user.toString());

            //关闭
            if (rs!=null){
                rs.close();
            }
//            if (statement!=null){
//                statement.close();
//            }
            if (sta!=null){
                sta.close();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (conn!=null){
                conn.close();
            }
        }


    }
}
