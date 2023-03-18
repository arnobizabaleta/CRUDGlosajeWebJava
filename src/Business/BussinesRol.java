package Business;
import BD.Conexion;
import Objects.Rol;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class BussinesRol {

    public void crearRol(Rol c) {

        Conexion con = new Conexion();

        try {

            Statement st = con.conectar().createStatement();
            st.execute("Insert into roles values('" + c.getIdRol() + "','" + c.getDescripcion() + "')");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println();
            con.desconectar();
        }
    }

//Eliminar Rol

    public void eliminarRol(int codRol) {
        Conexion con = new Conexion();


        try {

            Statement st = con.conectar().createStatement();
            st.execute("DELETE FROM roles WHERE idRol = '" + codRol + " ' ");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println();
            con.desconectar();
        }

    }

    //next():Lee la entrada de un dispositivo de entrada hasta que alcanza el espacio de caracteres.
    public Rol mostrarRol(int codRol) {
        Conexion con = new Conexion();

        try {
            ResultSet rs;
            Statement st = con.conectar().createStatement();
            rs = st.executeQuery("SELECT * FROM roles WHERE idRol = '" + codRol + "' ");

            if (!rs.next()) {
                return null;
            }
            Rol cr = new Rol(rs.getInt("idRol"), rs.getString("descripcion"));
            return cr;

        } catch (Exception e) {
            System.out.println(e);
            throw new Error(e);
        } finally {
            System.out.println();
            con.desconectar();
        }


    }


    public ArrayList<Rol> mostrarRoles() {

        Conexion con = new Conexion();

        try {

            ResultSet rs;

            Statement st = con.conectar().createStatement();
            rs = st.executeQuery("SELECT * FROM roles");
            ArrayList<Rol> categories = new ArrayList<Rol>();

            while (rs.next()) {
                Rol c = new Rol(rs.getInt("idRol"), rs.getString("descripcion"));
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


    public void actualizarRol(int codigo, String descripcion){

        Conexion con = new Conexion();

        try{

            Statement st = con.conectar().createStatement();
            st.execute("UPDATE roles SET  descripcion = '" + descripcion +"' WHERE idRol = ' "+ codigo +" ' ");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println();
            con.desconectar();
        }

    }




}
