/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jealm_000
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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

        Consultas = new javax.swing.JTabbedPane();
        Consulta1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta1 = new javax.swing.JTable();
        Consultar1 = new javax.swing.JButton();
        Borrar1 = new javax.swing.JButton();
        Consulta2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaConsulta2 = new javax.swing.JTable();
        Consultar2 = new javax.swing.JButton();
        Borrar2 = new javax.swing.JButton();
        Consulta3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaConsulta3 = new javax.swing.JTable();
        Consultar3 = new javax.swing.JButton();
        Borrar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaConsulta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "CIUDAD"
            }
        ));
        jScrollPane1.setViewportView(TablaConsulta1);

        Consultar1.setText("Consultar");
        Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar1ActionPerformed(evt);
            }
        });

        Borrar1.setText("Borrar");
        Borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Consulta1Layout = new javax.swing.GroupLayout(Consulta1);
        Consulta1.setLayout(Consulta1Layout);
        Consulta1Layout.setHorizontalGroup(
            Consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(Consulta1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(Consultar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(Borrar1)
                .addGap(155, 155, 155))
        );
        Consulta1Layout.setVerticalGroup(
            Consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consultar1)
                    .addComponent(Borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        Consultas.addTab("Consulta 1", Consulta1);

        TablaConsulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PROYECTO", "CONSTRUCTORA", "HABITACIONES", "CIUDAD"
            }
        ));
        jScrollPane3.setViewportView(TablaConsulta2);

        Consultar2.setText("Consultar");
        Consultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar2ActionPerformed(evt);
            }
        });

        Borrar2.setText("Borrar");
        Borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Consulta2Layout = new javax.swing.GroupLayout(Consulta2);
        Consulta2.setLayout(Consulta2Layout);
        Consulta2Layout.setHorizontalGroup(
            Consulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(Consulta2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(Consultar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(Borrar2)
                .addGap(155, 155, 155))
        );
        Consulta2Layout.setVerticalGroup(
            Consulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Consulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consultar2)
                    .addComponent(Borrar2))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Consultas.addTab("Consulta 2", Consulta2);

        TablaConsulta3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID COMPRA", "CONSTRUCTORA", "BANCO"
            }
        ));
        jScrollPane2.setViewportView(TablaConsulta3);

        Consultar3.setText("Consultar");
        Consultar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar3ActionPerformed(evt);
            }
        });

        Borrar3.setText("Borrar");
        Borrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Consulta3Layout = new javax.swing.GroupLayout(Consulta3);
        Consulta3.setLayout(Consulta3Layout);
        Consulta3Layout.setHorizontalGroup(
            Consulta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(Consulta3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(Consultar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(Borrar3)
                .addGap(155, 155, 155))
        );
        Consulta3Layout.setVerticalGroup(
            Consulta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Consulta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consultar3)
                    .addComponent(Borrar3))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Consultas.addTab("Consulta 3", Consulta3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Consultas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar1ActionPerformed
        // TODO add your handling code here:
                    TablaConsulta1.setModel(CtConsulta1.MostrarConsulta1());
                    
    }//GEN-LAST:event_Consultar1ActionPerformed

    private void Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar1ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel modelo = new DefaultTableModel();
            TablaConsulta1.setModel(modelo);
            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("CIUDAD");
    }//GEN-LAST:event_Borrar1ActionPerformed

    private void Consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar2ActionPerformed
        // TODO add your handling code here:
        TablaConsulta2.setModel(CtConsulta2.MostrarConsulta2());
    }//GEN-LAST:event_Consultar2ActionPerformed

    private void Borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar2ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel modelo = new DefaultTableModel();
            TablaConsulta2.setModel(modelo);
            modelo.addColumn("ID PROYECTO");
            modelo.addColumn("CONSTRUCTORA");
            modelo.addColumn("HABITACIONES");
            modelo.addColumn("CIUDAD");
    }//GEN-LAST:event_Borrar2ActionPerformed

    private void Borrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar3ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel modelo = new DefaultTableModel();
            TablaConsulta3.setModel(modelo);
            modelo.addColumn("ID COMPRA");
            modelo.addColumn("CONSTRUCTORA");
            modelo.addColumn("BANCO");
    }//GEN-LAST:event_Borrar3ActionPerformed

    private void Consultar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar3ActionPerformed
        // TODO add your handling code here:
                TablaConsulta3.setModel(CtConsulta3.MostrarConsulta3());
    }//GEN-LAST:event_Consultar3ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar1;
    private javax.swing.JButton Borrar2;
    private javax.swing.JButton Borrar3;
    private javax.swing.JPanel Consulta1;
    private javax.swing.JPanel Consulta2;
    private javax.swing.JPanel Consulta3;
    private javax.swing.JButton Consultar1;
    private javax.swing.JButton Consultar2;
    private javax.swing.JButton Consultar3;
    private javax.swing.JTabbedPane Consultas;
    private javax.swing.JTable TablaConsulta1;
    private javax.swing.JTable TablaConsulta2;
    private javax.swing.JTable TablaConsulta3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}