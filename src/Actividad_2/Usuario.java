package Actividad_2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Usuario {
    private String nombre;
    private int id;
    private String email;

}
