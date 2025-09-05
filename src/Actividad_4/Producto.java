package Actividad_4;

public class Producto {
    private String codigo;
    private String nombre;
    private String proveedor;
    private double precio;

    public Producto(String codigo, String proveedor, double precio, String nombre) {
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", precio=" + precio +
                '}';
    }
}
