
package billing_system_project;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Billing_system_project {
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        try {
             UIManager.setLookAndFeel(new FlatDarkLaf());
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Billing_system_db;integratedSecurity=true;encrypt=false";
            Connection con=DriverManager.getConnection(url);
            System.out.println("yes");
            
            
            
            /******************************* *    Splash Screen code*    *************************************/
            
            
            
            int x;
            splash s=new splash();
            login l=new login();
            s.setVisible(true);
            try{
                for( x=0;x<=100;x++)
                {
                    Thread.sleep(35);
                    s.progress.setValue(x);
                    s.Percent.setText(Integer.toString(x)+"%");
                     if(x==100)
                {
                     s.Percent.setText("Welcome ♥   ");
                    Thread.sleep(1500);
  
                    s.dispose();
                    l.setVisible(true);
                }
                }
            }
            catch(Exception e){
            }
            
        }
      
        catch(SQLException e){
                        System.out.println("no");
                        e.printStackTrace();

        }


    }
    
}
