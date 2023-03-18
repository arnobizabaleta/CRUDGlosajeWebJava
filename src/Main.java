import Business.BusinessCategoria;
import Business.BusinessProductos;
import Business.BusinessUsuarios;
import Business.BussinesRol;
import Objects.Categorias;
import Objects.Productos;
import Objects.Rol;
import Objects.Usuarios;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Categorias c9 = new Categorias(11, "Prueba");
        BusinessCategoria bc = new BusinessCategoria();

        // bc.crearCategoria(c9);

        // bc.mostrarCategoria(11);


        //System.out.println("Codigo Categoria: " + bc.mostrarCategoria(11).getCodCategoria());
        //System.out.println("Nombre Categoria: " + bc.mostrarCategoria(11).getNombre_categoria());

        // bc.eliminarCategoria(9);

        //bc.actualizarCategoria(10,"Prueba02");

/*
        ArrayList<Categorias> categorias = bc.mostrarCategorias();

        for(int i = 0; i < categorias.size(); i++){
            System.out.println("Codigo Categoria: " + categorias.get(i).getCodCategoria());
            System.out.println("Nombre Categoria: " + categorias.get(i).getNombre_categoria());
        }
 */


        BusinessProductos bp = new BusinessProductos();
        // Crear Producto a registrar en la BD
        /*

            Productos p1 = new Productos(6,"Boxer gris","Boxer gris TS",
                6,5,1,1);
            bp.crearProducto(p1);

        */


        /*Metodo Crear prdoucto exitoso */


        //Eliminar Producto

        // bp.eliminarProducto(6);
        /*Metodo Eliminar  prducto exitoso */

        //Mostrar Producto

        /*
        System.out.println("Codigo Producto: " + bp.mostrarProducto(3).getCodProducto());
        System.out.println("Nombre producto: " + bp.mostrarProducto(3).getNombre_producto());
        System.out.println("Descripción producto: " + bp.mostrarProducto(3).getDescripcion());
        System.out.println("Precio: " + bp.mostrarProducto(3).getPrecio_producto());
        System.out.println("Descuento: " + bp.mostrarProducto(3).getDescuento());
        System.out.println("Activo: " + bp.mostrarProducto(3).isActivo());


        */

        /*


        ArrayList<Productos> productos = bp.mostrarProductos();
        System.out.println("Listado de Productos \n");

        for(int i = 0; i < productos.size(); i++){
            System.out.println("Codigo Producto: " + productos.get(i).getCodProducto());
            System.out.println("Nombre Producto: " + productos.get(i).getNombre_producto());
            System.out.println("Descripción: " + productos.get(i).getDescripcion());
            System.out.println("Precio: " + productos.get(i).getPrecio_producto());
            System.out.println("Descuento: " + productos.get(i).getDescuento());
            System.out.println("Activo: " + productos.get(i).isActivo());
            System.out.println("\n");
        }

         */


        // bp.actualizarProducto(2,"Pijama mujer 01","Pijama mujer CK",10,5,2,1);

        BusinessUsuarios bu = new BusinessUsuarios();

        //Crear Usuario
        Usuarios user = new Usuarios("444", "prueba04", "test04", "prueba04@mail.com", "142321", "345331", "MED", "Belen", "Cll 76#56", "AOC573");
        //bu.crearUsuario(user);

        //Mostrar Usuario

        //Usuarios persona = bu.mostrarUsuario("444");

        /*
        System.out.println("INFORMACIÓN DEL USUARIO \n");
        System.out.println("ID: " + persona.getIdUser());
        System.out.println("Nombres: " + persona.getNombres_usuario());
        System.out.println("Apellidos: " + persona.getApellidos_usuario());
        System.out.println("Correo: " + persona.getCorreo_user());
        System.out.println("Telefono: " + persona.getTel_user());
        System.out.println("Municipio: " + persona.getMunicipio());
        System.out.println("Comuna-Barrio:" +persona.getComuna_barrio());
        System.out.println("Dirección Exacta: " + persona.getDireccion_exacta());

            */

//Eliminar Usuario
        //bu.eliminarUsuario("444");

        //bu.actualizarUsuario("444","test004","prueba004","prueba004@mail.com","12332","34321","MED","Comuna 1","Calle 109#45");

        //Mostrar Todos los Usuarios

        /*

        ArrayList<Usuarios> users = new ArrayList<Usuarios>();
        users = bu.mostrarUsuarios();

        for(int i = 0; i < users.size(); i++){
            System.out.println("INFORMACIÓN DEL USUARIO \n");
            System.out.println("ID: " + users.get(i).getIdUser());
            System.out.println("Nombres: " + users.get(i).getNombres_usuario());
            System.out.println("Apellidos: " + users.get(i).getApellidos_usuario());
            System.out.println("Correo: " + users.get(i).getCorreo_user());
            System.out.println("Telefono: " + users.get(i).getTel_user());
            System.out.println("Municipio: " + users.get(i).getMunicipio());
            System.out.println("Comuna-Barrio:" + users.get(i).getComuna_barrio());
            System.out.println("Dirección Exacta: " + users.get(i).getDireccion_exacta());
        }


*/
        BussinesRol br = new BussinesRol();
        Rol r4 = new Rol(4, "rolProof");
       // br.crearRol(r4);


        Rol rolShow = br.mostrarRol(2);
/*
        System.out.println("Información ROL \n");
        System.out.println("IdRol: "+ rolShow.getIdRol());
        System.out.println("Descripción: "+ rolShow.getDescripcion());

*/


        //br.actualizarRol(4, "Rol De prueba04");
        //br.eliminarRol(4);

        //Mostrar todos los roles


        ArrayList<Rol> rols = new ArrayList<Rol>();
        rols = br.mostrarRoles();
         System.out.println("ROLES:: \n");
        for(int i  = 0; i < rols.size();i ++){
            System.out.println("IDRol: "+ rols.get(i).getIdRol());
            System.out.println("Descripción: "+ rols.get(i).getDescripcion());
            System.out.println("\n");
        }

    }

}