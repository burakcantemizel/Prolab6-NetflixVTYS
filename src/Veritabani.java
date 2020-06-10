import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Veritabani {
    //DIKKAT
    //Veritabani direkt programin alt dizininde netflix.db ismiyle bulunmali.
    //HATA KONTROLU BAGLANIRKEN YAPILIYOR
    static String url = "jdbc:sqlite:netflix.db";  
    
    //Sorgu nesneleri
    static Connection con = null;
    static Statement stmt = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    
    //VERITABANI BAGLANTISI
    static void veritabaniBaglantisiYap(){  
        
        if(Netflix.veritabaniDosya.exists() && Netflix.veritabaniDosya.isFile()){
            //VERITABANI BULUNDUYSA BAGLANILACAK
            System.out.println("Veritabani bulundu!"); 
            try {
            con = DriverManager.getConnection(url);
            System.out.println("Veritabanina baglanildi!");
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            System.out.println("HATA - Veritabani bulunanamadi!");
            System.exit(1);
            //System.out.println("asdasfsa");
            //TODO
            //PROGRAM HATA VERECEK VE SONLANACAK
            //BUNA OZEL BIT DIYALOG PENCERESI YAPILACAK
            
        }
           
    }
    
}
