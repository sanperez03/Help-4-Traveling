/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author PERSONAL
 */
public class JRealizarReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form JRealizarReserva
     */
    public JRealizarReserva() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Realizar Reserva");
        getContentPane().setLayout(null);

        jLabel1.setText("Precio Total:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 28, 60, 14);

        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 50, 14);

        jLabel3.setText("Servicio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 50, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(70, 130, 56, 20);

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 41, 14);

        jLabel5.setText("Fecha Inicio:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 170, 70, 14);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 210, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
