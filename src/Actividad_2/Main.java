package Actividad_2;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = Usuario.builder()
                .nombre("Tiago")
                .id(1)
                .email("tiago@gmail.com")
                .build();
        System.out.println(u1.toString());

        Usuario u2 = Usuario.builder()
                .nombre("sergio")
                .id(2)
                .email("sergio@gmail.com")
                .build();
        System.out.println(u2.toString());
        Usuario u3 = Usuario.builder()
                .nombre("matias")
                .id(3)
                .email("matias@gmail.com")
                .build();
        System.out.println(u3.toString());
    }
}
