package Actividad_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(123, "SKF", 123.12,"Casoleta");
        Producto p2 = new Producto(125, "MOPAR", 434.44,"Bieletas");
        Producto p3 = new Producto(446, "FOX", 600,"Amortiguador");
        ProductoDTO dto1 = new ProductoDTO();
        ProductoDTO dto2 = new ProductoDTO();
        ProductoDTO dto3 = new ProductoDTO();

        dto1.setCodigo(p1.getCodigo());
        dto2.setCodigo(p2.getCodigo());

        dto1.setNombre(p1.getNombre());
        dto2.setNombre(p2.getNombre());

        dto1.setPrecio(p1.getPrecio());
        dto2.setPrecio(p2.getPrecio());

        dto3.setCodigo(233);
        dto3.setNombre("Estereo");
        dto3.setPrecio(322.5);

        List<ProductoDTO> listaDTO = new ArrayList<>();
        listaDTO.add(dto1);
        listaDTO.add(dto2);
        listaDTO.add(dto3);

        for (ProductoDTO dto : listaDTO) {
            System.out.println("Productos: " + dto);
        }
    }
}
