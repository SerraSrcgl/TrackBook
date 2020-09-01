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
            Class.forName("/Users/serra/Library/Application Support/JetBrains/IntelliJIdea2020.2/consoles/db/4798cac1-7fdd-4a28-96ff-bd24d46b25fd/console.sql");
            con = DriverManager.getConnection("jdbc:oracle:thin:@db-oracle.pjwstk.edu.pl:1521:baza", "s19687", "");

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