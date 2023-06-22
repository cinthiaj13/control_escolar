
package controlescolar;

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    public static final String URL ="jdbc:mysql://localhost:3306/controlescolar";
    public static final String usuario="root";
    public static final String contraseña="l0v3s70r717309";
    
    public String getURL(){
        return this.URL;
    }
        public String getUsuario(){
        return this.usuario;
    }
            public String getcontraseña(){
        return this.contraseña;
    }
    
    public Connection getConnection(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             conexion=(Connection) DriverManager.getConnection(URL,usuario,contraseña);
             JOptionPane.showMessageDialog(null, "Conexion exitosa");    
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el inicio de sesión");
        }
        return conexion;
    }

    public Statement getStatement() throws SQLException{
        
        Connection conexion = getConnection(); 
        Statement st = conexion.createStatement();
       // ResultSet rs = st.executeQuery(query);
        return st;
                
    }
    
    public ResultSet getResult(String query) throws SQLException{
        Statement st = getStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
    }
}
