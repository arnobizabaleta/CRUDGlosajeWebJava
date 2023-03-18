package Business;
import BD.Conexion;
import Objects.Productos;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class BusinessProductos {

    public void crearProducto(Productos p){

        Conexion con = new Conexion();

        try{
            Statement st = con.conectar().createStatement();
            st.execute("INSERT INTO productos VALUES('"+ p.getCodProducto()+"', '"+p.getNombre_producto()+"'," +
                    "'"+p.getDescripcion()+"','"+p.getPrecio_producto()+"','"+ p.getDescuento()+"','"+ p.getCod_categoria()+"'," +
                    "'"+p.isActivo()+"')");

        }catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println();
            con.desconectar();
        }
    }


    public void eliminarProducto(int codigo){

        Conexion con = new Conexion();

        try{
            Statement st = con.conectar().createStatement();
            st.execute("DELETE FROM productos WHERE codProducto = '"+ codigo +"' ");

        }catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println();
            con.desconectar();
        }
    }


    public Productos mostrarProducto(int codigo){

        Conexion con = new Conexion();

        try{
            ResultSet rs;
            Statement st = con.conectar().createStatement();
            rs =  st.executeQuery("SELECT * FROM productos WHERE codProducto = '"+ codigo +"' ");

            if(!rs.next()){ return null;}

            Productos p = new Productos(rs.getInt("codProducto"),rs.getString("nombre_producto"),
                    rs.getString("descripcion"),rs.getFloat("precio_producto"),
                    rs.getInt("descuento"),rs.getInt("cod_categoria"),rs.getInt("activo"));

            return  p;

        }catch (Exception e){
            System.out.println(e);
            throw  new Error(e);
        }finally{
            System.out.println();
            con.desconectar();
        }
    }

    public ArrayList<Productos> mostrarProductos(){

        Conexion con = new Conexion();

        try{
            ResultSet rs;
            Statement st = con.conectar().createStatement();
            rs =  st.executeQuery("SELECT * FROM productos");

            ArrayList<Productos> products = new ArrayList<Productos>();

            while(rs.next()){

                Productos p = new Productos(rs.getInt("codProducto"),rs.getString("nombre_producto"),
                        rs.getString("descripcion"),rs.getFloat("precio_producto"),
                        rs.getInt("descuento"),rs.getInt("cod_categoria"),rs.getInt("activo"));

                products.add(p);
            }


            return  products;

        }catch (Exception e){
            System.out.println(e);
            throw  new Error(e);
        }finally{
            System.out.println();
            con.desconectar();
        }
    }

    public void actualizarProducto(int codigo, String nombre, String descripcion, float precio, int descuento, int codCat, int activo){

        Conexion con = new Conexion();

        try{

            Statement st = con.conectar().createStatement();
            st.execute("UPDATE productos SET  nombre_producto = '" + nombre +"', descripcion = '"+ descripcion +"' ,precio_producto = '"+ precio+"', descuento = '"+descuento+"', cod_categoria = '"+codCat+"', activo = '"+activo+"' WHERE codProducto= ' "+ codigo +" ' ");

        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println();
            con.desconectar();
        }

    }
}
