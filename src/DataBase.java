import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static DataBase instancia;
    private List<Libro> libros;

    public DataBase() {
        libros = new ArrayList<>();
    }

    public static  synchronized DataBase getInstancia(){
        if(instancia == null){
            instancia = new DataBase();
        }
        return instancia;
    }
    public void agregarlibro(Libro libro){
        if(libro!=null){
            libros.add(libro);
        }
    }
//Devolvemos recorriendo el array cada posicion de c/libro
    public List<Libro> getLibros() {
        //Eliminamos si ingresaron basura
        libros.removeIf(lib -> lib == null);
        System.out.println("+++++++++++++++++++++++");
        for (Libro lib: libros){
            System.out.println(lib);
        }
        return libros;
    }
}
