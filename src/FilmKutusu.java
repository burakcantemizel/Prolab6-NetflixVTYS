
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;


public class FilmKutusu extends JLabel implements MouseListener{
    int genislik = 300;
    int yukseklik = 160;
    int posx;
    int posy;
    String isim;
    BufferedImage resim;
    boolean ustunde = false;
    
    public FilmKutusu(int posx, int posy, String isim){
        this.posx = posx;
        this.posy = posy;
        this.isim = isim;
        
        addMouseListener(this);
        
        try {
            if(isim != null){
                resim = ImageIO.read(new File("data/filmler/"+isim+".png"));
            }else{
                resim = ImageIO.read(new File("data/filmler/breakingbad.png"));
            }
        } catch (IOException ex) {
            Logger.getLogger(Arkaplan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setBounds(this.posx, this.posy, genislik, yukseklik);  
    }
    
    //Komponenti baştan tasarlıcaz
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        super.paintComponent(g);
        g.drawImage(resim, 0,0, null);
        //g2d.setColor(Color.black);
        //g.drawString(isim, 30,30);
        
        if(ustunde){
            g.setColor(new Color(255,0,0,120));
            g.fillRect(0, 0, 300, 160);
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Bu filme gittin: " + isim);
        
        Netflix.izlemeEkrani = new izlemeEkrani(isim);
        Netflix.izlemeEkrani.setLocationRelativeTo(null);
        Netflix.izlemeEkrani.setVisible(true);
        
        if(Netflix.anaSayfa != null){
            Netflix.anaSayfa.dispose();
        }
        if(Netflix.oneriSayfasi != null){
            Netflix.oneriSayfasi.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ustunde = true;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ustunde = false;
    }
    
    
    
}
