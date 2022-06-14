import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class java {
    Connection conn = null;
    public static Connection ConnectDb(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:seal","sa","sap");
            return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
