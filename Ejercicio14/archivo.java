import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Archivo {
    private final String ruta;

    Archivo(String ruta) {
        this.ruta = ruta;
    }

    boolean existe() {
        return Files.exists(Paths.get(ruta));
    }

    String extension() {
        Path path = Paths.get(ruta);
        String nombreArchivo = (path.getFileName() != null) ? path.getFileName().toString() : ruta;
        int indicePunto = nombreArchivo.lastIndexOf('.');
        return (indicePunto >= 0) ? nombreArchivo.substring(indicePunto) : "";
    }

    boolean esElTipoCorrecto() {
        return extension().equalsIgnoreCase(".sql");
    }

    String leer() {
        try {
            return Files.readString(Paths.get(ruta), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo leer el archivo: " + ruta, e);
        }
    }

    void imprimirInfo() {
        System.out.println("\nINFORMACION DEL ARCHIVO");
        System.out.println("-".repeat(40));
        System.out.println("Ruta: " + ruta);
        System.out.println("Extension: " + extension());
    }
}
