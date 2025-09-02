package abstractFactory;

import Interface.*;
import factory.*;

public class EnvioNormal implements MetodoEnvio{

    @Override
    public void EnviarLibro(Libro libro) {
        System.out.println("Se realiza un Envio normal, estimado dentro de  1 - 2 dias");
    }
}
