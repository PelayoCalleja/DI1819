/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class Cronometro extends JLabel implements Serializable {

    private Timer timer;
    private int horas, minutos, segundos;
    private int dorsal;
    private boolean registro, finalizar;
    private String tiempo, tiempoCorredor = "";
    private List<Integer> listadorsales;
    private CronometroListener cronometroListener;

    public Cronometro() {
        setFont(new Font("Helveltica", 1, 48));
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {   

                if (cronometroListener != null) {
                    cronometroListener.resgistrarTiempo();
                }
            }
        });
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public CronometroListener getCronometroListener() {
        return cronometroListener;
    }

    public void setCronometroListener(CronometroListener cronometroListener) {
        this.cronometroListener = cronometroListener;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }

    public List<Integer> getListadorsales() {
        return listadorsales;
    }

    public void setListadorsales(List<Integer> listadorsales) {
        this.listadorsales = listadorsales;
    }
    
    public String getTiempo() {
        return tiempo;
    }

    public void start() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ++segundos;
                if (segundos == 60) {
                    segundos = 0;
                    ++minutos;
                }
                if (minutos == 60) {
                    minutos = 0;
                    ++horas;
                }
                tiempo = (horas <= 9 ? "0" : "") + horas + ":" + (minutos <= 9 ? "0" : "") + minutos
                        + ":" + (segundos <= 9 ? "0" : "") + segundos;
                setText(tiempo);
            }

        }, 0, 1000);

    }

}
