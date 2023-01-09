/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientebbddmain;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a22paultr
 */
public class BBDD {

    ArrayList<Cliente> clientes;// = new ArrayList<>();

    public BBDD() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void altaCliente() {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        String nombre;
        String apellidos;
        String nif;

        System.out.println("Introduce el nombre: ");
        nombre = leer.nextLine();
        System.out.println("Introduce los apellidos: ");
        apellidos = leer.nextLine();
        System.out.println("Introduce el nif: ");
        nif = leer.nextLine();

        Cliente cliente = new Cliente(nombre, apellidos, nif);
        clientes.add(cliente);
    }

    public void mostrarCliente() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("cliente nº" + i + ": " + clientes.get(i).getNif());
        }
    }

    public void baixaCliente(String nif) {
        for (int i = 0; i <= clientes.size(); i++) {
            if (nif.equals(clientes.get(i).getNif())) {
               clientes.remove(i); 
            }
        }
    }
}
