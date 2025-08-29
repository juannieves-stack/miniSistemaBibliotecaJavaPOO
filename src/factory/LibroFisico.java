package factory;

import lombok.Builder;

@Builder

public class LibroFisico extends Libro {
    public LibroFisico() {
        System.out.println("Libro Fisico creado... ");
    }

    @Override
    public void infoLibro() {
            System.out.println("Hola soy un libro fisico");
    }
}
