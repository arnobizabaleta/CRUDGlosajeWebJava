package Objects;

public class Usuarios {
    String idUser;
    String nombres_usuario;
    String apellidos_usuario;
    String correo_user;
    String contrasena;
    String tel_user;
    String municipio;
    String comuna_barrio;
    String direccion_exacta;
    int rol;
    int activo;
    String token;

    /*Constructor Clase Usuarios*/
    public Usuarios(String idUser,   String nombres_usuario, String apellidos_usuario,
    String correo_user,     String contrasena,     String tel_user,
    String municipio,     String comuna_barrio,     String direccion_exacta,
    String token
    ){
        this.idUser = idUser;
        this.nombres_usuario = nombres_usuario;
        this.apellidos_usuario = apellidos_usuario;
        this.correo_user = correo_user;
        this.contrasena = contrasena;
        this.tel_user = tel_user;
        this.municipio = municipio;
        this.comuna_barrio = comuna_barrio;
        this.direccion_exacta = direccion_exacta;
        this.token = token;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNombres_usuario() {
        return nombres_usuario;
    }

    public void setNombres_usuario(String nombres_usuario) {
        this.nombres_usuario = nombres_usuario;
    }

    public String getApellidos_usuario() {
        return apellidos_usuario;
    }

    public void setApellidos_usuario(String apellidos_usuario) {
        this.apellidos_usuario = apellidos_usuario;
    }

    public String getCorreo_user() {
        return correo_user;
    }

    public void setCorreo_user(String correo_user) {
        this.correo_user = correo_user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTel_user() {
        return tel_user;
    }

    public void setTel_user(String tel_user) {
        this.tel_user = tel_user;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getComuna_barrio() {
        return comuna_barrio;
    }

    public void setComuna_barrio(String comuna_barrio) {
        this.comuna_barrio = comuna_barrio;
    }

    public String getDireccion_exacta() {
        return direccion_exacta;
    }

    public void setDireccion_exacta(String direccion_exacta) {
        this.direccion_exacta = direccion_exacta;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int isActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
