/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente2;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import javax.swing.JLabel;


public class Temporizador2 extends JLabel implements Serializable{
    
    private List<EspiaInterface> listenersEspia;
    private List<String> palabrasEspiadas;
    private String ficheroLog;
    private File fileLog;

  
     public void addCuentaAtrasFinalizadaListener(EspiaInterface listener) {
        this.listenersEspia.add(listener);
    }
    
    public List<EspiaInterface> getListenersEspia() {
        return listenersEspia;
    }

    public void setListenersEspia(List<EspiaInterface> listenersEspia) {
        this.listenersEspia = listenersEspia;
    }

    public List<String> getPalabrasEspiadas() {
        return palabrasEspiadas;
    }

    public void setPalabrasEspiadas(List<String> palabrasEspiadas) {
        this.palabrasEspiadas = palabrasEspiadas;
    }

    public String getFicheroLog() {
        return ficheroLog;
    }

    public void setFicheroLog(String ficheroLog) {
        this.ficheroLog = ficheroLog;
    }

    public File getFileLog() {
        return fileLog;
    }

    public void setFileLog(File fileLog) {
        this.fileLog = fileLog;
    }

    
    
}
