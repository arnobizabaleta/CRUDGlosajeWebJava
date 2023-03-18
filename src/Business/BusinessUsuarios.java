package Business;
import BD.Conexion;
import Objects.Usuarios;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class BusinessUsuarios {

    public void crearUsuario(Usuarios u){

        Conexion con = new Conexion();

        try{
            Statement st = con.conectar().createStatement();
            st.execute("INSERT INTO usuarios(idUser ,nombres_usuario,apellidos_usuario,correo_user,contrasena,tel_user,municipio, comuna_barrio, direccion_exacta,token) VALUES('"+u.getIdUser()+"','"+u.getNombres_usuario()+"','"+u.getApellidos_usuario()+"','"+u.getCorreo_user()+"','"+u.getContrasena()+"','"+u.getTel_user()+"','"+u.getMunicipio()+"','"+u.getComuna_barrio()+"','"+u.getDireccion_exacta()+"','"+u.getToken()+"')" );



        }catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println();
            con.desconectar();
        }
    }


    public void eliminarUsuario(String ID){

        Conexion con = new Conexion();

        try{
            Statement st = con.conectar().createStatement();
            st.execute("DELETE FROM Usuarios WHERE idUser = '"+ ID +"' ");

        }catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println();
            con.desconectar();
        }
    }


    public Usuarios mostrarUsuario(String ID){

        Conexion con = new Conexion();

        try{
            ResultSet rs;
            Statement st = con.conectar().createStatement();
            rs =  st.executeQuery("SELECT * FROM Usuarios WHERE idUser = " + ID);

            if(!rs.next()){ return null;}

            Usuarios p = new Usuarios(rs.getString("idUser"),rs.getString("nombres_usuario"),
                    rs.getString("apellidos_usuario"),rs.getString("correo_user"),
                    rs.getString("contrasena"),rs.getString("tel_user"),rs.getString("municipio"),
                    rs.getString("comuna_barrio"),rs.getString("direccion_exacta"),rs.getString("token"));

            return  p;

        }catch (Exception e){
            System.out.println(e);
            throw  new Error(e);
        }finally{
            System.out.println();
            con.desconectar();
        }
    }

    public ArrayList<Usuarios> mostrarUsuarios(){

        Conexion con = new Conexion();

        try{
            ResultSet rs;
            Statement st = con.conectar().createStatement();
            rs =  st.executeQuery("SELECT * FROM Usuarios");

            ArrayList<Usuarios> products = new ArrayList<Usuarios>();

            while(rs.next()){

                Usuarios p = new Usuarios(rs.getString("idUser"),rs.getString("nombres_usuario"),
                        rs.getString("apellidos_usuario"),rs.getString("correo_user"),
                        rs.getString("contrasena"),rs.getString("tel_user"),rs.getString("municipio"),
                        rs.getString("comuna_barrio"),rs.getString("direccion_exacta"),rs.getString("token"));

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

    public void actualizarUsuario(String ID, String nombre, String apellidos, String correo, String contrasena,String tel, String municipio, String barrio, String direccion){

        Conexion con = new Conexion();

        try{

            Statement st = con.conectar().createStatement();
            st.execute("UPDATE usuarios SET  nombres_usuario = '" + nombre +"', apellidos_usuario = '"+ apellidos +"' ,correo_user = '"+ correo +"',contrasena = '"+contrasena+"', tel_user = '"+tel+"', municipio = '"+municipio+"', comuna_barrio = '"+barrio+"', direccion_exacta = '"+direccion+"' WHERE idUser=" + ID );


        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println();
            con.desconectar();
        }

    }
}
