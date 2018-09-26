/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.vista;

import gestioncorredores.controlador.GestorDeFicheros;
import gestioncorredores.modelo.Carrera;
import gestioncorredores.modelo.Corredor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class Main {

    public static void mostrarMenu() {

        System.out.println("----------------------");
        System.out.println("MENÚ GESTIÓN DE CORREDORES");
        System.out.println("1-Dar de alta al corredor");
        System.out.println("2-Dar de baja al corredor");
        System.out.println("3-Modificar corredores");
        System.out.println("4-Cargar el fichero");
        System.out.println("5-Guardar el fichero");
        System.out.println("6-Mostrar corredores");
        System.out.println("7-Salir");
        System.out.println("Selecciona una opcion");

    }

    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);
        int opcion = 1;
        Carrera ca = new Carrera();
        GestorDeFicheros gf = new GestorDeFicheros();
        while (opcion != 7) {
            mostrarMenu();
            opcion = miTeclado.nextInt();

            switch (opcion) {
                case 1:
                    ca.alta();

                    break;
                case 2:
                    ca.baja();
                    break;

                case 3:
                    ca.modificar();
                    break;
                case 4:
                    ca.setCorredores(gf.cargarEnModelo());

                    break;

                case 5:

                    gf.guardar(ca.getCorredores(), "Corredores.csv");
                    break;

                case 6:
                    ca.mostrarCorredores();
                    break;

                case 7:
                    System.out.println("Fin del programa");
                    break;
            }

        }

    }
}
