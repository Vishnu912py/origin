import java.sql.*;
import java.io.*;

public class prog5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost3306/student", "root", "Vishnu@912");
            Statement st = con.createStatement();
            String Query = "Select * from employee";
            ResultSet rs = st.executeQuery(Query);
            while (!rs.next()) {
                System.out.printf("Name: %s", rs.getString(1));
            }


        } catch (ClassNotFoundException e) {
            System.out.println("The Class was not found");
        } catch (SQLException se) {
            System.out.println("The sql query is not effected ");
        }

    }
}
