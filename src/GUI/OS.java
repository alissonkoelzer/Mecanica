/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.Home.PainelPri;
import javax.swing.JDesktopPane;

/**
 *
 * @author aliso
 */
public class OS extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public OS() {
        initComponents();
        
    }
     public OS(JDesktopPane PainelPri  ) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pecas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        nome_os = new javax.swing.JLabel();
        sobrenome_os = new javax.swing.JLabel();
        remover = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        novo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        adicionar = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        tb_pecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_pecas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 270, 720, 110);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF do cliente");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 90, 100, 17);
        jPanel1.add(cpf);
        cpf.setBounds(180, 90, 130, 22);

        buscar.setText("Buscar");
        jPanel1.add(buscar);
        buscar.setBounds(360, 90, 100, 25);
        jPanel1.add(nome_os);
        nome_os.setBounds(110, 130, 120, 0);
        jPanel1.add(sobrenome_os);
        sobrenome_os.setBounds(150, 170, 100, 0);

        remover.setText("Remover");
        jPanel1.add(remover);
        remover.setBounds(530, 240, 100, 25);

        editar.setText("Editar");
        jPanel1.add(editar);
        editar.setBounds(420, 240, 100, 25);

        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        jPanel1.add(novo);
        novo.setBounds(640, 240, 100, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 410);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/49142886-vintage-garage-retro-poster.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(900, 900));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 900));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 900));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1025, 640);

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        getContentPane().add(adicionar);
        adicionar.setBounds(420, 530, 100, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        CriarOS criarOS = new CriarOS();
        this.setVisible(false);
        Home.padrao(criarOS);
        
       
           
// TODO add your handling code here:
    }//GEN-LAST:event_novoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome_os;
    private javax.swing.JButton novo;
    private javax.swing.JButton remover;
    private javax.swing.JLabel sobrenome_os;
    private javax.swing.JTable tb_pecas;
    // End of variables declaration//GEN-END:variables
}
