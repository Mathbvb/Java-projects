/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import javax.swing.JOptionPane;

/**
 *
 * @author mrmat
 */
public class MenuConta extends javax.swing.JFrame {
    
    int nconta;
    String conta;
    
    public MenuConta() {
        initComponents();
    }

    public void contasel(){
        jButton1.setText(conta);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSaque = new javax.swing.JButton();
        jDeposito = new javax.swing.JButton();
        jSaldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu da conta");

        jLabel2.setText("Conta:");

        jButton1.setText("clique para mostrar a conta.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSaque.setText("Saque");
        jSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaqueActionPerformed(evt);
            }
        });

        jDeposito.setText("Depósito");
        jDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepositoActionPerformed(evt);
            }
        });

        jSaldo.setText("Saldo");
        jSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(48, 48, 48)
                .addComponent(jSaque)
                .addGap(18, 18, 18)
                .addComponent(jDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSaldo)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("jBconta");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        contasel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaqueActionPerformed
        String valor;
        StringBuilder mensagem = new StringBuilder();
        double saldo = Contas.lista.get(nconta).getSaldo();
        
        valor = JOptionPane.showInputDialog("Quanto deseja sacar?");
        double val = Double.parseDouble(valor);
            if (val > saldo){
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!");
                saldo = saldo - val;
                Contas.lista.get(nconta).setSaldo(saldo);
            }
            
        
    }//GEN-LAST:event_jSaqueActionPerformed

    private void jDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepositoActionPerformed
        String valor;
        StringBuilder mensagem = new StringBuilder();
        double saldo = Contas.lista.get(nconta).getSaldo();
        
        valor = JOptionPane.showInputDialog("Quanto deseja depositar?");
        double val = Double.parseDouble(valor);
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
            saldo = saldo + val;
            Contas.lista.get(nconta).setSaldo(saldo);
    }//GEN-LAST:event_jDepositoActionPerformed

    private void jSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaldoActionPerformed
        double saldo = Contas.lista.get(nconta).getSaldo();
        JOptionPane.showMessageDialog(null, "Saldo: " +saldo);
    }//GEN-LAST:event_jSaldoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jDeposito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jSaldo;
    private javax.swing.JButton jSaque;
    // End of variables declaration//GEN-END:variables
}
