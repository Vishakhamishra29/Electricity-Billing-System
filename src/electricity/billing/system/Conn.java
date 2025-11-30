package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Correct URL for MySQL 8
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebs?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "Vishakha@123"
            );

            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
