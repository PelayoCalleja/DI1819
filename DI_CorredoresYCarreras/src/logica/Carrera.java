/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Date;


public class Carrera {

    private String nombreCarrera;
    private Date fechaCarrera;
    private String lugarCarrera;
    private int maximoCorredores;
    private boolean finalizada;
    private ArrayList<Corredor> listaCorredores;
    private ArrayList<Integer> listaDorsales;
    private int ultimoDorsal;
    
    
    public Carrera() {
        finalizada=false;
        listaCorredores = new ArrayList<>();
        listaDorsales = new ArrayList<>();
        ultimoDorsal=0;
    }

    public Carrera(String nombreCarrera, Date fechaCarrera, String lugarCarrera, int maximoCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugarCarrera = lugarCarrera;
        this.maximoCorredores = maximoCorredores;
        finalizada=false;
        listaCorredores = new ArrayList<>();
        listaDorsales = new ArrayList<>();
        ultimoDorsal=0;
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

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public ArrayList<Integer> getListaDorsales() {
        return listaDorsales;
    }

    public void inscribir(Corredor c){
        listaCorredores.add(c);
        ultimoDorsal++;
        listaDorsales.add(ultimoDorsal);
    }
    
    
    
    
    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", fechaCarrera=" + fechaCarrera + ", lugarCarrera=" + lugarCarrera + ", maximoCorredores=" + maximoCorredores + ", finalizada=" + finalizada + '}';
    }

 
    
}
