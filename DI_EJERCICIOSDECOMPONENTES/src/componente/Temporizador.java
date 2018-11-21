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
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Pelayo
 */
public class Temporizador extends JLabel implements Serializable {

    private double segundos;
    private double contador;
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

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    public double getContador() {
        return contador;
    }

    public void setContador(double contador) {
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

    public void start() {
        contador = segundos;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(segundos>0){
                      if (decimales == true) {
                        setText(String.valueOf((segundos -= 0.1) / 10.0f));
                    } else {
                        setText(Double.toString( segundos--)); //restar de 1 en 1
                    }
                }else{
                    setText(textoFinal);
                    setForeground(color);
                    ImageIcon imageIcon = new ImageIcon(rutaImagen.getAbsolutePath());//ruta de la imagen
                    setIcon(imageIcon);//añadir imagen
                    cancel();

                    if (listeners != null) {
                        for (CuentaAtrasFinalizada l : listeners) {
                            l.ejecutar();
                        }
                    }
                    
                }
            }
        }, 0, 1000);

    }

}
