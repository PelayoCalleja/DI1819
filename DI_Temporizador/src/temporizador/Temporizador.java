/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author Pelayo
 */
public class Temporizador extends JLabel implements Serializable {

    private int segundos;
    private int contador;

    private ArrayList<CuentaAtrasFinalizada> listeners=new ArrayList<>();

    public Temporizador() {
    }

    public void addCuentaAtrasFinalizada(CuentaAtrasFinalizada listener){
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
                    setText("Finalizado");
                    cancel();
                    if(listeners!=null){
                        for(CuentaAtrasFinalizada l : listeners)
                        l.ejecutar(new Date());
                    }
                    
                    //Todoo: llamar a un codigo
                }
            }
        }, 0, 1000);

    }

}
