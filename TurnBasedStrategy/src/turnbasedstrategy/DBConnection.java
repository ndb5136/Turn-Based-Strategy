
package turnbasedstrategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cxz5100
 */
public class DBConnection {
    
    private static final String strDBClass = "org.sqlite.JDBC";
    private static final String strJDBCString = "jdbc:sqlite:";
    private static String strDBName = "src\\turnbasedstrategy\\database.db3";  
    
    public Connection connectToDB(){
        Connection connect;
        
        try {
            Class.forName(strDBClass);
            connect = DriverManager.getConnection(strJDBCString + strDBName);
            return connect;
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}
