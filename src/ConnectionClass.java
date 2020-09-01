import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConnectionClass {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/loginandregister", "root", "");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return con;
    }


    public void get_value() {
        ArrayList<Book> ogrenciler = new ArrayList<>();
        String query = "SELECT * FROM `users`";
        try {

            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Book user;
            while (rs.next()) {


                user = new Book(rs.getInt("id"), rs.getString("Name"), rs.getString("Surname"), rs.getString("Email"), rs.getString("Password"));
                ogrenciler.add(user);
            }


        } catch (Exception e) {
        }
        AbstractButton jTable1 = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        Object[] row = new Object[5];
        for (int i = 0; i < ogrenciler.size(); i++) {
            row[0] = ogrenciler.get(i).getAuthor();
            row[1] = ogrenciler.get(i).getName();
            row[2] = ogrenciler.get(i).getNumberOfPages();
            row[3] = ogrenciler.get(i).getCategory();

            model.addRow(row);


        }
    }

}