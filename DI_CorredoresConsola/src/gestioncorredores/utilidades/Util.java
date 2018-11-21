/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pelayo
 */
public class Util {

    public static Date formatearFecharStringADate(String fechaString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        try {
            Date d = sdf.parse(fechaString);
            return d;
        } catch (ParseException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static String formatearFechaDateAString(Date fechaDate){
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        
            String s = sdf.format(fechaDate);
            return s;
      
    }
}
