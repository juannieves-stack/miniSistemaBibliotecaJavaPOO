package Prototype;

import builder.Usuario;
import factory.Libro;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Builder
@Data
public class Prestamo implements Cloneable{
    private Libro libro;
    private Usuario usuario;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;

    @Override
    public Prestamo clone(){
        try{
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "++++++++++++++++++++++++\nPrestamo{" +
                "libro=" + libro.getNombre()+
                ", usuario=" + usuario.getNombre() +
                ", FechaInicio=" + this.FechaInicio +
                ", FechaFin=" + this.FechaFin +
                '}';
    }
}