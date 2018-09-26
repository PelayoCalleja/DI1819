/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class Carrera {

    private ArrayList<Corredor> corredores;

    public Carrera() {

        this.corredores = new ArrayList();
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(ArrayList<Corredor> corredores) {
        this.corredores = corredores;
    }

    public void alta() {
        Corredor c = new Corredor();
        Scanner miTeclado = new Scanner(System.in);

        String nombre;
        do {
            System.out.println("Introduce nombre del corredor");
            nombre = miTeclado.nextLine();
        } while (!c.validarNombre(nombre));

        String dni;
        do {
            System.out.println("Introduce dni del corredor");
            dni = miTeclado.nextLine();
        } while (!c.validarDni(dni));

        String fecha;
        do {
            System.out.println("Introduce la fecha de nacimiento del corredor");
            fecha = miTeclado.nextLine();
        } while (!c.validarFecha(fecha));

        String direccion;
        do {
            System.out.println("Introduce la direccion del corredor");
            direccion = miTeclado.nextLine();
        } while (!c.validarDireccion(direccion));

        String telefono;
        do {
            System.out.println("Introduce el telefono de contacto del corredor");
            telefono = miTeclado.nextLine();
        } while (!c.validarTelefono(telefono));

        corredores.add(c);
        System.out.println("El corredor ha sido introducido en la lista");
    }

    public void baja() {
        Corredor eliminar = null;
        Scanner miTeclado = new Scanner(System.in);

        String dni;
        do {
            System.out.println("Introduce dni del corredor a eliminar");
            dni = miTeclado.nextLine();
        } while (!(dni.matches("[0-9]+") && dni.length() == 8));

        for (Corredor c : corredores) {
            if (c.getDni().equals(dni)) {
                eliminar = c;
            }
        }

        if (eliminar == null) {
            System.out.println("El corredor no estaba dado de alta");
        } else {
            corredores.remove(eliminar);
            System.out.println("El corredor se ha eliminado correctamente");
        }

    }

    public void mostrarCorredores() {
        if (corredores.size() == 0) {
            System.out.println("No hay corredores");
        } else {
            for (Corredor c : corredores) {
                System.out.println(c);
            }
        }
    }

    public void modificar() {
        Corredor modificar = null;
        Scanner miTeclado = new Scanner(System.in);

        String dni;
        do {
            System.out.println("Introduce dni del corredor a modificar");
            dni = miTeclado.nextLine();
        } while (!(dni.matches("[0-9]+") && dni.length() == 8));

        for (Corredor c : corredores) {
            if (c.getDni().equals(dni)) {
                modificar = c;
            }
        }

        if (modificar == null) {
            System.out.println("El corredor no estaba dado de alta");
        } else { // El corredor estaba en la base de datos
            String nombre;
            do {
                System.out.println("El nombre actual es: " + modificar.getNombre());
                System.out.println("Introduce nuevo nombre del corredor");
                nombre = miTeclado.nextLine();
            } while (!modificar.validarNombre(nombre));

            do {
                System.out.println("Introduce dni del corredor");
                dni = miTeclado.nextLine();
            } while (!modificar.validarDni(dni));

            String fecha;
            do {
                System.out.println("Introduce la fecha de nacimiento actual del corredor" + modificar.getFechaNacimiento());
                System.out.println("Introduce la fecha de nacimiento nueva del corredor");
                fecha = miTeclado.nextLine();
            } while (!modificar.validarFecha(fecha));

            String direccion;
            do {
                System.out.println("Introduce la direccion del corredor actual" + modificar.getDireccion());
                System.out.println("Introduce la direccion del corredor nueva");
                direccion = miTeclado.nextLine();
            } while (!modificar.validarDireccion(direccion));

            String telefono;
            do {
                System.out.println("Introduce el telefono de contacto actual del corredor" + modificar.getTelefonodecontacto());
                System.out.println("Introduce el telefono de contacto nuevo del corredor");
                telefono = miTeclado.nextLine();
            } while (!modificar.validarTelefono(telefono));

            System.out.println("El corredor ha sido modificado correctamente");
        }
    }

    @Override
    public String toString() {
        return "Carrera{" + "corredores=" + corredores + '}';
    }

}
