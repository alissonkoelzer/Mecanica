/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JInternalFrame;

/**
 *
 * @author aliso
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        PainelPri = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cliente = new javax.swing.JMenu();
        Estoque = new javax.swing.JMenu();
        Fornecedor = new javax.swing.JMenu();
        OS = new javax.swing.JMenu();
        Veiculo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PainelPriLayout = new javax.swing.GroupLayout(PainelPri);
        PainelPri.setLayout(PainelPriLayout);
        PainelPriLayout.setHorizontalGroup(
            PainelPriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
        );
        PainelPriLayout.setVerticalGroup(
            PainelPriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );

        Cliente.setText("Cliente");
        Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClienteMouseClicked(evt);
            }
        });
        jMenuBar1.add(Cliente);

        Estoque.setText("Estoque");
        Estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstoqueMouseClicked(evt);
            }
        });
        jMenuBar1.add(Estoque);

        Fornecedor.setText("Fornecedor");
        Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FornecedorMouseClicked(evt);
            }
        });
        jMenuBar1.add(Fornecedor);

        OS.setText("OS");
        OS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OSMouseClicked(evt);
            }
        });
        jMenuBar1.add(OS);

        Veiculo.setText("Veiculo");
        Veiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VeiculoMouseClicked(evt);
            }
        });
        jMenuBar1.add(Veiculo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPri)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPri, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstoqueMouseClicked
        Estoque e = new Estoque();
        e.setClosable(true);
        e.setVisible(true);
        e.setSize(950, 600);
        PainelPri.add(e);

    }//GEN-LAST:event_EstoqueMouseClicked

    private void FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FornecedorMouseClicked
        Fornecedor f = new Fornecedor();
        f.setClosable(true);
        f.setVisible(true);
        f.setSize(1200, 800);
        PainelPri.add(f);

    }//GEN-LAST:event_FornecedorMouseClicked

    private void OSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OSMouseClicked
        OS o = new OS(PainelPri);
        o.setClosable(true);
        o.setVisible(true);
        o.setSize(900, 500);
        PainelPri.add(o);
    }//GEN-LAST:event_OSMouseClicked

    private void VeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VeiculoMouseClicked
        Veiculo v = new Veiculo();

        padrao(v);
        v.setSize(700, 500);
    }//GEN-LAST:event_VeiculoMouseClicked

    private void ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteMouseClicked
        Cliente c = new Cliente();
        padrao(c);

        c.setSize(800, 400);

    }//GEN-LAST:event_ClienteMouseClicked

    public static void padrao(JInternalFrame frame) {
        frame.setClosable(true);
        frame.setVisible(true);
        frame.setSize(800, 400);
        PainelPri.add(frame);

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenu Estoque;
    private javax.swing.JMenu Fornecedor;
    private javax.swing.JMenu OS;
    public static javax.swing.JDesktopPane PainelPri;
    private javax.swing.JMenu Veiculo;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
