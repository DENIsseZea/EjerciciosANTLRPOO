package Ejercicio13;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

class AnalizadorLexico {
    private ExprLexer lexer;
    private CommonTokenStream tokens;
    private final ErroresLexicos errores = new ErroresLexicos();

    void analizar(String codigo) {
        lexer = new ExprLexer(CharStreams.fromString(codigo));
        lexer.removeErrorListeners();
        lexer.addErrorListener(errores);

        tokens = new CommonTokenStream(lexer);
        tokens.fill();
    }

    void imprimirTokens() {
        System.out.println("\nTOKENS");
        System.out.println("-".repeat(70));
        System.out.printf("%-15s %-15s %-6s %-6s %-8s%n", "LEXEMA", "TOKEN", "TIPO", "LINEA", "COLUMNA");
        System.out.println("-".repeat(70));

        if (tokens == null) {
            return;
        }

        for (Token token : tokens.getTokens()) {
            if (token.getType() == Token.EOF) {
                continue;
            }

            String nombre = lexer.getVocabulary().getSymbolicName(token.getType());
            if (nombre == null || nombre.isEmpty()) {
                nombre = "<INVALID>";
            }

            System.out.printf("%-15s %-15s %-6d %-6d %-8d%n",
                    token.getText(),
                    nombre,
                    token.getType(),
                    token.getLine(),
                    token.getCharPositionInLine());
        }
    }

    void imprimirErrores() {
        System.out.println("\nERRORES LEXICOS");
        System.out.println("-".repeat(40));

        if (errores.lista.isEmpty()) {
            System.out.println("No hay errores lexicos");
        } else {
            for (String[] error : errores.lista) {
                System.out.printf("Linea %s, columna %s: %s%n", error[0], error[1], error[2]);
            }
        }
    }

    private static class ErroresLexicos extends BaseErrorListener {
        private final List<String[]> lista = new ArrayList<>();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line,
                                int charPositionInLine,
                                String msg,
                                RecognitionException e) {
            lista.add(new String[]{String.valueOf(line), String.valueOf(charPositionInLine), msg});
        }
    }
}
