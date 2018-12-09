/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.GestorDeFicheros;
import util.GestorDeFicherosCarreras;

/**
 * 
 * @author Pelayo
 */
public class LogicaNegocio {

    private static LogicaNegocio logica;
    private List<Corredor> listaCorredores;
    private GestorDeFicheros gf;
    private Corredor corredorSelecionado;
    private List<Carrera> listaCarreras;
    private Carrera carreraSelecionada;
    private GestorDeFicherosCarreras gfc;

    private LogicaNegocio() {
        listaCorredores = new ArrayList<Corredor>();
        listaCarreras = new ArrayList<Carrera>();
        gf = new GestorDeFicheros();
        gfc = new GestorDeFicherosCarreras();
    }

    public static LogicaNegocio getInstance() {
        if (logica == null) {
            logica = new LogicaNegocio();
        }
        return logica;

    }

    public void altaCorredor(String nombre, String dni, Date fechaNacimiento, String direccion, String telefonodecontacto) {
        Corredor c = new Corredor(nombre, dni, fechaNacimiento, direccion, telefonodecontacto);
        listaCorredores.add(c);
        System.out.println("Objeto añadido a la lista correctamente");
        mostrarCorredores();

    }

    public void altaCarrera(String nombrecarrera,  Date fechaCarrera,String lugar, int numMaxCorredores, ArrayList<Corredor> corredores) {
        Carrera ca = new Carrera(nombrecarrera, fechaCarrera, lugar, numMaxCorredores);
        for(Corredor c: corredores) {
            ca.inscribir(c);
        }
        listaCarreras.add(ca);
        System.out.println("Carrera añadida a la lista correctamente");
        mostrarCarreras();
    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }
    
        public List<Corredor> getCopyListaCorredores() {
            return new ArrayList(listaCorredores);
    }

    public void setLista(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    public Corredor getCorredorSelecionado() {
        return corredorSelecionado;
    }

    public void setCorredorSelecionado(Corredor corredorSelecionado) {
        this.corredorSelecionado = corredorSelecionado;
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }
    
    public List<Carrera> getListaCarrerasFinalizadas() {
        ArrayList<Carrera> finalizadas = new ArrayList<>();
        for (Carrera c : logica.getListaCarreras()) {
            if(c.isFinalizada()) {
                finalizadas.add(c);
            }
        }
        return finalizadas;
    }
    
    public List<Carrera> getListaCarrerasNoFinalizadas() {
        ArrayList<Carrera> nofinalizadas = new ArrayList<>();
        for (Carrera c : logica.getListaCarreras()) {
            if(!c.isFinalizada()) {
                nofinalizadas.add(c);
            }
        }
        return nofinalizadas;
    }

    public void setListaCarreras(List<Carrera> listaCarrera) {
        this.listaCarreras = listaCarrera;
    }

    public List<Corredor> mostrarCorredores() {
        if (listaCorredores.size() == 0) {
            //System.out.println("No hay corredores");
        } else {
            for (Corredor c : listaCorredores) {

                System.out.println(c);
            }
        }
        return listaCorredores;
    }

    public List<Carrera> mostrarCarreras() {
        if (listaCarreras.size() == 0) {

        } else {
            for (Carrera ca : listaCarreras) {
                System.out.println(ca);
            }
        }
        return listaCarreras;
    }

    private Corredor buscar(String dni) {
        for (Corredor c : listaCorredores) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    public void borrar(String dni) {
        Corredor c = buscar(dni);
        if (c == null) {
            System.out.println("Ese corredor no existe en la lista");
        } else {
            listaCorredores.remove(c);
            System.out.println("El corredor se ha eliminado de la lista");
        }

    }

    public void guardarEnFichero() {

        gf.guardar((ArrayList<Corredor>) listaCorredores, "corredores.csv");
    }

    public void leerFichero() {
        listaCorredores = gf.cargarEnModelo();
    }

    
     
     public void guardarCarrerasEnFichero() {

        gfc.guardar((ArrayList<Carrera>) listaCarreras, "carreras.csv");
    }
     
      public void guardarCarreraFinalizadaEnFichero() {
         gfc.guardarCarreraFinalizada(carreraSelecionada);
      }
      
     public void leerFicheroCarreras() {
        listaCarreras = gfc.cargarEnModelo();
    }
     
     
     
    public Carrera getCarreraSelecionada() {
        return carreraSelecionada;
    }

    public void setCarreraSelecionada(Carrera carreraSelecionada) {
        this.carreraSelecionada = carreraSelecionada;
    }
    
    public  ArrayList<Corredor> corredoresDisponiblesCarrera(Carrera ca) {
        
        ArrayList<Corredor> corredoresInscritos = ca.getListaCorredores();
        ArrayList<Corredor> corredoresDisponibles = new ArrayList<>(listaCorredores);
        
        corredoresDisponibles.removeAll(corredoresInscritos); 

        return corredoresDisponibles;
    }
    
       public  ArrayList<Corredor> corredoresInscritosCarrera(Carrera ca) {
        
        ArrayList<Corredor> corredoresInscritos = ca.getListaCorredores();
        //ArrayList<Corredor> corredoresDisponibles = new ArrayList<>(listaCorredores);
        
       // corredoresDisponibles.removeAll(corredoresDisponibles); 

        return corredoresInscritos;
    }
}
