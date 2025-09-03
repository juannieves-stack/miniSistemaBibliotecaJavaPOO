package builder;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter //genera  automaticamente los getters
@Data
@Builder //genera el builder
public class Usuario {
    private String nombre;
    private String email;
    private String direccion;




}

