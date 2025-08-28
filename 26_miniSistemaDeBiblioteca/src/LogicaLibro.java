public class LogicaLibro {
    public static Libro crearLibro(String tipo){
        try{
            switch (tipo.toLowerCase()){
                case "digital": return new LibroDigital();
                case "fisico": return new LibroFisico();
                default: throw new IllegalArgumentException("Tipo Desconocido");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("\nEl tipo de libro : '"+tipo+ "' no existe es un :"+e.getMessage()+"\n");
            return null;

        }
    }
}
