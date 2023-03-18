package Objects;

public class Categorias {
    int codCategoria;
    String nombre_categoria;

    public Categorias(int codCategoria,   String nombre_categoria){
        this.codCategoria = codCategoria;
        this.nombre_categoria = nombre_categoria;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
}
