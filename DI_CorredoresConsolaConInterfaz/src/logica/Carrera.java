/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pelayo
 */
public class Carrera {

    private String nombreCarrera;
    private Date fechaCarrera;
    private String lugarCarrera;
    private int maximoCorredores;

    public Carrera() {
    }

    public Carrera(String nombreCarrera, Date fechaCarrera, String lugarCarrera, int maximoCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugarCarrera = lugarCarrera;
        this.maximoCorredores = maximoCorredores;

    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugarCarrera() {
        return lugarCarrera;
    }

    public void setLugarCarrera(String lugarCarrera) {
        this.lugarCarrera = lugarCarrera;
    }

    public int getMaximoCorredores() {
        return maximoCorredores;
    }

    public void setMaximoCorredores(int maximoCorredores) {
        this.maximoCorredores = maximoCorredores;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", fechaCarrera=" + fechaCarrera + ", lugarCarrera=" + lugarCarrera + ", maximoCorredores=" + maximoCorredores + '}';
    }

    
}
