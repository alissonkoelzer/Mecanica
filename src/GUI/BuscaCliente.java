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
public class BuscaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscaCliente
     */
    public BuscaCliente() {
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
        tabelacliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        selecionar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        tabelacliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelacliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 462, 94);

        jLabel1.setText("CPF");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(92, 40, 22, 16);
        getContentPane().add(cpf);
        cpf.setBounds(123, 37, 120, 22);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(86, 85, 33, 16);
        getContentPane().add(nome);
        nome.setBounds(123, 82, 120, 22);

        jButton1.setText("Buscar");
        getContentPane().add(jButton1);
        jButton1.setBounds(272, 58, 71, 25);

        selecionar.setText("Selecionar");
        getContentPane().add(selecionar);
        selecionar.setBounds(410, 260, 93, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton selecionar;
    private javax.swing.JTable tabelacliente;
    // End of variables declaration//GEN-END:variables
}
