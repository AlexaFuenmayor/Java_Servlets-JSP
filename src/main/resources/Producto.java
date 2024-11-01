package logica;

public class Producto {

    private String nombreProducto;
    private String description;
    private Integer precio;
    private String categoria;

    public Producto() {
    }

    public Producto(String nombreProducto, String description, Integer precio, String categoria) {
        this.nombreProducto = nombreProducto;
        this.description = description;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

