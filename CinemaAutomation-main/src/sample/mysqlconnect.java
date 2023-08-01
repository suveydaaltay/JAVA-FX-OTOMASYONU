package sample;

import java.sql.DriverManager;

import javax.swing.JOptionPane;
import java.sql.Connection;
public class mysqlconnect {
    Connection conn=null;
    public static Connection ConnectDb(){
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/sinema_java","root","");

        return conn;
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
            return null;
        }

    }
}
