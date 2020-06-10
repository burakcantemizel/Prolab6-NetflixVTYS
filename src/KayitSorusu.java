
import javax.swing.JFrame;

//BU SINIFTA NETBEANS GUI EDITOR ILE AUTO GENERATE KULLANILMISTIR

public class KayitSorusu extends javax.swing.JFrame {
    int mpx;
    int mpy;
    
    public KayitSorusu() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        butonEvet = new javax.swing.JButton();
        butonHayir = new javax.swing.JButton();
        titlebar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(82, 52, 62));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setText("Böyle bir hesap bulunamadı! Kayıt olmak ister misiniz?");

        butonEvet.setText("Evet");
        butonEvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonEvetActionPerformed(evt);
            }
        });

        butonHayir.setText("Hayır");
        butonHayir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonHayirActionPerformed(evt);
            }
        });

        titlebar.setBackground(new java.awt.Color(255, 51, 51));
        titlebar.setOpaque(true);
        titlebar.setPreferredSize(new java.awt.Dimension(0, 20));
        titlebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlebarMouseDragged(evt);
            }
        });
        titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlebarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butonEvet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butonHayir))
                    .addComponent(jLabel1))
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(titlebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butonEvet)
                    .addComponent(butonHayir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonHayirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonHayirActionPerformed

        this.dispose();
    }//GEN-LAST:event_butonHayirActionPerformed

    private void butonEvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonEvetActionPerformed

        //Kayıt Sayfasına yollucaz ve anasayfayı artık kapatcaz.
        Netflix.kullaniciGirisi.dispose();
        Netflix.kullaniciKayit = new KullaniciKayit();
        Netflix.kullaniciKayit.setLocationRelativeTo(null);
        Netflix.kullaniciKayit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_butonEvetActionPerformed

    private void titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseDragged
        // TODO add your handling code here:
        int px = evt.getXOnScreen();
        int py = evt.getYOnScreen();

        this.setLocation(px - mpx, py - mpy);
    }//GEN-LAST:event_titlebarMouseDragged

    private void titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMousePressed
        // TODO add your handling code here:
        mpx = evt.getX();
        mpy = evt.getY();
    }//GEN-LAST:event_titlebarMousePressed

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
            java.util.logging.Logger.getLogger(KayitSorusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitSorusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitSorusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitSorusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitSorusu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonEvet;
    private javax.swing.JButton butonHayir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titlebar;
    // End of variables declaration//GEN-END:variables
}
