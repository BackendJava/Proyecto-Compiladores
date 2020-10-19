/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.File;

/**
 *
 * @author Charly Ponce
 */
public class Principal_1 {

    public static void main(String[] args) {

        // String ruta = "C:/Users/Yow/Desktop/ProyectoCompiladores/src/principal/Lexer.flex";
        String ruta = "C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/Lexer.flex";

        generarLexer(ruta);
    }

    public static void generarLexer(String ruta) {
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
