package accesAuxDonnees;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.sql.DataSource;



/**
 *
 * @author poncho
 */
public class SourceMySQL {
    
    
     public static DataSource getSource(PasswordAuthentication login) throws Exception {
       
        String user = login.getUserName();
        String pwd = new String(login.getPassword());
       
        Properties props = new Properties();
        FileInputStream fichier = new FileInputStream("src/connexion.properties");
        props.load(fichier);
        MysqlDataSource ds = new MysqlDataSource();
        
        
        
        
        ds.setPortNumber(Integer.parseInt(props.getProperty("port")));
        ds.setDatabaseName(props.getProperty("service"));
        ds.setServerName(props.getProperty("serveur"));
        ds.setUser(user);
         String password;
        ds.setPassword(pwd);
        return ds;
        
        
    }
    
    
    
}
