/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author PERSONAL
 */
public class JAltaServicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form JAltaServicio
     */
    public JAltaServicio() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setTitle("Alta de Servicio");
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 41, 14);

        jLabel2.setText("Descripcion:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 58, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 60, 190, 96);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 30, 111, 20);

        jLabel3.setText("Imagenes:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 51, 14);

        jButton1.setText("Examinar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 210, 77, 23);

        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 270, 33, 14);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(120, 270, 112, 20);

        jLabel5.setText("Ciudad Origen:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 300, 72, 14);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(120, 300, 112, 20);

        jLabel6.setText("Ciudad Destino:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 330, 76, 14);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(120, 330, 112, 20);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 60, 80, 225);

        jLabel7.setText("Categorias:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 30, 56, 14);

        jLabel8.setText("Proveedor:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 360, 54, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 360, 112, 20);

        jButton2.setText("ACEPTAR");
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 410, 79, 23);

        jButton3.setText("CANCELAR");
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 410, 85, 23);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(120, 180, 140, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser selectorArchivo = (JFileChooser) evt.getSource();
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        selectorArchivo.setMultiSelectionEnabled(false);
        FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("JPG & PNG","jpg","png");
        selectorArchivo.setFileFilter(filtroImagen);
        int returnselection = selectorArchivo.showOpenDialog(null);
        if(returnselection == JFileChooser.APPROVE_OPTION){
            File archivoSeleccionado = selectorArchivo.getSelectedFile();
            String filename = archivoSeleccionado.getName();
            String ruta = archivoSeleccionado.getAbsolutePath();
            JOptionPane.showMessageDialog(this, "Ruta: " + ruta + "\tArchivo: " + filename);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
