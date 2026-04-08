package baseDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Instalacion;
import modelo.Reserva;
import modelo.Usuario;
import utilidades.Encriptacion;

public class OperacionesTabla {

    Conexion bd;

    public OperacionesTabla(Conexion bd) {
        this.bd = bd;
    }

    
    public boolean contraCorrecta(String login, String contra) {
        boolean resultado = false;
        contra= Encriptacion.getMD5(contra);
        String sql="select * from usuarios where login =? and  contrasena=?";
        PreparedStatement sentencia;
        
        try {
            sentencia=bd.getConexion().prepareStatement(sql);
            sentencia.setString(1, login);
            sentencia.setString(2, contra);
          ResultSet registros=sentencia.executeQuery(); //sentencia.executeQuery() devuelve una colecion especial con los campos y columnas que devuelve la query, con esta linea estamosmetiendo esto dentro de un ResultSet
        
          if(registros.next())
            resultado=true;
        registros.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesTabla.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public Usuario buscarUsuario(String login) {
        Usuario usuario = null;
        
        

        return usuario;
    }

    public ArrayList<Instalacion> todasInstalaciones() {

        ArrayList<Instalacion> instalaciones = new ArrayList<>();
        
        return instalaciones;
    }

    public ArrayList<Reserva> todasReservas(String codigo) {

        ArrayList<Reserva> reservas = new ArrayList<>();
       
        
        return reservas;
    }

    public boolean instalacionLibre(String fecha, String codigo) {
        boolean resultado = false;
        
        
        return resultado;
    }

    public int crearReserva(String dni, String telefono, String fecha, String codigo) {
        int resultado = 0;
        
        
        return resultado;
    }

}
