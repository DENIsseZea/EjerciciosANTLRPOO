package Ejercicio13;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Main app = new Main();
        app.ejecutar();
    }
}

class Main {
    private final AnalizadorLexico analizador;

    Main() {
        this.analizador = new AnalizadorLexico();
    }

    void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe la ruta del archivo: ");
        String ruta = scanner.nextLine();

        Archivo archivo = new Archivo(ruta);

        if (!archivo.existe()) {
            System.out.println("El archivo no existe");
            scanner.close();
            return;
        }

        if (!archivo.esElTipoCorrecto()) {
            System.out.println("El archivo debe ser .sql");
            scanner.close();
            return;
        }

        String codigo = archivo.leer();
        archivo.imprimirInfo();

        System.out.println("\nCODIGO ORIGINAL");
        System.out.println("-".repeat(40));
        System.out.println(codigo);

        analizador.analizar(codigo);
        analizador.imprimirTokens();
        analizador.imprimirErrores();

        scanner.close();
    }
}
