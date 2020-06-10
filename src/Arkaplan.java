import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;


public class Arkaplan extends JLabel implements Runnable, MouseMotionListener{
    int ekrangenislik;
    int ekranyukseklik;
    int resimboyut = 256;
    BufferedImage resimArkaplan;
    Thread thread = new Thread(this);
    float xp = 0;
    float yp = 0;
    float hizx = -0.05f;
    float hizy = -0.05f;
    int mx;
    int my;
    
    public Arkaplan(int genislik, int yukseklik){
       
        
        try {
            this.ekrangenislik = genislik;
            this.ekranyukseklik = yukseklik;
        
        addMouseMotionListener(this);
            resimArkaplan = ImageIO.read(new File("data/arkaplanTile.jpg"));
            
             thread.start();
        } catch (IOException ex) {
            //Logger.getLogger(Arkaplan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    /*
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(resimArkaplan, 0,0, null);
    }
    */
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //burda çizim yapıcaz
        
        for(int i = -resimboyut; i <= ekrangenislik+resimboyut; i += 256){
            for(int j = -resimboyut; j <= ekranyukseklik+resimboyut; j += 256){
                g.drawImage(resimArkaplan, (int)(i + (xp)) , (int)(j+(yp)) ,null);
            }
        }
        
    }

    @Override
    public void run() {
        while(true){
                repaint();
                
               /*
                if(mx > ekrangenislik/2){
                    hizx = 0.5f;
                }else{
                    hizx = -0.5f;
                }
                
                if(my > ekranyukseklik/2){
                    hizy = 0.5f;
                }else{
                    hizy = -0.5f;
                }
                */
               
                xp = (xp + hizx)%resimboyut;
                yp = (yp + hizy)%resimboyut;
            try {
                thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        mx = e.getX();
        my = e.getY();
    }
    
    
}
