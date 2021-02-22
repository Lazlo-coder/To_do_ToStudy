/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import com.sun.org.apache.bcel.internal.generic.LoadClass;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lasaro Almeida
 */
public class Compromissos extends javax.swing.JFrame {

    /**
     * Creates new form Compromissos
     */
    public Compromissos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Avancar = new javax.swing.JButton();
        jButton_Voltar = new javax.swing.JButton();
        jLabel1_Mes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(127, 80, 121));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jButton_Avancar.setBackground(new java.awt.Color(127, 80, 121));
        jButton_Avancar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Avancar.setForeground(new java.awt.Color(255, 211, 16));
        jButton_Avancar.setText(">");
        jButton_Avancar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_Avancar.setBorderPainted(false);
        jButton_Avancar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Avancar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton_Avancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_AvancarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_AvancarMouseExited(evt);
            }
        });
        jButton_Avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AvancarActionPerformed(evt);
            }
        });

        jButton_Voltar.setBackground(new java.awt.Color(127, 80, 121));
        jButton_Voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Voltar.setForeground(new java.awt.Color(255, 211, 16));
        jButton_Voltar.setText("<");
        jButton_Voltar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_Voltar.setBorderPainted(false);
        jButton_Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Voltar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_VoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_VoltarMouseExited(evt);
            }
        });
        jButton_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VoltarActionPerformed(evt);
            }
        });

        jLabel1_Mes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1_Mes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Mes, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Avancar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Avancar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 301, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Color color_one = new Color(0, 191, 255);
    Color color_two = new Color(127, 80, 121);
    private static String[] mesNomes = new String[12];
    private static int mesAtual;
    static {
        mesNomes[0] = "Janeiro";
        mesNomes[1] = "Fevereiro";
        mesNomes[2] = "Março";
        mesNomes[3] = "Abril";
        mesNomes[4] = "Maio";
        mesNomes[5] = "Junho";
        mesNomes[6] = "Julho";
        mesNomes[7] = "Agosto";
        mesNomes[8] = "Setembro";
        mesNomes[9] = "Outubro";
        mesNomes[10] = "Novembro";
        mesNomes[11] = "Dezembro";
    }
    
    private void jButton_AvancarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AvancarMouseEntered
        // TODO add your handling code here:
        jButton_Avancar.setBackground(color_one);
    }//GEN-LAST:event_jButton_AvancarMouseEntered

    private void jButton_AvancarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AvancarMouseExited
        // TODO add your handling code here:
        jButton_Avancar.setBackground(color_two);
    }//GEN-LAST:event_jButton_AvancarMouseExited

    private void jButton_AvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AvancarActionPerformed
        // TODO add your handling code here:
        if(mesAtual==11){
            mesAtual=-1;
        }
        trocar_Mes(1);
    }//GEN-LAST:event_jButton_AvancarActionPerformed

    private void jButton_VoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_VoltarMouseEntered
        // TODO add your handling code here:
        jButton_Voltar.setBackground(color_one);
    }//GEN-LAST:event_jButton_VoltarMouseEntered

    private void jButton_VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_VoltarMouseExited
        // TODO add your handling code here:
        jButton_Voltar.setBackground(color_two);
    }//GEN-LAST:event_jButton_VoltarMouseExited

    private void jButton_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VoltarActionPerformed
        // TODO add your handling code here:
        if(mesAtual==0){
            mesAtual=12;
        }
        trocar_Mes(-1);
    }//GEN-LAST:event_jButton_VoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Date data= new Date();
        SimpleDateFormat mes= new SimpleDateFormat("M");
        mesAtual= Integer.parseInt(mes.format(data))-1;
        jLabel1_Mes.setText(mesNomes[mesAtual]);
        jLabel1_Mes.setForeground(new Color(255,211,16));
        
    }//GEN-LAST:event_formWindowOpened
    private void trocar_Mes(int op) { 
        jLabel1_Mes.setText(mesNomes[mesAtual+op]);
        mesAtual+=op;
         
    }

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
            java.util.logging.Logger.getLogger(Compromissos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compromissos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compromissos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compromissos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compromissos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Avancar;
    private javax.swing.JButton jButton_Voltar;
    private javax.swing.JLabel jLabel1_Mes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
