package Dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionClass {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/ecommerce";

    static final String UNAME = "root";
    static final String UPASS = "";

    public Connection createConnection() {

        try {
            Connection connection;

            //step 2 register jdbc driver
            Class.forName(JDBC_DRIVER);

            // step 3 open a connection
            System.out.println("connecting to database...");
            
            connection = DriverManager.getConnection(DB_URL, UNAME, UPASS);
            
            System.out.println("connecting to database connected");
            
            return connection;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
