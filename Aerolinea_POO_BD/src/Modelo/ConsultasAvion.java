/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasAvion extends conexion implements CRUD {

    //preparando consutla 
    PreparedStatement ps = null;
    //vamos por la conexion 
    Connection con = (Connection) getConexion();
    //creamos un variable para hacer la consulta 
    ResultSet rs;

//    @Override
//    public List listar() {
//        java.util.List<Avion> lista = new ArrayList<>();
//    
//        String sql = "SELECT idAvion, aerolinea,fabricante,Capacidad_Personas, Estado   FROM tbavion";
//
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Avion a = new Avion();
//                a.setIdAvion(rs.getInt(1));
//                a.setAerolinea(rs.getString(2));
//                a.setFabricante(rs.getString(3));
//                a.setCapacidadPersonas(rs.getInt(4));
//                a.setEstado(rs.getString(5));
//                lista.add(a);
//            }
//        } catch (SQLException e) {
//        }
//        return (List) lista;
//    }
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into  tbavion(aerolinea,fabricante,Capacidad_Personas,Estado) values (?,?,?,?)";
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
    public int acualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE tbavion SET aerolinea=?,fabricante=?,Capacidad_Personas=?,Estado=? WHERE IdAvion=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM tbavion WHERE IdAvion=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public java.util.List listar() {
        java.util.List<Avion> lista = new ArrayList<>();

        String sql = "SELECT idAvion, aerolinea,fabricante,Capacidad_Personas, Estado   FROM tbavion";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Avion a = new Avion();
                a.setIdAvion(rs.getInt(1));
                a.setAerolinea(rs.getString(2));
                a.setFabricante(rs.getString(3));
                a.setCapacidadPersonas(rs.getInt(4));
                a.setEstado(rs.getString(5));
                lista.add(a);
            }
        } catch (SQLException e) {
        }
        return lista;

    }

    public Avion listarID(int id) {
        Avion a = new Avion();
        String sql = "SELECT * FROM `tbavion` WHERE IdAvion=1;=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                a.setIdAvion(rs.getInt(1));
                a.setAerolinea(rs.getString(2));
                a.setFabricante(rs.getString(3));
                a.setCapacidadPersonas(rs.getInt(4));
                a.setEstado(rs.getString(5));
                
                
            }
        } catch (Exception e) {
        }
        return a;
    }
}
