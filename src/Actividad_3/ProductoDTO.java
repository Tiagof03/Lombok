package Actividad_3;

public class ProductoDTO {
    private int codigo;
    private String nombre;
    private double precio;

    public ProductoDTO(double precio, String nombre, int codigo) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public ProductoDTO() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
