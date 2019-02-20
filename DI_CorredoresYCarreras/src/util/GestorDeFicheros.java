package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import util.TokenizarCorredores;
import logica.Corredor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.TokenizarCorredores;

/**
 *
 * @author Pelayo
 */
public class GestorDeFicheros {

    public GestorDeFicheros() {

    }

    public void leer() {

        BufferedReader br = null; 
        String linea; 
        FileReader fr = null; 

        TokenizarCorredores objToken;

        try {

           
            File nomFile = new File("Corredores.csv");

            fr = new FileReader(nomFile); 
            br = new BufferedReader(fr); 

            linea = br.readLine(); 

            while ((linea = br.readLine()) != null) {
                objToken = new TokenizarCorredores(linea); 
                Corredor corredor = objToken.tokenizar(); 
                System.out.println("Corredor" + corredor.toString());
            } 

        } catch (FileNotFoundException ex) {
            System.out.println("No encuentro ese fichero");
        } catch (IOException ex) {
            System.out.println("IOException");
        } finally {
            try {
                fr.close();
                br.close();
                System.out.println("Cerrando fichero");
            } catch (IOException ex) {
                System.out.println("Problemas al cerrar el fichero");
            }
        }
    }

    public ArrayList<Corredor> cargarEnModelo() {
        
        ArrayList<Corredor> lista = new ArrayList<>();

        BufferedReader br = null; 
        String linea; 
        FileReader fr = null;  

        TokenizarCorredores objToken;

        try {


            File nomFile = new File("Corredores.csv");

            fr = new FileReader(nomFile); 
            br = new BufferedReader(fr); 

  
            
            while ((linea = br.readLine()) != null) { 
              
                objToken = new TokenizarCorredores(linea);  
                Corredor corredor = objToken.tokenizar(); 
                lista.add(corredor); 
           
            } 
            return lista;
        } catch (FileNotFoundException ex) {
            System.out.println("No encuentro ese fichero");
        } catch (IOException ex) {
            System.out.println("IOException");
        } finally {
            try {
                fr.close();
                br.close();
                System.out.println("Cerrando fichero");
            } catch (IOException ex) {
                System.out.println("Problemas al cerrar el fichero");
            }
        }
        return null;
    }

    public void escribirObjetosFichero(ArrayList<Object> objetos) {
        String nombreFichero = "salida.dat";

        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {

            fout = new FileOutputStream(nombreFichero);
            for (Object ob : objetos) {
                oos = new ObjectOutputStream(fout);
                oos.writeObject(ob);
            }

            System.out.println("Done");

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public void guardar(ArrayList<Corredor> objects, String nombreFichero) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(nombreFichero));
            for (Corredor o : objects) {
                bw.write(o.serializar() );
            }
            System.out.println("Se ha guardado correctamente");
        } catch (IOException ex) {
            Logger.getLogger(GestorDeFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(GestorDeFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
