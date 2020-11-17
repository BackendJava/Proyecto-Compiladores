/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.File;
import java.io.IOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Charly Ponce
 */
public class Principal_1 {

    
    public static void main(String[] args) throws Exception {
        
        // String ruta1 = "C:/Users/Yow/Documents/GitHub/Proyecto-Compiladores/src/principal/Lexer.flex";
        String ruta1 = "C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/Lexer.flex";
        String ruta2 = "C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/LexerCup.flex";
        String ruta3 = "C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/LexerNombre.flex";
        String[] rutaS = {"-parser", "Sintax", "C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/Sintax.cup"};
        generar(ruta1,ruta2,ruta3,rutaS);
    }

    public static void generar(String ruta1, String ruta2,String ruta3, String[] rutaS) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta3);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);

        Path rutaSym = Paths.get("C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/elmer/Desktop/Proyecto-Compiladores/sym.java"),
                Paths.get("C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/sym.java")
        );
        Path rutaSin = Paths.get("C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/elmer/Desktop/Proyecto-Compiladores/Sintax.java"),
                Paths.get("C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/Sintax.java")
        );
    }
}
