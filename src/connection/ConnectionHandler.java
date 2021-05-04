/**
 *
 * @author macuser
 */
package connection;
import java.sql.*;

/**
 *
 * @author macuser
 */
public class ConnectionHandler {
    
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymsystem", "root", "");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
    
}

