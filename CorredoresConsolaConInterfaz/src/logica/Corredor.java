/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import util.Util;
import util.Util;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Pelayo
 */
public class Corredor {

    private String nombre;
    private String dni;
    private Date fechaNacimiento;
    private String direccion;
    private String telefonodecontacto;

    public Corredor() {
    }

    public Corredor(String nombre, String dni, Date fechaNacimiento, String direccion, String telefonodecontacto) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonodecontacto = telefonodecontacto;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return Util.formatearFechaDateAString(fechaNacimiento);
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonodecontacto() {
        return telefonodecontacto;
    }

    public void setTelefonodecontacto(String telefonodecontacto) {
        this.telefonodecontacto = telefonodecontacto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Corredor other = (Corredor) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Corredor{" + "nombre=" + nombre + ", dni=" + dni + ", fechaNacimiento=" +(fechaNacimiento) + ", direccion=" + direccion + ", telefonodecontacto=" + telefonodecontacto + '}';
    }

    public String serializar() {
        String cadena = "";
        cadena += nombre + ";";
        cadena += dni + ";";
        cadena += fechaNacimiento + ";";
        cadena += direccion + ";";
        cadena += telefonodecontacto + ";";
        cadena += "\n";
        return cadena;
    }

}
