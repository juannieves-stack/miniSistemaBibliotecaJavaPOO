import factory.*;
import singleton.*;
public class Main {
    public static void main(String[] args) {
    Libro lib3 = LogicaLibro.crearLibro("Digital");
    Libro lib4 = LogicaLibro.crearLibro("Fisico");
    Libro lib5 = LogicaLibro.crearLibro("li");
    Libro lib1 = new LibroDigital();
    Libro lib2 = new LibroDigital();
    DataBase data1 =DataBase.INSTANCE;
    data1.agregarLibro(lib1);
    data1.agregarLibro(lib2);
    data1.agregarLibro(lib4);
    data1.agregarLibro(lib5);
    data1.agregarLibro(lib3);


    data1.getLibros();

    lib1.infoLibro();
    lib2.infoLibro();
    lib3.infoLibro();
    lib4.infoLibro();

    }

}