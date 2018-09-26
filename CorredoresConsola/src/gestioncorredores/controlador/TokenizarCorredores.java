package gestioncorredores.controlador;

import gestioncorredores.modelo.Corredor;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class TokenizarCorredores {

    private String linea; // nt

    public TokenizarCorredores(String linea) { // nt
        this.linea = linea; // nt
    }

    // Devuelvo siempre un objeto del tipo que represente cada fila
    // La clase de este objeto la tengo que tener en el modelo
    public Corredor tokenizar() {

        Corredor c; // variable donde voy a almacenar el objeto que voy a devolver
        // Si el separador del fichero no es una coma, lo cambio aquí
        StringTokenizer tokens = new StringTokenizer(linea, ";");// nt a no ser que el separador del fichero no sea una ,

        // Crear una variable por cada uno de los atributos del objeto del modelo
        String nombre = tokens.nextToken();
        String dni = tokens.nextToken();
        String fecha = tokens.nextToken();
        String dir = tokens.nextToken();
        String telefono = tokens.nextToken();
        
        try {
            while (true) {
                String texto = tokens.nextToken();
                
            }
        } catch (Exception e) {
            System.out.println("Ya está leído todo el objeto");
        }

        
        // Creo el objeto y lo guardo en la variable que voy a devolver
        c = new Corredor(nombre, dni, fecha,dir,telefono);
        
        return c; // devuelvo la variable que creo en la línea 19
    }

}
