/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import alertas.AlertSucess;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author RojeruSan
 */
public class Funciones {

    private JFileChooser accion = null;
    private File archivo = null;
    private Principal principal;
    public static String ruta = "";
    public String path = "";
    
    public void LeerFichero(Principal principal) {
        this.principal = principal;

        accion = new JFileChooser();
        accion.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        accion.setFileFilter(filtroImagen);
        accion.setDialogTitle("Abrir archivo");
        if (accion.showOpenDialog(principal) == JFileChooser.APPROVE_OPTION) {
            archivo = accion.getSelectedFile();
            path = archivo.getAbsolutePath();
            principal.lblNombre.setText(archivo.getName());
            ruta = accion.getSelectedFile().toString();
            try {
                /*Si existe el fichero*/
                if (archivo.exists()) {
                    /*Abre un flujo de lectura a el fichero*/
                    BufferedReader leeArchivo = new BufferedReader(new FileReader(archivo));
                    String Slinea, datos = "";
                    /*Lee el fichero linea a linea hasta llegar a la ultima*/
                    while ((Slinea = leeArchivo.readLine()) != null) {
                        /*Imprime la linea leida*/
                        datos = datos + Slinea + "\n";
                    }
                    principal.txtArea2.setText(datos);
                    principal.txtArea2.setEditable(true);
                    principal.txtArea2.requestFocus();
                    /*Cierra el flujo*/
                    leeArchivo.close();
                    this.principal.abrioArchivo = true;
                    this.principal.creoNuevo = false;
                } else {
                    System.out.println("Fichero No Existe");
                }
            } catch (Exception ex) {
                /*Captura un posible error y le imprime en pantalla*/
                System.out.println(ex.getMessage());
            }
        }
    }

    public void CrearFicheroNuevo(Principal principal, String SCadena, String nombre) {
        this.principal = principal;

        accion = new JFileChooser();
        accion.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        accion.setFileFilter(filtroImagen);
        accion.setDialogTitle("Guardar archivo " + nombre);
        accion.setSelectedFile(new File(nombre));
        if (accion.showSaveDialog(principal) == JFileChooser.APPROVE_OPTION) {
            ruta = accion.getSelectedFile().toString();
            archivo = new File(ruta);
            principal.lblNombre.setText(archivo.getName());
            try {
                //Si Existe el fichero lo borra
                if (archivo.exists()) {
                    archivo.delete();
                }
                BufferedWriter wr = new BufferedWriter(new FileWriter(archivo));
                FileWriter escribirArchivo = new FileWriter(archivo, true);
                BufferedWriter buffer = new BufferedWriter(escribirArchivo);
                buffer.write(SCadena);
                buffer.newLine();
                buffer.close();
                wr.close();
                escribirArchivo.close();

                this.principal.abrioArchivo = true;
                this.principal.creoNuevo = false;
            } catch (Exception ex) {
            }
        }
    }

    public void GuardarFichero(String SCadena, String nombre) {

        System.out.println(ruta);
        archivo = new File(ruta);
        try {
            //Si Existe el fichero lo borra
            if (archivo.exists()) {
                archivo.delete();
            }
            BufferedWriter wr = new BufferedWriter(new FileWriter(archivo));
            FileWriter escribirArchivo = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            buffer.write(SCadena);
            buffer.newLine();
            buffer.close();
            wr.close();
            escribirArchivo.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla 
            System.out.println(ex.getMessage());
        }
    }

    public void BorrarFichero(Principal principal) {
        this.principal = principal;
        archivo = new File(ruta);
        try {
            /*Si existe el fichero*/
            if (archivo.exists()) {
                /*Borra el fichero*/
                archivo.delete();
                alertas.AlertSucess a = new AlertSucess(this.principal, true);
                a.lblMensaje1.setText("Archivo eliminado.");
                a.lblMensaje2.setText("");
                a.setVisible(true);
            }
        } catch (Exception ex) {
            /*Captura un posible error y le imprime en pantalla*/
            System.out.println(ex.getMessage());
        }
    }
    
    
    
        public static ArrayList<Nodo> getTabla(String txt) {
        ArrayList<Nodo> tabla = new ArrayList<>();
        String[] lista = txt.split("\n");
        String[] aux;
        for (int x = 0;x < lista.length; x++) {
            if (lista[x].equals("Simbolo no definido")) {
                //tabla.clear();
                //tabla.add(new Nodo("Simbolo no indefinido",""));
                //return tabla;
            }
            aux = lista[x].split("~");
            if (tabla.size() > 0) {
                int pos = -1;
                for (int y = 0; y < tabla.size(); y++) {
                    if (tabla.get(y).getToken().equals(aux[0])) {
                        pos = y;
                    }
                }
                if (pos >= 0) {
                    String lexema = tabla.get(pos).getLexema();
                    tabla.get(pos).setLexema(lexema + ", " + aux[1]);
                } else {
                    tabla.add(new Nodo(aux[0], aux[1]));
                }
            } else {
                tabla.add(new Nodo(aux[0], aux[1]));
            }
        }
        return tabla;
    }

}
