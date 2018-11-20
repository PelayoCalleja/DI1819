/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author Annie
 */
public class Componente extends JLabel implements Serializable{

    private String nombre; 
    private String propiedad1;
    private int propiedad2;
    private Color propiedad3;
    private Font propiedad4;
    private boolean propiedad5;
    private File propiedad6;
    private float propiedad7;
   
    private static final String SALUDO="Hola Mundo";

    public Componente() {
   super(); //llamada al constructor del JLabel
   setText(SALUDO);
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public String getPropiedad1() {
        return propiedad1;
    }

    public void setPropiedad1(String propiedad1) {
        this.propiedad1 = propiedad1;
    }

    public int getPropiedad2() {
        return propiedad2;
    }

    public void setPropiedad2(int propiedad2) {
        this.propiedad2 = propiedad2;
    }

    public Color getPropiedad3() {
        return propiedad3;
    }

    public void setPropiedad3(Color propiedad3) {
        this.propiedad3 = propiedad3;
    }

    public Font getPropiedad4() {
        return propiedad4;
    }

    public void setPropiedad4(Font propiedad4) {
        this.propiedad4 = propiedad4;
    }

    public boolean isPropiedad5() {
        return propiedad5;
    }

    public void setPropiedad5(boolean propiedad5) {
        this.propiedad5 = propiedad5;
    }

    public File getPropiedad6() {
        return propiedad6;
    }

    public void setPropiedad6(File propiedad6) {
        this.propiedad6 = propiedad6;
    }

    public float getPropiedad7() {
        return propiedad7;
    }

    public void setPropiedad7(float propiedad7) {
        this.propiedad7 = propiedad7;
    }

  
    
    
    
    
}
