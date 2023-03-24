/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import java.util.LinkedList;


public class Contas {
    
public static LinkedList<Conta> lista = new LinkedList<>();
    
    public static void main(String[] args) {
        
        lista.add(new Conta("2005", "0504", "Mathias", 1025));
        lista.add(new Conta("2001", "0405", "Bernardo", 1125));
        lista.add(new Conta("1234", "4321", "Sergio", 825));
        lista.add(new Conta("7896", "6789", "Marco Aurélio", 21500));
        lista.add(new Conta("0123", "3210", "Caneta Azul", 4321));
    
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        }
}