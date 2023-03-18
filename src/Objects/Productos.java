package Objects;

public class Productos {
    int codProducto;
    String nombre_producto;
    String descripcion;
    float precio_producto;
    int descuento;
    int cod_categoria;
    int activo;

/*Constructor Productos*/
    public Productos(int codProducto, String nombre_producto, String descripcion,
    float precio_producto,     int descuento,     int cod_categoria,     int activo){
        this.codProducto = codProducto;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.precio_producto = precio_producto;
        this.descuento = descuento;
        this.cod_categoria = cod_categoria;
        this.activo = activo;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public int isActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
}
