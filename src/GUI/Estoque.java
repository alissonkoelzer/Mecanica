/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Bruno
 */
public class Estoque extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdicionarEstoque
     */
    public Estoque() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomepeca = new javax.swing.JTextField();
        quantidadepeca = new javax.swing.JTextField();
        valorpeca = new javax.swing.JTextField();
        adicionar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lote = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(48, 208, 526, 91);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(75, 33, 33, 16);

        jLabel2.setText("Quantidade");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(75, 100, 65, 16);

        jLabel3.setText("Valor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(299, 33, 30, 16);
        getContentPane().add(nomepeca);
        nomepeca.setBounds(113, 30, 126, 22);
        getContentPane().add(quantidadepeca);
        quantidadepeca.setBounds(145, 97, 67, 22);
        getContentPane().add(valorpeca);
        valorpeca.setBounds(334, 30, 102, 22);

        adicionar.setText("Adicionar");
        getContentPane().add(adicionar);
        adicionar.setBounds(154, 170, 85, 25);

        remover.setText("Remover");
        getContentPane().add(remover);
        remover.setBounds(251, 170, 84, 25);

        editar.setText("Editar");
        getContentPane().add(editar);
        editar.setBounds(347, 170, 65, 25);

        jLabel4.setText("N° de lote");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(299, 100, 57, 16);
        getContentPane().add(lote);
        lote.setBounds(361, 97, 90, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/86669746-vintage-garage-retro-poster.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lote;
    private javax.swing.JTextField nomepeca;
    private javax.swing.JTextField quantidadepeca;
    private javax.swing.JButton remover;
    private javax.swing.JTextField valorpeca;
    // End of variables declaration//GEN-END:variables
}
