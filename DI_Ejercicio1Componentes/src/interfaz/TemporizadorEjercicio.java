/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author Pelayo
 */
public class TemporizadorEjercicio extends JLabel implements Serializable {

    private int segundos;
    private int contador;
    private Timer timer;
    private String textoFinalizar = "Finalizado";
    private Color colorFondo;
    private boolean decimales = false;
    private File imagenFondo;

    private ArrayList<CuentaAtrasFinalizada> listeners = new ArrayList<>();

    public TemporizadorEjercicio() {
    }

    public void addCuentaAtrasFinalizada(CuentaAtrasFinalizada listener) {
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

    public String getTextoFinalizar() {
        return textoFinalizar;
    }

    public void setTextoFinalizar(String textoFinalizar) {
        this.textoFinalizar = textoFinalizar;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public boolean isDecimales() {
        return decimales;
    }

    public void setDecimales(boolean decimales) {
        this.decimales = decimales;
    }

    public File getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(File imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    public void start() {

        contador = segundos;
        setText(Integer.toString(segundos));
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                if (contador >= 0) {
                    setText(Integer.toString(contador--));
                } else {
                    setText(textoFinalizar);
                    cancel();
                    if (listeners != null) {
                        for (CuentaAtrasFinalizada l : listeners) {
                            l.ejecutar(new Date());
                        }
                    }

                    //Todoo: llamar a un codigo
                }
            }
        }, 0, 1000);

    }

    //Método para que se restablezcan las propiedades cada vez que se reinicia el cronómetro
    private void reiniciarPropiedades() {
        if (timer != null) {
            timer.cancel();
        }
        if (getIcon() != null) {
            setIcon(null);
        }
        if (getForeground() != null) {
            setForeground(null);
        }
    }
}
