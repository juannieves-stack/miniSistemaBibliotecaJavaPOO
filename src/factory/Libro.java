package factory;
import Interface.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Libro implements LibroUso {
    private int idLibro; 
    private String nombre;
    private String autor;
    private String genero;
    private int anioPublicacion;
}