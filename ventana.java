package inventario;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import inventario.Anadirproductos;
import inventario.Producto;
import java.util.Calendar;

public class ventana extends javax.swing.JFrame implements ActionListener{
    Proveedor p1 = new Proveedor();
    Cliente p2 = new Cliente();
    Producto p3 = new Producto();
    Contabilidad p4 = new Contabilidad();
    Ventas p5 = new Ventas();  
    /**
     * Creates new form ventana
     */
    public ventana () {
        initComponents();
        panelmadre.add(p1);
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        proveedor.addActionListener(this);
        clientes.addActionListener(this);
        ventas.addActionListener(this);
        productos.addActionListener(this);
        contabilidad.addActionListener(this);
        desactivar();
    }
        private void desactivar(){
        if (p1.isVisible()){
        proveedor.setEnabled(false);
        clientes.setEnabled(true);
        ventas.setEnabled(true);
        contabilidad.setEnabled(true);
        productos.setEnabled(true);
        }else if (p2.isVisible()){
        proveedor.setEnabled(true);
        clientes.setEnabled(false);
        ventas.setEnabled(true);
        contabilidad.setEnabled(true);
        productos.setEnabled(true);
        }else if (p3.isVisible()){
        proveedor.setEnabled(true);
        clientes.setEnabled(true);
        ventas.setEnabled(true);
        contabilidad.setEnabled(true);
        productos.setEnabled(false);
        }else if(p4.isVisible()){
        proveedor.setEnabled(true);
        clientes.setEnabled(true);
        ventas.setEnabled(true);
        contabilidad.setEnabled(false);
        productos.setEnabled(true);
        }else if(p5.isVisible()){
        proveedor.setEnabled(true);
        clientes.setEnabled(true);
        ventas.setEnabled(false);
        contabilidad.setEnabled(true);
        productos.setEnabled(true);
        }
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        fechalabel.setText("FECHA: "+fecha);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmadre = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        productos = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        contabilidad = new javax.swing.JButton();
        proveedor = new javax.swing.JButton();
        fechalabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAINVEN");

        panelmadre.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(233, 248, 249));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        productos.setBackground(new java.awt.Color(155, 185, 222));
        productos.setText("PRODUCTOS");
        jPanel2.add(productos);

        ventas.setBackground(new java.awt.Color(155, 185, 222));
        ventas.setText("REGISTRO VENTA");
        jPanel2.add(ventas);

        clientes.setBackground(new java.awt.Color(155, 185, 222));
        clientes.setText("CLIENTES");
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        jPanel2.add(clientes);

        contabilidad.setBackground(new java.awt.Color(155, 185, 222));
        contabilidad.setText("CONTABILIDAD");
        jPanel2.add(contabilidad);

        proveedor.setBackground(new java.awt.Color(155, 185, 222));
        proveedor.setText("PROVEEDOR");
        jPanel2.add(proveedor);

        fechalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(fechalabel);

        panelmadre.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(panelmadre, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientes;
    private javax.swing.JButton contabilidad;
    private javax.swing.JLabel fechalabel;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel panelmadre;
    private javax.swing.JButton productos;
    private javax.swing.JButton proveedor;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed (ActionEvent e) {
        Object evt=e.getSource();
        if(evt.equals(clientes)){
            panelmadre.add(p2);
            p1.setVisible(false);
            p2.setVisible(true);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(false);
            panelmadre.validate();
            panelmadre.add(p1);
            desactivar();
        }else if(evt.equals(proveedor)){
            p1.setVisible(true);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(false);
            panelmadre.validate();
            panelmadre.add(p2);
            desactivar();
        }else if(evt.equals(ventas)){
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(true);
            panelmadre.validate();
            panelmadre.add(p5);
            desactivar();
        }else if (evt.equals(productos)){
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(true);
            p4.setVisible(false);
            p5.setVisible(false);
            panelmadre.validate();
            panelmadre.add(p3);
            desactivar();
        }else if(evt.equals(contabilidad)){
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(true);
            p5.setVisible(false);
            panelmadre.validate();
            panelmadre.add(p4);
            desactivar();
        }
    }
}
