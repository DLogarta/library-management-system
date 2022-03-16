package library.management.system;
import java.sql.*;
import javax.swing.JOptionPane;
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("org.sqlite.JDBC");
            String path = System.getProperty("user.dir");
            String url = "jdbc:sqlite:"+path+"\\libitina.db";
            c=DriverManager.getConnection(url);
            s=c.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.PLAIN_MESSAGE);
        } 
    }
    //src\\SoftE\\Pictures\\
    public void closeConnection(){
        try {
            c.close();
        } catch (Exception e) {
        
        }
        
    }
}
