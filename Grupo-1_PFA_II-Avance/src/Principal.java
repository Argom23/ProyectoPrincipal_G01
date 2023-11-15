
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDP_Escritorio = new javax.swing.JDesktopPane();
        JMB_MenuLogin = new javax.swing.JMenuBar();
        J_MenuLogin = new javax.swing.JMenu();
        JMI_MenuInv = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JDP_EscritorioLayout = new javax.swing.GroupLayout(JDP_Escritorio);
        JDP_Escritorio.setLayout(JDP_EscritorioLayout);
        JDP_EscritorioLayout.setHorizontalGroup(
            JDP_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        JDP_EscritorioLayout.setVerticalGroup(
            JDP_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        J_MenuLogin.setText("Menu principal");

        JMI_MenuInv.setText("Menu de Inventario");
        JMI_MenuInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_MenuInvActionPerformed(evt);
            }
        });
        J_MenuLogin.add(JMI_MenuInv);

        JMB_MenuLogin.add(J_MenuLogin);
        JMB_MenuLogin.add(jMenu2);

        setJMenuBar(JMB_MenuLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDP_Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDP_Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_MenuInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_MenuInvActionPerformed
        // TODO add your handling code here:
        SubMenu_Inventario m_inv = new SubMenu_Inventario();
        JDP_Escritorio.add(m_inv);
        m_inv.show();
    }//GEN-LAST:event_JMI_MenuInvActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDP_Escritorio;
    private javax.swing.JMenuBar JMB_MenuLogin;
    private javax.swing.JMenuItem JMI_MenuInv;
    private javax.swing.JMenu J_MenuLogin;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
