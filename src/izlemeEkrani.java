
import java.awt.Toolkit;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import sun.text.resources.zh.JavaTimeSupplementary_zh_TW;


public class izlemeEkrani extends javax.swing.JFrame {
    //Arkaplan arkaplan;
    String kullaniciEPosta = Netflix.mevcutKullanici;
    String programAdi;
    String izlenmeTarihi;
    static String izlenmeSuresi = null;
    int kalinanBolum = 0;
    String puan = null;
    static String programUzunluk = null;
    
    String yaziprogrampuani = "Yok";
    
    int mpx = 0;
    int mpy = 0;
    
    boolean oynuyorMu = false;
    
    boolean guncellemehazir = false;
    
    Timer timer;
    
    /**
     * Creates new form izlemeEkrani
     */
    public izlemeEkrani(String programAdi) {
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        initComponents();
        
        /*
        arkaplan = new Arkaplan(this.getWidth(), this.getHeight());
        arkaplan.setBounds(0,0,this.getWidth(), this.getHeight());
        //add(arkaplan);
        this.add(arkaplan);
        */
        
        //Statik değişkenleri sıfırlıyoruz.
        guncellemehazir = false;
        izlenmeSuresi = null;
        programUzunluk = null;
        mevcutzaman.setText("Mevcut zaman: 00:00:00");
        
        this.programAdi = programAdi;
        
        if(izlendiMiKontrolu() == false){
            System.out.println(izlendiMiKontrolu());
            //Daha once izlemediysek yeni satir olusturcaz.
            yeniKullaniciProgramBilgisi();
            
        }
        
        timer = new Timer();
        
        
        //TODO stataic değişkenlerde taşma tehlikesi!! buraya tekrar bak
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                if(Netflix.izlemeEkrani != null){
                            if(oynuyorMu == false){
                                //film oynamıyorsa sayac ilerlemeyecek
                            }else{
                                //System.out.println("test1");
                                //System.out.println(Netflix.izlemeEkrani.programUzunluk);
                                //System.out.println(Netflix.izlemeEkrani.izlenmeSuresi);
                                
                                String psureler[] = Netflix.izlemeEkrani.programUzunluk.split(":");
                                long psurelong = Integer.parseInt(psureler[0])*60*60+
                                Integer.parseInt(psureler[1]) * 60 +
                                Integer.parseInt(psureler[2]);

                                
                                
                                String sureler[] = Netflix.izlemeEkrani.izlenmeSuresi.split(":");
                                long surelong = Integer.parseInt(sureler[0])*60*60+
                                Integer.parseInt(sureler[1]) * 60 +
                                Integer.parseInt(sureler[2]);

                                if(surelong < psurelong){   
                                    System.out.println("test2");
                                //Film oynatildaysa
                                surelong++;
                                long saat = surelong / 3600;
                                long dakika = (surelong % 3600) / 60;
                                long saniye = surelong % 60;

                                //String yeniSure = Long.toString(saat)+":"+Long.toString(dakika)+":"+Long.toString(saniye);
                                
                                String fsaat = String.format("%02d", saat );
                                String fdakika = String.format("%02d", dakika );
                                String fsaniye =  String.format("%02d", saniye );
                                System.out.println(fsaat + " " + fdakika + " " + fsaniye);

                                String fyeniSure = fsaat+":"+fdakika+":"+fsaniye;
                                
                                Netflix.izlemeEkrani.izlenmeSuresi = fyeniSure;


                                //System.out.println(Netflix.izlemeEkrani.izlenmeSuresi);
                                mevcutzaman.setText("Mevcut zaman: " + Netflix.izlemeEkrani.izlenmeSuresi);
                                }else if(surelong == psurelong){
                                    //PROGRAM SONU -- BURAYA DIKKAT
                                    
                                    
                                    if(  Integer.parseInt((String)bolumSecme.getSelectedItem()) <  bolumSecme.getItemCount()){
                                        Netflix.izlemeEkrani.izlenmeSuresi = "00:00:00";
                                        bolumSecme.setSelectedIndex( bolumSecme.getSelectedIndex() + 1);
                                        oynuyorMu = false;
                                    }
                                    
                                }

                            }
                }
                
            }
        }, 0, 1000);
        
        
        
        //Bu noktada kullanici arayuzu görebilecek o yüzedn arayüzün güncellenmesi gerek.
        //Değişkenlerde bu noktada güncellencek içerisinde.
        izlemeArayuzunuGuncelle();
        guncellemehazir = true;
        
        
        
        //ProgramAcildiğinda
        //Daha önce izlendi mi Kontrolü yapılacak?
        //izlenmediyse satir olusturulcak
        
        
        
        //Kullanici adi ve programAdi buraya zaten geliyor.

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        programBilgisi = new javax.swing.JLabel();
        kullaniciBilgi = new javax.swing.JLabel();
        programuzunlugu = new javax.swing.JLabel();
        baslatbutonu = new javax.swing.JButton();
        durdurbutonu = new javax.swing.JButton();
        mevcutzaman = new javax.swing.JLabel();
        geridonme = new javax.swing.JLabel();
        bolumSecme = new javax.swing.JComboBox<>();
        puanver = new javax.swing.JComboBox<>();
        puanyazi = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        maxmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        programpuani = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        programBilgisi.setForeground(new java.awt.Color(255, 255, 255));
        programBilgisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        programBilgisi.setText("Program Adı");

        kullaniciBilgi.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciBilgi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kullaniciBilgi.setText("kullaniciAdi");

        programuzunlugu.setForeground(new java.awt.Color(255, 255, 255));
        programuzunlugu.setText("Program uzunlugu");

        baslatbutonu.setForeground(new java.awt.Color(255, 255, 255));
        baslatbutonu.setText("Başlat");
        baslatbutonu.setOpaque(false);
        baslatbutonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                baslatbutonuMousePressed(evt);
            }
        });
        baslatbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslatbutonuActionPerformed(evt);
            }
        });

        durdurbutonu.setForeground(new java.awt.Color(255, 255, 255));
        durdurbutonu.setText("Durdur");
        durdurbutonu.setOpaque(false);
        durdurbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durdurbutonuActionPerformed(evt);
            }
        });

        mevcutzaman.setForeground(new java.awt.Color(255, 255, 255));
        mevcutzaman.setText("mevcut zaman");

        geridonme.setForeground(new java.awt.Color(255, 51, 51));
        geridonme.setText("Anasayfaya geri dön");
        geridonme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                geridonmeMousePressed(evt);
            }
        });

        bolumSecme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolumSecmeActionPerformed(evt);
            }
        });

        puanver.setForeground(new java.awt.Color(255, 255, 255));
        puanver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        puanver.setSelectedIndex(-1);
        puanver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puanverActionPerformed(evt);
            }
        });

        puanyazi.setForeground(new java.awt.Color(255, 255, 255));
        puanyazi.setText("Puan ver:");

        titlebar.setBackground(new java.awt.Color(255, 51, 51));
        titlebar.setOpaque(true);
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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bölüm:");

        programpuani.setForeground(new java.awt.Color(255, 255, 255));
        programpuani.setText("Programın Puanı:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(programBilgisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(geridonme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(programpuani, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(puanyazi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puanver, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baslatbutonu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(durdurbutonu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mevcutzaman)
                        .addGap(18, 18, 18)
                        .addComponent(programuzunlugu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bolumSecme, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titlebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxmin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(puanver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(puanyazi)
                        .addComponent(kullaniciBilgi)
                        .addComponent(programpuani))
                    .addComponent(geridonme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programBilgisi, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baslatbutonu)
                    .addComponent(durdurbutonu)
                    .addComponent(mevcutzaman)
                    .addComponent(bolumSecme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(programuzunlugu)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geridonmeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geridonmeMousePressed
        // TODO add your handling code here:
        //Anasayfaya geri donme islemi yapilacak.
        kullaniciProgramBilgiGuncelle(this.kullaniciEPosta, this.programAdi, this.izlenmeTarihi, this.izlenmeSuresi, this.kalinanBolum, this.puan);
        
        Netflix.anaSayfa = new AnaSayfa();
        Netflix.anaSayfa.setLocationRelativeTo(null);
        Netflix.anaSayfa.setVisible(true);
        oynuyorMu = false;
        
        this.dispose();
    }//GEN-LAST:event_geridonmeMousePressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        kullaniciProgramBilgiGuncelle(this.kullaniciEPosta, this.programAdi, this.izlenmeTarihi, this.izlenmeSuresi, this.kalinanBolum, this.puan);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        kullaniciProgramBilgiGuncelle(this.kullaniciEPosta, this.programAdi, this.izlenmeTarihi, this.izlenmeSuresi, this.kalinanBolum, this.puan);
    }//GEN-LAST:event_formWindowClosing

    private void puanverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puanverActionPerformed
        // TODO add your handling code here:
        if(puanver.getSelectedIndex() != -1){
            this.puan = (String)puanver.getSelectedItem();
            
            kullaniciProgramBilgiGuncelle(this.kullaniciEPosta, this.programAdi, this.izlenmeTarihi, this.izlenmeSuresi, this.kalinanBolum, this.puan);
        }
    }//GEN-LAST:event_puanverActionPerformed

    private void baslatbutonuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baslatbutonuMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_baslatbutonuMousePressed

    private void baslatbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslatbutonuActionPerformed
        // TODO add your handling code here:
        oynuyorMu = true;
    }//GEN-LAST:event_baslatbutonuActionPerformed

    private void durdurbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durdurbutonuActionPerformed
        // TODO add your handling code here:
        oynuyorMu = false;
    }//GEN-LAST:event_durdurbutonuActionPerformed

    private void bolumSecmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolumSecmeActionPerformed
        // TODO add your handling code here:
        
        if(this.kalinanBolum != 0){
            try{
                Netflix.izlemeEkrani.izlenmeSuresi = "00:00:00";
                mevcutzaman.setText("Mevcut zaman: "+ Netflix.izlemeEkrani.izlenmeSuresi);
                Netflix.izlemeEkrani.kalinanBolum =  Integer.parseInt( (String )bolumSecme.getSelectedItem()  );
                kullaniciProgramBilgiGuncelle(this.kullaniciEPosta, this.programAdi, this.izlenmeTarihi, this.izlenmeSuresi, this.kalinanBolum, this.puan);
                 
            }catch(Exception ex){

            }
        }
        
    }//GEN-LAST:event_bolumSecmeActionPerformed

    private void titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMousePressed
        // TODO add your handling code here:
        mpx = evt.getX();
        mpy = evt.getY();
    }//GEN-LAST:event_titlebarMousePressed

    private void titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseDragged
        // TODO add your handling code here:
        int px = evt.getXOnScreen();
        int py = evt.getYOnScreen();

        //this.setLocation(px - mpx, py - mpy);
    }//GEN-LAST:event_titlebarMouseDragged

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // TODO add your handling code here:
        kullaniciProgramBilgiGuncelle(this.kullaniciEPosta, this.programAdi, this.izlenmeTarihi, this.izlenmeSuresi, this.kalinanBolum, this.puan);
        //this.dispose();

        System.exit(0);
    }//GEN-LAST:event_closeMousePressed

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

    public boolean izlendiMiKontrolu(){
        boolean dahaonceizlendimi = false;
        
        try{
        //Programadi ve eposta ile satir donuyorsa ilk izleme olmustur donmuyorsa olmamistir.
        String sorgu = "SELECT ProgramAdi FROM kullaniciprogram WHERE ProgramAdi = \'"+ this.programAdi+ "\' and KullaniciEPosta = \'"+Netflix.mevcutKullanici+"\' ";
            Veritabani.stmt = (Statement)Veritabani.con.createStatement();
            Veritabani.rs = Veritabani.stmt.executeQuery(sorgu);
            
            while(Veritabani.rs.next()){
               dahaonceizlendimi = true;
            }
        }catch(Exception ex){
        
        }
        System.out.println("izleme kontrolü yapildi!");
        return dahaonceizlendimi;
        
    }
    
    public void yeniKullaniciProgramBilgisi(){
         //String hesapDurumuSorgu ="SELECT kullaniciEPosta FROM kullanici WHERE KullaniciEPosta = \'"+eposta+"\'"; 
         try{
             String sorgu = "INSERT INTO KullaniciProgram VALUES(?,?,?,?,?,?)";
             Veritabani.pstmt = Veritabani.con.prepareStatement(sorgu);
             Veritabani.pstmt.setString(1, Netflix.mevcutKullanici);
             Veritabani.pstmt.setString(2, this.programAdi);
             
             DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
             Date suankiTarih = new Date();
             String suankiTarihString = df.format(suankiTarih).toString();
             Veritabani.pstmt.setString(3, suankiTarihString);
             
             Veritabani.pstmt.setString(4, "00:00:00");
             
             //Kalinan bolum 1 den basliyor 0 olamaz
             Veritabani.pstmt.setInt(5, 1); 
             Veritabani.pstmt.setNull(6, java.sql.Types.NULL);

             Veritabani.pstmt.executeUpdate();
             System.out.println("İlk kez izleme veri girisleri yapildi!");
         }catch(Exception ex){
             System.out.println(ex);
         }           
    }
    
    public void izlemeArayuzunuGuncelle(){
            //Her zaman bir satir var
            kullaniciBilgi.setText(Netflix.mevcutKullaniciAd);
            programBilgisi.setText(programAdi);
            
            //Atamalar sorgular ile yapiliyor.
            String izlenmeSuresi = null;
            int kalinanBolum = 0;
            String puan = null;
            int bolumSayisi = 0;
            String programTipi = null;
            String programUzunluk = null;
            
        try{
            String sorgu = "SELECT IzlenmeSuresi,KalinanBolum,Puan FROM kullaniciprogram WHERE ProgramAdi = \'"+ this.programAdi+ "\' and KullaniciEPosta = \'"+Netflix.mevcutKullanici+"\' ";
            Veritabani.stmt = (Statement)Veritabani.con.createStatement();
            Veritabani.rs = Veritabani.stmt.executeQuery(sorgu);  
            while(Veritabani.rs.next()){
               izlenmeSuresi = Veritabani.rs.getString(1);
               kalinanBolum = Veritabani.rs.getInt(2);
               puan = Veritabani.rs.getString(3);              
            }
            
            //Bir sorgu ile bolum sayisini ve program uzunlugunu da alcaz.
            String sorgu2 = "SELECT BolumSayisi,ProgramTipi,ProgramUzunluk FROM program WHERE ProgramAdi = \'"+this.programAdi+"\'";
            Veritabani.stmt = (Statement)Veritabani.con.createStatement();
            Veritabani.rs = Veritabani.stmt.executeQuery(sorgu2);  
            while(Veritabani.rs.next()){
               bolumSayisi = Veritabani.rs.getInt(1);
               programTipi = Veritabani.rs.getString(2);
               programUzunluk = Veritabani.rs.getString(3);
            }
            
            System.out.println(bolumSayisi);
            for(int i = 0; i<bolumSayisi; i++){
                bolumSecme.addItem(Integer.toString(i+1));
            }
            
            mevcutzaman.setText("Mevcut zaman: "+izlenmeSuresi);
            bolumSecme.setSelectedIndex(kalinanBolum-1);
            programuzunlugu.setText("Program Uzunluğu: " + programUzunluk);

            if(puan == null){
                puanver.setSelectedIndex(-1);
            }else{      
                puanver.setSelectedIndex(Integer.parseInt(puan));
            }
            //String eposta
            //String programAdi;
            this.izlenmeTarihi = izlenmeTarihi;
            this.izlenmeSuresi = izlenmeSuresi;
            this.kalinanBolum = kalinanBolum;
            this.puan = puan;
            this.programUzunluk = programUzunluk;
            
        }catch(Exception ex){
        
        }
        
        yaziprogrampuani = programinPuaniniBul(programAdi);
        programpuani.setText("Programın puanı: " + yaziprogrampuani);
       
    }
    
    void kullaniciProgramBilgiGuncelle(String eposta,String programadi, String tarih, String sure, int bolum, String puan){
        //String tarih boş argüman
        if(guncellemehazir == true){
               try{
             String sorgu = "Update kullaniciprogram SET IzlenmeTarihi = ?, IzlenmeSuresi = ?, KalinanBolum = ?, Puan = ? WHERE ProgramAdi = ? and KullaniciEPosta = ?";
             Veritabani.pstmt = Veritabani.con.prepareStatement(sorgu);
             
             DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
             Date suankiTarih = new Date();
             String suankiTarihString = df.format(suankiTarih).toString();
             Veritabani.pstmt.setString(1, suankiTarihString);
             
             Veritabani.pstmt.setString(2, sure);
             Veritabani.pstmt.setInt(3, bolum);
             Veritabani.pstmt.setInt(4, Integer.parseInt(puan));
             
             Veritabani.pstmt.setString(5, programadi);
             Veritabani.pstmt.setString(6, eposta);
             
             System.out.println(suankiTarihString);
             System.out.println(sure);
             System.out.println(bolum);
             System.out.println(Integer.parseInt(puan));
             System.out.println(programAdi);
             System.out.println(eposta  );
             System.out.println("Guncellendi!!");
             Veritabani.pstmt.executeUpdate();
             //System.out.println("Guncellendi!!");
        }catch(Exception ex){
            System.out.println(ex);
        }
        }
        
        yaziprogrampuani = programinPuaniniBul(programAdi);
        programpuani.setText("Programın puanı: " + yaziprogrampuani);
 
        
    }
    
    String programinPuaniniBul(String programAdi){
        
        String puan = "Yok";
        try{
            String sorgu = "select AVG(Puan) from kullaniciprogram where ProgramAdi = \'"+programAdi+"\' GROUP BY ProgramAdi";
            Veritabani.stmt = (Statement)Veritabani.con.createStatement();
            Veritabani.rs = Veritabani.stmt.executeQuery(sorgu);
            while(Veritabani.rs.next()){
               //puan = Integer.toString(Veritabani.rs.getInt(1));
               puan = Veritabani.rs.getString(1);
               if(puan == null){
                   puan = "Yok";
               }
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        System.out.println("Hesap: "+puan);
        return puan;
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
            java.util.logging.Logger.getLogger(izlemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(izlemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(izlemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(izlemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new izlemeEkrani(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baslatbutonu;
    private static javax.swing.JComboBox<String> bolumSecme;
    private javax.swing.JLabel close;
    private javax.swing.JButton durdurbutonu;
    private javax.swing.JLabel geridonme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kullaniciBilgi;
    private javax.swing.JLabel maxmin;
    private static javax.swing.JLabel mevcutzaman;
    private javax.swing.JLabel programBilgisi;
    private javax.swing.JLabel programpuani;
    private javax.swing.JLabel programuzunlugu;
    private javax.swing.JComboBox<String> puanver;
    private javax.swing.JLabel puanyazi;
    private javax.swing.JLabel titlebar;
    // End of variables declaration//GEN-END:variables
}
