/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_citt.vista.totem_piso3;

import proyecto_citt.vista.*;

/**
 *
 * @author jaria
 */
public class sala306 extends javax.swing.JFrame {

    /**
     * Creates new form Piso_3
     */
    public sala306() {
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
        btn_atras = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(720, 1280));

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 1280));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_atras.setBackground(new java.awt.Color(94, 90, 92));
        btn_atras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(255, 255, 255));
        btn_atras.setText("Volver Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 980, 220, 52));

        btn_inicio.setBackground(new java.awt.Color(94, 90, 92));
        btn_inicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio.setText("Inicio");
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 980, 220, 52));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_citt/vista/Imagenes/img_piso3/sala306-1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 279, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 85)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    Sala 306");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 105, 556, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_citt/vista/Imagenes/HOME.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 1280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
       new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        new Piso_3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(sala306.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sala306.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sala306.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sala306.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sala306().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
