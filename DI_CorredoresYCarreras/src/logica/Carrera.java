/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Date;
import util.Util;

public class Carrera {

    private String nombreCarrera;
    private Date fechaCarrera;
    private String lugarCarrera;
    private int maximoCorredores;
    private boolean finalizada;
    private ArrayList<Corredor> listaCorredores;
    private ArrayList<Integer> listaDorsales;
    private ArrayList<String> listaFinalizados;
    private int ultimoDorsal;

    public Carrera() {
        finalizada = false;
        listaCorredores = new ArrayList<>();
        listaDorsales = new ArrayList<>();
        listaFinalizados = new ArrayList<>();
        ultimoDorsal = 0;
    }

    public Carrera(String nombreCarrera, Date fechaCarrera, String lugarCarrera, int maximoCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugarCarrera = lugarCarrera;
        this.maximoCorredores = maximoCorredores;
        finalizada = false;
        listaCorredores = new ArrayList<>();
        listaDorsales = new ArrayList<>();
        listaFinalizados = new ArrayList<>();
        ultimoDorsal = 0;
    }

    public Carrera(String nombreCarrera, Date fechaCarrera, String lugarCarrera, int maximoCorredores, boolean finalizada, ArrayList<Corredor> corredores,
            ArrayList<Integer> dorsales) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugarCarrera = lugarCarrera;
        this.maximoCorredores = maximoCorredores;
        this.finalizada = finalizada;
        listaCorredores = corredores;
        listaDorsales = dorsales;
        listaFinalizados = new ArrayList<>();
        if(finalizada) {
            for(int i=0; i<listaCorredores.size(); i++){
                listaFinalizados.add("0");
            }
        } else {
            for(int i=0; i<listaCorredores.size(); i++){
                listaFinalizados.add("-1");
            }
        }
        ultimoDorsal = dorsales.size();
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
        boolean f = true;
        for(String d: listaFinalizados) {
            if(d.equals("-1")) {
                f = false;
            }
        }
        finalizada = f;
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

    public void inscribir(Corredor c) {
        listaCorredores.add(c);
        ultimoDorsal++;
        listaDorsales.add(ultimoDorsal);
        listaFinalizados.add("-1");
    }
    
    public ArrayList<Corredor> getNoFinalizados(){
        System.out.println("Get no finalizados...");
        ArrayList<Corredor> noFinalizaron = new ArrayList<>();
        for(int i = 0;i < listaCorredores.size();i++){  
             if(listaFinalizados.get(i).equals("-1")) {
                 Corredor c = listaCorredores.get(i);
                 noFinalizaron.add(c);
            }
        }
        return noFinalizaron;
    }
    
    public void finalizarCarrera(Corredor c, String tiempo) {
        for(int i = 0;i<listaCorredores.size();i++) {
            Corredor cl = listaCorredores.get(i);
            if(cl.equals(c)) {
                listaFinalizados.set(i, tiempo);
            }
        }
        System.out.println(c + " ha finalizado");
    }
    

    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", fechaCarrera=" + fechaCarrera + ", lugarCarrera=" + lugarCarrera + ", maximoCorredores=" + maximoCorredores + ", finalizada=" + finalizada + '}';
    }

    public String serializar() {
        String cadena = "";
        cadena += nombreCarrera + ";";
        cadena += Util.formatearFechaDateAString(fechaCarrera) + ";";
        cadena += lugarCarrera + ";";
        cadena += maximoCorredores + ";";
        cadena += finalizada + ";";
        for (int i = 0; i < listaCorredores.size(); i++) {
            Corredor c = listaCorredores.get(i);
            int d = listaDorsales.get(i);
            cadena += c.serializarParaCarrera();
            cadena += d + ";";
        }
        cadena += "\n";
        return cadena;
    }
    
     public String serializarCarreraFinalizada() {
         // Nombre de la carrera
         // Fecha
         // dorsal/tiempo/nombre_coredor
        String cadena = "";
        cadena += nombreCarrera + "\n";
        cadena += Util.formatearFechaDateAString(fechaCarrera) + "\n";
        
        for (int i = 0; i < listaCorredores.size(); i++) {
            Corredor c = listaCorredores.get(i);
            cadena += listaDorsales.get(i) + "/";
            cadena += listaFinalizados.get(i) + "/";
            cadena += c.getNombre();
            cadena += "\n";
        }
        cadena += "\n";
        return cadena;
    }

}
