import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Usuario {
    private String nombre;
    private String email;
    private String direccion;

    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.email = builder.email;
        this.direccion = builder.direccion;
    }
    public static class Builder{
        private String nombre;
        private String email;
        private String direccion;

    }
}

