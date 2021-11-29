package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class ConsultasAsientos extends conexion implements CRUD {
    //preparando consutla 

    PreparedStatement ps = null;
    //vamos por la conexion 
    Connection con = (Connection) getConexion();
    //creamos un variable para hacer la consulta 
    ResultSet rs;

    public void consultarAvion(JComboBox cbx_Aerolinea) {
        //  String sql = "SELECT aerolinea FROM tbavion ORDER BY aerolinea ASC";
        String sql = "SELECT * FROM tbavion ";
       
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            cbx_Aerolinea.addItem("SELECCIONE");
            while (rs.next()) {
                cbx_Aerolinea.addItem(rs.getInt("idAvion"));
            }
            rs.close();
        } catch (Exception e) {
        }

    }

    @Override
    public List listar() {
        java.util.List<Asientos> lista = new ArrayList<>();
        Avion av= new Avion();
        //String sql = "SELECT idAvion, aerolinea,fabricante,Capacidad_Personas, Estado   FROM tbavion";
       String sql = " SELECT IdAsiento, planta, Estado_Asiento, tbavion_IdAvion FROM tbasientos";
      //  String sql="SELECT IdAsiento, planta, Estado_Asiento, IdAsiento, aerolinea FROM tbasientos INNER JOIN tbavion on tbasientos.tbavion_IdAvion= tbavion.IdAvion";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Asientos a = new Asientos();
       
                a.setIdAsiento(rs.getInt(1));
                a.setPlanta(rs.getInt(2));
                a.setEstado(rs.getString(3));
                a.setIdAvion(rs.getInt(4)); 
    

                lista.add(a);
            }
        } catch (SQLException e) {
        }
        return lista;

    }

    @Override
    public int add(Object[] o) {

  int r = 0;
        String sql = "insert into  tbasientos(planta, Estado_Asiento, tbavion_IdAvion) values (?,?,?)";
        try {
            ps = con.prepareStatement(sql);

            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int acualizar(Object[] o) {


 int r = 0;
        String sql = "UPDATE tbasientos SET planta=?,Estado_Asiento=?,tbavion_IdAvion=? WHERE IdAsiento=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
