/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.awt.Color;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Pelayo
 */
public class Temporizador extends JLabel implements Serializable{

    private int segundos;
    private int contador;
    private String textoFinal = "Finalizado";
    private Color color;
    private boolean decimales;
    private File rutaImagen;
    private ArrayList<CuentaAtrasFinalizada> listeners = new ArrayList<>();

    
    /**
     * 
     * @param listener 
     */
    public void addCuentaAtrasFinalizadaListener(CuentaAtrasFinalizada listener) {
        this.listeners.add(listener);
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getTextoFinal() {
        return textoFinal;
    }

    public void setTextoFinal(String textoFinal) {
        this.textoFinal = textoFinal;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isDecimales() {
        return decimales;
    }

    public void setDecimales(boolean decimales) {
        this.decimales = decimales;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public ArrayList<CuentaAtrasFinalizada> getListeners() {
        return listeners;
    }

    public void setListeners(ArrayList<CuentaAtrasFinalizada> listeners) {
        this.listeners = listeners;
    }

    public void start(){
        
    }
    
}
