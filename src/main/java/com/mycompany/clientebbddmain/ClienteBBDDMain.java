/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.clientebbddmain;

import java.util.Scanner;

/**
 *
 * @author a22paultr
 */
public class ClienteBBDDMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta;

        BBDD baseDeDatos1 = new BBDD();

        //HOLA PAUL, GUAPO
        //SEGUNDO COMENTARIO PARA EL GUAPO DE LUCAS
        do {
            System.out.println("Elija la operación que desea realizar:\n");
            System.out.println("Añadir un cliente nuevo (pulse 1)");
            System.out.println("Mostrar los clientes registrados (pulse 2)");
            System.out.println("Dar de baja a un cliente (pulse 3)");

            respuesta = leer.nextLine();

            if ("1".equals(respuesta)) {
                System.out.println("Introduzca los datos del cliente:\n");
                baseDeDatos1.altaCliente();
            } else if ("2".equals(respuesta)) {
                System.out.println("Lista de clientes registrados:\n");
                baseDeDatos1.mostrarCliente();
            } else {
                System.out.println("Introduzca el nif del cliente que desea dar de baja:\n");
                respuesta = leer.nextLine();
                baseDeDatos1.baixaCliente(respuesta);
            }
            System.out.println("¿Desea realizar más operaciones?");
            respuesta = leer.nextLine();
        } while ("s".equals(respuesta));
    }
}
