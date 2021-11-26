/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ConexionBD {
public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/aerolinea","root","");
            PreparedStatement ps = conexion.prepareStatement("SHOW FULL TABLES FROM Aerolinea");
            ResultSet rs = ps.executeQuery();
            mostrarDatos(rs);
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error de conexión");
        }
    }
public static void mostrarDatos(ResultSet rs){
        try{
            ResultSetMetaData rsmeta = rs.getMetaData();
            int ncols = rsmeta.getColumnCount();
            for(int i=1;i<=ncols;i++){
                System.out.print(rsmeta.getColumnName(i)+"\t\t");
            }
            System.out.print("\n");
            
            while(rs.next()){
                for(int j=1;j<=ncols;j++){
                    System.out.print(rs.getString(j)+"\t\t");
                }
                System.out.print("\n");
            }
        }catch(Exception e){
            System.out.println("Error en resulset");
        }
    }
}
