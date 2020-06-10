
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JFrame;


//BU SINIFTA NETBEANS GUI EDITOR ILE AUTO GENERATE KULLANILMISTIR

public class KullaniciKayit extends javax.swing.JFrame {
    int mpx;
    int mpy;
    Arkaplan arkaplan;
    

    public KullaniciKayit() {
        initComponents();
        
        arkaplan = new Arkaplan(this.getWidth(), this.getHeight());
        arkaplan.setBounds(0,0,this.getWidth(), this.getHeight());
        //add(arkaplan);
        this.add(arkaplan);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        girdiAd = new javax.swing.JTextField();
        girdiEPosta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        butonKayitTamamla = new javax.swing.JButton();
        girdiGun = new javax.swing.JComboBox<>();
        girdiAy = new javax.swing.JComboBox<>();
        girdiYil = new javax.swing.JComboBox<>();
        uyariEPosta = new javax.swing.JLabel();
        uyariAd = new javax.swing.JLabel();
        uyariSifre = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        maxmin = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        girdiSifre = new javax.swing.JPasswordField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ad:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-Posta:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Şifre:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doğum Tarihi:");

        butonKayitTamamla.setForeground(new java.awt.Color(255, 255, 255));
        butonKayitTamamla.setText("Devam Et");
        butonKayitTamamla.setOpaque(false);
        butonKayitTamamla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonKayitTamamlaActionPerformed(evt);
            }
        });

        girdiGun.setForeground(new java.awt.Color(255, 255, 255));
        girdiGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        girdiAy.setForeground(new java.awt.Color(255, 255, 255));
        girdiAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        girdiYil.setForeground(new java.awt.Color(255, 255, 255));
        girdiYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        uyariEPosta.setForeground(new java.awt.Color(255, 51, 51));

        uyariAd.setForeground(new java.awt.Color(255, 51, 51));

        uyariSifre.setForeground(new java.awt.Color(255, 51, 51));

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

        maxmin.setBackground(new java.awt.Color(255, 51, 51));
        maxmin.setForeground(new java.awt.Color(255, 255, 255));
        maxmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxmin.setText("_");
        maxmin.setOpaque(true);
        maxmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maxminMousePressed(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 51, 51));
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimgui/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(maxmin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(girdiAd)
                    .addComponent(girdiEPosta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(butonKayitTamamla, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(girdiGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(girdiAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(girdiYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(girdiSifre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uyariSifre)
                    .addComponent(uyariAd)
                    .addComponent(uyariEPosta))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxmin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girdiAd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyariAd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girdiEPosta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(uyariEPosta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(uyariSifre)
                    .addComponent(girdiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(girdiGun, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girdiAy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girdiYil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butonKayitTamamla)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonKayitTamamlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonKayitTamamlaActionPerformed
        // TODO add your handling code here:
        //Kayıt işlemi yapılcak
        
        //ismi al - kontrol et
        //sifreyi al - kontrol et
        //epostayi al - kontrol et //Aynı eposta olamaz
        //tarihi al (Sınırları belli kontrole gerek yok) // Yaş sınırı da yok
        
        //eğer tüm girdiler uygunsa kayıt sorgusunu calistir.
        
        
        
        uyariAd.setText("");
        uyariEPosta.setText("");
        uyariSifre.setText("");
        boolean isimUygun = false;
        boolean sifreUygun = false;
        boolean epostaUygun = false;
        
        //Böyle bir hesap var mı?
        boolean zatenVar = false;
        
        String ad = girdiAd.getText();
        if(ad.length() > 0 && ad.length() < 45){
            isimUygun = true;
        }else if(ad.length() <= 0){
            uyariAd.setText("Ad boş olamaz!");
        }else if(ad.length() > 45){
            uyariAd.setText("Ad çok uzun!");
        }
        
        String sifre = girdiSifre.getText();
        if(sifre.length() > 0 && sifre.length() < 45){
            sifreUygun = true;
        }else if(sifre.length() <= 0){
            uyariSifre.setText("Şifre boş olamaz!");
        }else if(sifre.length() > 45){
            uyariSifre.setText("Şifre çok uzun!");
        }
        
        String eposta = girdiEPosta.getText();
        if(eposta.length() > 0 && eposta.length() < 45){
            
            //Eposta doğru formatta mı?
            if(mailKontrol(eposta)){
                epostaUygun = true;
            }else{
                uyariEPosta.setText("Geçersiz E-Posta Girdiniz!");
            }
            
            //Bu Eposta ile kayıtlı kullanıcı var mı?
            if(epostaUygun == true){
                try{
                    String hesapDurumuSorgu ="SELECT kullaniciEPosta FROM kullanici WHERE KullaniciEPosta = \'"+eposta+"\'"; 
                    Veritabani.stmt = (Statement)Veritabani.con.createStatement();
                    Veritabani.rs = Veritabani.stmt.executeQuery(hesapDurumuSorgu);
                    while(Veritabani.rs.next()){
                        zatenVar = true;
                        //Hatayi basıcaz zaten böyle bir hesap var diye
                        uyariEPosta.setText("Bu E-Posta zaten mevcut!");
                    }
                }catch(SQLException ex){

                }
            }
             
        }else if(eposta.length() <= 0){
            uyariEPosta.setText("E-Posta boş olamaz!");
        }else if(eposta.length() > 45){
            uyariEPosta.setText("E-Posta çok uzun!");
        }
        
        //Tarihi veritabanina islemek icin string yapip insertliyoruz.
        /*
        int tarih = Integer.parseInt(
                ((String)girdiYil.getSelectedItem()+
                        (String)girdiAy.getSelectedItem()+
                            (String)girdiGun.getSelectedItem())
        );
        */
        String tarih = (String)girdiGun.getSelectedItem()+"-"+
                (String)girdiAy.getSelectedItem()+"-"+
                    (String)girdiYil.getSelectedItem();
        
        try{
        if(isimUygun && sifreUygun && epostaUygun && zatenVar == false){
            Netflix.kullaniciKayit2 = new KullaniciKayit2(eposta,ad,sifre,tarih);
            Netflix.kullaniciKayit2.setLocationRelativeTo(null);
            Netflix.kullaniciKayit2.setVisible(true);
            this.dispose();

        
        }
        
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_butonKayitTamamlaActionPerformed

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

    private void maxminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxminMousePressed
        // TODO add your handling code here:

        setExtendedState(JFrame.ICONIFIED);

        /*
        if(maksimum == false){
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            maksimum = true;
        }else{
            //setState(JFrame.ICONIFIED);
            setExtendedState(JFrame.NORMAL);
            maksimum = false;
        }
        */
    }//GEN-LAST:event_maxminMousePressed

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMousePressed
    
    private static boolean mailKontrol(String eposta) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return eposta.matches(regex);
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
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonKayitTamamla;
    private javax.swing.JLabel close;
    private javax.swing.JTextField girdiAd;
    private javax.swing.JComboBox<String> girdiAy;
    private javax.swing.JTextField girdiEPosta;
    private javax.swing.JComboBox<String> girdiGun;
    private javax.swing.JPasswordField girdiSifre;
    private javax.swing.JComboBox<String> girdiYil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel maxmin;
    private javax.swing.JLabel titlebar;
    private javax.swing.JLabel uyariAd;
    private javax.swing.JLabel uyariEPosta;
    private javax.swing.JLabel uyariSifre;
    // End of variables declaration//GEN-END:variables
}
