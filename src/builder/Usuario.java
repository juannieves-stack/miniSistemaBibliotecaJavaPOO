package builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private String nombre;
    private String email;
    private String direccion;

}

