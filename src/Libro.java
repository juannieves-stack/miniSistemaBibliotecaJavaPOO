import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int idLibro; 
    private String nombre
    private String autor;
    private String genero;
    private int anioPublicacion;
}