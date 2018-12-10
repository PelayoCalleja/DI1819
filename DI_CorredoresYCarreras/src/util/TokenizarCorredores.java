package util;

import logica.Corredor;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import util.Util;


public class TokenizarCorredores {

    private String linea; 

    public TokenizarCorredores(String linea) { 
        this.linea = linea; 
    }

   public Corredor tokenizar() {

        Corredor c; 
        StringTokenizer tokens = new StringTokenizer(linea, ";");

        String nombre = tokens.nextToken();
        String dni = tokens.nextToken();
        Date fecha = Util.formatearFecharStringADate(tokens.nextToken());
        String dir = tokens.nextToken();
        String telefono = tokens.nextToken();
        
        try {
            while (true) {
                String texto = tokens.nextToken();
                
            }
        } catch (Exception e) {
            System.out.println("Ya está leído todo el objeto");
        }

        
        c = new Corredor(nombre, dni, fecha,dir,telefono);
        System.out.println(c);
        return c; 
    }

}
