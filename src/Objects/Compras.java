package Objects;

public class Compras {
    int cod_compra;
    String id_transaccion;
    String fecha;
    String status;
    String email;
    String id_cliente;
    String id_titular;
    float total;

    public Compras( int cod_compra, String id_transaccion, String fecha,
    String status,  String email, String id_cliente, String id_titular,  float total){
        this.cod_compra = cod_compra;
        this.id_transaccion = id_transaccion;
        this.fecha = fecha;
        this.status = status;
        this.email = email;
        this.id_cliente = id_cliente;
        this.id_titular = id_titular;
        this.total = total;
    }

    public int getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(int cod_compra) {
        this.cod_compra = cod_compra;
    }

    public String getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(String id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId_titular() {
        return id_titular;
    }

    public void setId_titular(String id_titular) {
        this.id_titular = id_titular;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }


}
