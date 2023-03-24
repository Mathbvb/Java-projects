/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import javax.swing.JOptionPane;

public class Conta {
    String conta;
    String senha;
    String correntista;
    double saldo;

    public Conta(String conta, String senha, String correntista, double saldo) {
        this.conta = conta;
        this.senha = senha;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 
    public  void mostraConta(){
        JOptionPane.showMessageDialog(null, "Informações da conta"
                + "\nconta: " +conta
                + "\nsenha: " +senha
                + "\ncorrentista: " +correntista
                + "\nsaldo: " +saldo);
    }
    
    public void saque(double valor){
        if (this.saldo>= valor){
            this.saldo = this.saldo - valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        }
    }
    
    public void deposito(double valor){
        this.saldo = this.saldo + valor;
        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso");
    }
}
