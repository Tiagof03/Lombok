package Actividad_2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder

public class Usuario {
    private String nombre;
    private int id;
    private String email;

}
