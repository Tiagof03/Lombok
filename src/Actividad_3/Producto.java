package Actividad_3;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private String autor;

    public Producto(int codigo, String autor, double precio, String nombre) {
        this.codigo = codigo;
        this.autor = autor;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", autor='" + autor + '\'' +
                '}';
    }
}
