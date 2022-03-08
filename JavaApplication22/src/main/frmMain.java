
package main;

import static java.lang.Math.random;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Random;

/**
 *
 * @author migu_
 */
public class frmMain extends javax.swing.JFrame {
         Hilo miHilo1 = new Hilo();
         Hilo miHilo2 = new Hilo();
    
    public frmMain() {
        initComponents();
        lblNumero1.setText("");
        
        lblLetra.setText("");
        
          //hilos
        miHilo1.window = 1;
        miHilo1.start();
        miHilo2.window = 2;
        miHilo2.start();
    }
    
    public class Hilo extends Thread {
        public int window = 0;
        private boolean run = false;
        
        public void startRunning(){
            run  = true;
        }
        
        public void stopRunning(){
            run  = false;
        }
        
        public int getRandom(){
            int random = (int)(Math.random() * 10 + 1);
            return random;
        }
        
        public char getRandom2(){
            Random random = new Random();
            char randomizedCharacter = (char) (random.nextInt(26) + 'a');            
            return randomizedCharacter;
        }
        
        
        @Override
        public void run(){
            while(window == 1){
                while(run){
                    lblNumero1.setText(String.valueOf(miHilo1.getRandom()));
                     try{
                        Thread.sleep(100);
                    } catch (InterruptedException ex){
                        java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);                    
                } catch(InterruptedException ex){
                    java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);                 }
            }
            
            while(window == 2){
                while(run){
                     lblLetra.setText(String.valueOf(miHilo2.getRandom2()));
                     try{
                        Thread.sleep(100);
                    } catch (InterruptedException ex){
                        java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);                    
                } catch(InterruptedException ex){
                    java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);                 }
            }
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLetra = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        btnIniciarNumero = new javax.swing.JButton();
        btnIniciarLetra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLetra.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLetra.setText("a");

        lblNumero1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNumero1.setText("0");

        btnIniciarNumero.setText("Iniciar");
        btnIniciarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarNumeroActionPerformed(evt);
            }
        });

        btnIniciarLetra.setText("Iniciar");
        btnIniciarLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarLetraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLetra)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnIniciarNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnIniciarLetra)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(lblNumero1)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblLetra)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarNumero)
                    .addComponent(btnIniciarLetra))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(lblNumero1)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarNumeroActionPerformed
        // TODO add your handling code here:
        miHilo1.startRunning();
    }//GEN-LAST:event_btnIniciarNumeroActionPerformed

    private void btnIniciarLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarLetraActionPerformed
        // TODO add your handling code here:
        miHilo2.startRunning();
    }//GEN-LAST:event_btnIniciarLetraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarLetra;
    private javax.swing.JButton btnIniciarNumero;
    private javax.swing.JLabel lblLetra;
    private javax.swing.JLabel lblNumero1;
    // End of variables declaration//GEN-END:variables
}
