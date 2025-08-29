package abstractFactory;

import Interface.*;
import factory.*;
public class EnvioExpress implements MetodoEnvio {

    @Override
    public void EnviarLibro(Libro libro) {
        System.out.println("Se realiza un Envio normal "+"el cual llegara de 4 - 7 dias");
    }
}
