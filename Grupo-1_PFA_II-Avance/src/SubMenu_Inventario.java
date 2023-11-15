
public class SubMenu_Inventario extends javax.swing.JInternalFrame {

    public SubMenu_Inventario() {
        initComponents();
    }
    Inventario inv = new Inventario();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_NombreM = new javax.swing.JLabel();
        Opcion1 = new javax.swing.JButton();
        JL_MenuInv = new javax.swing.JLabel();
        Opcion2 = new javax.swing.JButton();
        Opcion3 = new javax.swing.JButton();
        Opcion4 = new javax.swing.JButton();
        Opcion5 = new javax.swing.JButton();

        JL_NombreM.setText("<---------------------------Grupo1 Market------------------------->");

        Opcion1.setLabel("1------> Mostrar inventario actual.");
        Opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion1ActionPerformed(evt);
            }
        });

        JL_MenuInv.setText("Control de Inventario");

        Opcion2.setLabel("2------> Modificar el numero de articulos.");
        Opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion2ActionPerformed(evt);
            }
        });

        Opcion3.setLabel("3------> Ingresar nuevo producto.");
        Opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion3ActionPerformed(evt);
            }
        });

        Opcion4.setLabel("4------> Eliminar un producto.");
        Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion4ActionPerformed(evt);
            }
        });

        Opcion5.setLabel("5------> Salir al menu principal.");
        Opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(JL_NombreM))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Opcion2)
                            .addComponent(Opcion1)
                            .addComponent(Opcion3)
                            .addComponent(Opcion4)
                            .addComponent(Opcion5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(JL_MenuInv)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JL_NombreM)
                .addGap(4, 4, 4)
                .addComponent(JL_MenuInv)
                .addGap(12, 12, 12)
                .addComponent(Opcion1)
                .addGap(12, 12, 12)
                .addComponent(Opcion2)
                .addGap(12, 12, 12)
                .addComponent(Opcion3)
                .addGap(12, 12, 12)
                .addComponent(Opcion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Opcion5)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion1ActionPerformed
        inv.mostrar();
    }//GEN-LAST:event_Opcion1ActionPerformed

    private void Opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion2ActionPerformed
        inv.modificar_num_articulos();
    }//GEN-LAST:event_Opcion2ActionPerformed

    private void Opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion3ActionPerformed
        inv.nuevo_produto();
    }//GEN-LAST:event_Opcion3ActionPerformed

    private void Opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion4ActionPerformed
        inv.eliminar_producto();
    }//GEN-LAST:event_Opcion4ActionPerformed

    private void Opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_Opcion5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_MenuInv;
    private javax.swing.JLabel JL_NombreM;
    private javax.swing.JButton Opcion1;
    private javax.swing.JButton Opcion2;
    private javax.swing.JButton Opcion3;
    private javax.swing.JButton Opcion4;
    private javax.swing.JButton Opcion5;
    // End of variables declaration//GEN-END:variables
}
