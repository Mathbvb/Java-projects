/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminaldevendas1;

import java.util.LinkedList;

public class Inicio {

public static LinkedList<Cliente> clientes = new LinkedList<>();

public static LinkedList<Produto> produtos = new LinkedList<>();
    
    public static void main(String[] args) {
        
        clientes.add(new Cliente(1, "Mathias", "123.456.789-01", "Rua avenida, 1234"));
        clientes.add(new Cliente(2, "Sergio", "123.456.789-02", "Rua sergio, 123"));
        clientes.add(new Cliente(3, "Roberto", "123.456.789-03", "Rua roberto, 12"));
        clientes.add(new Cliente(4, "Afonso", "123.456.789-04", "Rua afonso, 1"));
        clientes.add(new Cliente(5, "Thiago", "123.456.789-05", "Rua thiago, 4321"));
        
        produtos.add(new Produto(1, "Azeite", 10, "unidade"));
        produtos.add(new Produto(2, "Ovos", 6, "duzia"));
        produtos.add(new Produto(3, "Banana", 3, "kg"));
        produtos.add(new Produto(4, "Granola", 7, "kg"));
        produtos.add(new Produto(5, "Farinha", 8, "kg"));
        produtos.add(new Produto(6, "Açúcar", 5.50, "kg"));
        produtos.add(new Produto(7, "Marshmallow", 12, "unidade"));
        
        Terminal term = new Terminal();
        term.setVisible(true);
        
    }
    
}
