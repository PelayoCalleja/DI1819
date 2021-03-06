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

/**
 *
 * @author Pelayo
 */
public class LogicaNegocio {

    private static LogicaNegocio logica;
    private List<Corredor> lista;
    private GestorDeFicheros gf;
    private Corredor corredorSelecionado;
    
    
    private LogicaNegocio() {
        lista = new ArrayList<Corredor>();
        gf= new GestorDeFicheros();
    }

    public static LogicaNegocio getInstance() {
        if (logica == null) {
            logica = new LogicaNegocio();
        }
        return logica;

    }

    public void altaCorredor(String nombre, String dni, Date fechaNacimiento, String direccion, String telefonodecontacto) {
        Corredor c = new Corredor(nombre, dni, fechaNacimiento, direccion, telefonodecontacto);
        lista.add(c);
        System.out.println("Objeto añadido a la lista correctamente");
        mostrarCorredores();
        
    }

    public List<Corredor> getLista() {
        return lista;
    }

    public void setLista(List<Corredor> lista) {
        this.lista = lista;
    }

    public Corredor getCorredorSelecionado() {
        return corredorSelecionado;
    }

    public void setCorredorSelecionado(Corredor corredorSelecionado) {
        this.corredorSelecionado = corredorSelecionado;
    }

    
    
    public List<Corredor>  mostrarCorredores() {
        if (lista.size() == 0) {
            //System.out.println("No hay corredores");
        } else {
            for (Corredor c : lista) {
                
                System.out.println(c);
            }
        }
        return lista;
    }

    private Corredor buscar(String dni){
        for(Corredor c:lista){
            if(c.getDni().equals(dni)){
                return c;
            }
        }
        return null;
    }
     
    public void borrar(String dni){
        Corredor c = buscar(dni);
        if(c==null){
            System.out.println("Ese corredor no existe en la lista");
        }else{
            lista.remove(c);
            System.out.println("El corredor se ha eliminado de la lista");
        }
        
    }
    public void guardarEnFichero(){
        
            gf.guardar((ArrayList<Corredor>) lista,"corredores.csv");
    }
    
    public void leerFichero(){
        lista=gf.cargarEnModelo();
    }
    
    
}
