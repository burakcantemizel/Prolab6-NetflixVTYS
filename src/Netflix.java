import com.bulenkov.darcula.DarculaLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicLookAndFeel;


public class Netflix {
    //GUI NESNELERI
    static KullaniciGirisi kullaniciGirisi = null;
    static KullaniciKayit kullaniciKayit = null;
    static KullaniciKayit2 kullaniciKayit2 = null;
    static AnaSayfa anaSayfa = null;
    static KayitSorusu kayitSorusu = null;
    static OneriSayfasi oneriSayfasi = null;
    static izlemeEkrani izlemeEkrani = null;
    
    
    static String mevcutKullanici = null;
    static String mevcutKullaniciAd = null;
    
    static File veritabaniDosya;
    
    public static void main(String[] args){
        
        veritabaniDosya = new File ("netflix.db");
        
        //BASLANGIC AYARLARI
        darculaTemasiniUygula();
        Veritabani.veritabaniBaglantisiYap();
 
 
        
        kullaniciGirisi = new KullaniciGirisi();
        kullaniciGirisi.setLocationRelativeTo(null);
        kullaniciGirisi.setVisible(true);
        
        /*
        anaSayfa = new AnaSayfa();
        anaSayfa.setLocationRelativeTo(null);
        anaSayfa.setVisible(true);
        */
            
        
    }
    
    //Karanlik Temayi Uygulayan Fonksiyon
    public static void darculaTemasiniUygula(){
        BasicLookAndFeel darcula = new DarculaLaf(); 
        try {
            UIManager.setLookAndFeel(darcula);
            
            
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Netflix.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
