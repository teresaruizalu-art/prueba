package vista;
import baseDatos.Conexion;
import baseDatos.OperacionesTabla;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class VtnOperaciones extends javax.swing.JFrame {

    Conexion conexion;
    OperacionesTabla operaciones;
    Usuario usuario;
    PnlConsulta pnlConsulta;
    PnlReserva pnlReserva;

   
    public VtnOperaciones() {
        initComponents();
        this.setSize(640,467);
        setTitle("Bienvenido "  );
        conexion = new Conexion();
        
       

    }

    private void quitarPaneles() {
      
        try {
            this.getContentPane().remove(pnlConsulta);
        } catch (Exception ex) {
        }
        try {
            this.getContentPane().remove(pnlReserva);
        } catch (Exception ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnuConsulta = new javax.swing.JMenuItem();
        mnuReserva = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        mnuDesconectar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu3.setText("Gestión");

        mnuConsulta.setText("Consulta instalaciones");
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(mnuConsulta);

        mnuReserva.setText("Reserva");
        mnuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReservaActionPerformed(evt);
            }
        });
        jMenu3.add(mnuReserva);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Salir");

        mnuSalir.setText("Cerrar programa");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalir);

        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDesconectar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new VtnLogin().setVisible(true);
        dispose();
        pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed
     quitarPaneles();
        pnlConsulta = new PnlConsulta();
        this.getContentPane().add(pnlConsulta);
        pack();
    }//GEN-LAST:event_mnuConsultaActionPerformed

    private void mnuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReservaActionPerformed
         quitarPaneles();
        pnlReserva = new PnlReserva(usuario);
        this.getContentPane().add(pnlReserva);
        pack();
    }//GEN-LAST:event_mnuReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuConsulta;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuReserva;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
