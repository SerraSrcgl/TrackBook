import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectionClass {
    Connection conn=null;


    public static Connection ConnecrDb(){//burada daatbase baglamsi yaptik

        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:/Users/mehlikabilgicli/Desktop/BANK PROJECT/banka.db");
            return conn;

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}