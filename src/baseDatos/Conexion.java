package baseDatos;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    Connection conexion;

    
    public int registrarDriver() {
        int resultado;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            resultado = 0;
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
            resultado = -1;
        }
        return resultado;
    }

  
    public int conectar() {
        int resultado;
        Config config=new Config();

        try {
         String url=config.getProps("db.url");
         String usuario=config.getProps("db.user");
         String contrasena=config.getProps("db.pass");
            conexion = DriverManager.getConnection(url, usuario,contrasena);
            resultado = 0;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            resultado = -1;
        }
        return resultado;
    }


    public int establecer() {
        int resultado;
        resultado = registrarDriver();
        if (resultado != -1) {
            resultado = conectar();
        }
        return resultado;
    }

   
    public void cerrar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getConexion() {
        return conexion;
    }

}
