package util;

import logica.Corredor;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import logica.Carrera;
import util.Util;

public class TokenizarCarrera {

    private String linea; // nt

    public TokenizarCarrera(String linea) { // nt
        this.linea = linea; // nt
    }

    // Devuelvo siempre un objeto del tipo que represente cada fila
    // La clase de este objeto la tengo que tener en el modelo
    public Carrera tokenizar() {

        Carrera c; // variable donde voy a almacenar el objeto que voy a devolver
        // Si el separador del fichero no es una coma, lo cambio aquí
        StringTokenizer tokens = new StringTokenizer(linea, ";");// nt a no ser que el separador del fichero no sea una ,

        // Crear una variable por cada uno de los atributos del objeto del modelo
        String nombre = tokens.nextToken();
        Date fecha = Util.formatearFecharStringADate(tokens.nextToken());
        String lugar = tokens.nextToken();
        int maximo = Integer.parseInt(tokens.nextToken());
        boolean finalizada = Boolean.parseBoolean(tokens.nextToken());

        ArrayList<Corredor> corredores = new ArrayList<>();
        ArrayList<Integer> dorsales = new ArrayList<>();
        
        try {
            while (true) {
                String nombreCorredor = tokens.nextToken();
                String dni = tokens.nextToken();
                Date fechaCorredor = Util.formatearFecharStringADate(tokens.nextToken());
                String dir = tokens.nextToken();
                String telefono = tokens.nextToken();
                Corredor co = new Corredor(nombreCorredor, dni, fechaCorredor,dir,telefono);
                corredores.add(co);
                int dorsal=Integer.parseInt(tokens.nextToken());
                dorsales.add(dorsal); 
                System.out.println("-- La carrera añade al corredor: " + co);
            }
        } catch (Exception e) {
            System.out.println("Ya está leído todo el objeto");
        }

        // Creo el objeto y lo guardo en la variable que voy a devolver
        c = new Carrera(nombre, fecha, lugar, maximo,finalizada,corredores,dorsales);
        System.out.println(c);
        return c; // devuelvo la variable que creo en la línea 19
    }

}
