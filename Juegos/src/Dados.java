
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Dados extends javax.swing.JFrame {

    private Thread hilo1;
    private Thread hilo2;   
    private boolean isRunning;
    private int valor1;
    private int valor2;
   
    
    public Dados() {
        initComponents();
    }
    private void detenerJuego() {
    isRunning = false;
    btndetener.setEnabled(false);

    try {
        hilo1.join();
        hilo2.join();
        
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        int suma =valor1+valor2;
        if (suma > 8) {
        JOptionPane.showMessageDialog(this, "¡Ganaste! obtuviste un puntaje de "+suma);
    } else{
        JOptionPane.showMessageDialog(this, "¡lo sentimos! obtuviste un puntaje de "+suma);
        }
         
     SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
           btninicio.setEnabled(true);
        }
    });
}
    private void iniciarJuego() {
    isRunning = true;
    btninicio.setEnabled(false);
    btndetener.setEnabled(true);

    hilo1 = new Thread(new Runnable() {
        @Override
        public void run() {
            while (isRunning) {
                int num = (int) (Math.random() * 6) + 1;
                String ruta = "src\\imagenes dados\\" + num + ".png";
                ImageIcon imagen = new ImageIcon(ruta);
                lbld1.setIcon(imagen);
                valor1=num;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    hilo2 = new Thread(new Runnable() {
        @Override
        public void run() {
            while (isRunning) {
                int num = (int) (Math.random() * 6) + 1;
                String ruta = "src\\imagenes dados\\" + num + ".png";
                ImageIcon imagen = new ImageIcon(ruta);
                lbld2.setIcon(imagen);
                valor2 = num;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    hilo1.start();
    hilo2.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbld1 = new javax.swing.JLabel();
        lbld2 = new javax.swing.JLabel();
        btninicio = new javax.swing.JButton();
        btndetener = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        respuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbld1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes dados/1.png"))); // NOI18N

        lbld2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes dados/1.png"))); // NOI18N

        btninicio.setText("Inicio");
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });

        btndetener.setText("Detener");
        btndetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetenerActionPerformed(evt);
            }
        });

        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Podras obtener un valor de 8 o mas?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(respuesta)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btninicio)
                                .addGap(113, 113, 113)
                                .addComponent(btndetener))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(88, 88, 88))))
                    .addComponent(jLabel1))
                .addGap(397, 397, 397))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(lbld1)
                .addGap(176, 176, 176)
                .addComponent(lbld2)
                .addGap(361, 361, 361))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbld2)
                    .addComponent(lbld1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(respuesta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btninicio)
                            .addComponent(btndetener))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu_seleccion abrir= new Menu_seleccion();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
        iniciarJuego();
    }//GEN-LAST:event_btninicioActionPerformed

    private void btndetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetenerActionPerformed
        detenerJuego();
    }//GEN-LAST:event_btndetenerActionPerformed

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
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndetener;
    private javax.swing.JButton btninicio;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbld1;
    private javax.swing.JLabel lbld2;
    private javax.swing.JLabel respuesta;
    // End of variables declaration//GEN-END:variables
}
