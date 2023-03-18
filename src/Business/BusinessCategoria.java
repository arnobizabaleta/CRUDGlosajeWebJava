package Business;
import BD.Conexion;
import Objects.Categorias;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class BusinessCategoria {

    public void crearCategoria(Categorias c) {

        Conexion con = new Conexion();

        try {

            Statement st = con.conectar().createStatement();
            st.execute("Insert into categorias values('" + c.getCodCategoria() + "','" + c.getNombre_categoria() + "')");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println();
            con.desconectar();
        }
    }

//Eliminar Categoria

    public void eliminarCategoria(int codCategoria) {
        Conexion con = new Conexion();


        try {

            Statement st = con.conectar().createStatement();
            st.execute("DELETE FROM categorias WHERE codCategoria = '" + codCategoria + " ' ");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println();
            con.desconectar();
        }

    }

    //next():Lee la entrada de un dispositivo de entrada hasta que alcanza el espacio de caracteres.
    public Categorias mostrarCategoria(int codCategoria) {
        Conexion con = new Conexion();

        try {
            ResultSet rs;
            Statement st = con.conectar().createStatement();
            rs = st.executeQuery("SELECT * FROM categorias WHERE codCategoria = '" + codCategoria + "' ");

            if (!rs.next()) {
                return null;
            }
            Categorias cr = new Categorias(rs.getInt("codCategoria"), rs.getString("nombre_categoria"));
            return cr;

        } catch (Exception e) {
            System.out.println(e);
            throw new Error(e);
        } finally {
            System.out.println();
            con.desconectar();
        }


    }


    public ArrayList<Categorias> mostrarCategorias() {

        Conexion con = new Conexion();

        try {

            ResultSet rs;

            Statement st = con.conectar().createStatement();
            rs = st.executeQuery("SELECT * FROM Categorias");
            ArrayList<Categorias> categories = new ArrayList<Categorias>();

            while (rs.next()) {
                Categorias c = new Categorias(rs.getInt("codCategoria"), rs.getString("nombre_categoria"));
                categories.add(c);
            }
            return categories;


        } catch (Exception e) {
            System.out.println(e);
            throw new Error(e);
        } finally {
            System.out.println();
            con.desconectar();
        }
    }


        public void actualizarCategoria(int codigo, String nombre){

            Conexion con = new Conexion();

            try{

                Statement st = con.conectar().createStatement();
                st.execute("UPDATE categorias SET  nombre_categoria = '" + nombre +"' WHERE codCategoria = ' "+ codigo +" ' ");
            }catch(Exception e){
                System.out.println(e);
            }finally {
                System.out.println();
                con.desconectar();
            }

        }




}
