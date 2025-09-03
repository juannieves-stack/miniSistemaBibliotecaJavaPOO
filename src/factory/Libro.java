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

    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }
}