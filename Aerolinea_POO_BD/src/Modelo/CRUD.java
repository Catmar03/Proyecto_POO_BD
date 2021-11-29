package Modelo;

import java.util.List;



public interface CRUD {

    public List listar();

    public int add(Object[]  o);

    public int acualizar(Object [] o);

    public void eliminar(int id);

//    public int buscar();
    //   public int modificar();
}
