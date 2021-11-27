package Modelo;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Consultas extends conexion  {
    public boolean registarPasajero(Perfil_Pasajero pasajero) {
        //preparando consutla 
        PreparedStatement ps = null;
        //vamos por la conexion 
        Connection con = (Connection) getConexion();
        //creamos un variable para hacer la consulta 
        String sql = "INSERT INTO TBPasajero (Nombre,Apellido,DNI,sexo,telefono,Acceso,Usuario,contrañesa) VALUES(?,?,?,?,?,?,?,?))";

        //enviamos los dato
        try {
            // ps =con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            //eviamos lo datos e interactuamos con los datos del modelo
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellidos());
            ps.setInt(3, pasajero.getDNI());
            ps.setString(4, pasajero.getSexo());
            ps.setInt(5, pasajero.getTelefono());
            ps.setString(6, pasajero.getAcceso());
            ps.setString(7, pasajero.getUser());
            ps.setString(8, pasajero.getPassword());
            
            //ejecutamos
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            //cerrar conexion 
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }

  
}
