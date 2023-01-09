/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientebbddmain;
import java.util.HashMap;
/**
 *
 * @author a22paultr
 */
public class AxendaTelefonica {
    
    private HashMap<Integer, Cliente> axenda = new HashMap<> ();
    
    

    public HashMap<Integer, Cliente> getAxenda() {
        return axenda;
    }

    public void setAxenda(HashMap<Integer, Cliente> axenda) {
        this.axenda = axenda;
    }
    
    
}
