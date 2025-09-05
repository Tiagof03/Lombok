package Actividad_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("P101", "HP", 1200, "Laptop");
        Producto p2 = new Producto("P102", "Dell", 600.7, "Monitor");
        Producto p3 = new Producto("P103", "Logitech", 120.8, "mouse");

        ProductoRecord r1 =  new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord r2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord r3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        List<ProductoRecord> ListRecord = new ArrayList<>();
        ListRecord.add(r1);
        ListRecord.add(r2);
        ListRecord.add(r3);

        for(ProductoRecord r : ListRecord) {
            System.out.println(r);
        }

    }
}
