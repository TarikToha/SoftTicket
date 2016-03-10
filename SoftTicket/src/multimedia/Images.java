package multimedia;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Images {
    private final String address = "ReSource\\MultiMedia\\Images\\";
   

    public File getTicket() {
        return new File(address + "Others\\ticket.jpg");
    }
    
    
    public ImageIcon getLogo() {
        return new ImageIcon(address + "Others\\logo.jpg");
    }
    

    public Image getIcon() {
        return new ImageIcon(address + "Others\\icon.png").getImage();
    }
        
    
    public SlideShow getSlideShow() { 
        return new SlideShow();
    }

    public Image getBdImage() {
        return new ImageIcon(address + "Others\\bd.jpg").getImage();
    }

    public ImageIcon getHomeMap() {
        return new ImageIcon(address + "Others\\homeMap.jpg");
    }

    public Maps getNormalMap() {
        return new Maps(address + "Maps\\normalMap.jpg");
    }
    
    public Maps getLargeMap() {
        return new Maps(address + "Maps\\largeMap.jpg");
    }
    
    public Maps getTransportMap() {
        return new Maps(address + "Maps\\transportMap.jpg");
    }
    
    public Maps getRailMap() {
        return new Maps(address + "Maps\\railMap.jpg");
    }

    public Image getFlag() {
        return new ImageIcon(address+ "Others\\bd.jpg").getImage();
    }
      
    
    
    
    public class SlideShow{
        private final PicChooser picture;
        private final String[] icons = new String[23]; 
        private int counter = 0;
        
        public SlideShow() {
            for (int index=0;index<icons.length;index++){
                icons[index] = address + "SlideShow\\p"+(index+1)+".jpg";
            }
            picture = new PicChooser();
        }

    public PicChooser getPicture() {
        return picture;
    }
        

        class PicChooser extends JPanel implements ActionListener{
            private float alpha = 0f, increment = .01f;
            private final Image[] myImage = new Image[icons.length]; 
            private final Timer evenTimer, oddTimer;
            private int evenIndex = 0, oddIndex = 1;
            
            public PicChooser() {
                 for (int i=0;i<icons.length;i++){
                    myImage[i] = new ImageIcon(icons[i]).getImage();
                 }
                 evenTimer = new Timer(1, this);
                 oddTimer = new Timer(1, this);
                 evenTimer.start();
                 oddTimer.start();
            }
            public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
                if (evenTimer.isRunning()&& oddTimer.isRunning())
                    g2d.drawImage(myImage[evenIndex], 0, 0, null);
                if (!evenTimer.isRunning() && oddTimer.isRunning())
                    g2d.drawImage(myImage[oddIndex], 0, 0, null);            
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if(alpha>=0.98f && alpha<=1f){
                    evenTimer.setDelay(2000);
                    oddTimer.setDelay(2000);
                }
                else{
                    evenTimer.setDelay(1);
                    oddTimer.setDelay(1);
                }
                alpha += increment;
                if (alpha <= 0f) {  
                  alpha = 0f;
                  increment = -increment;  
                }  
                if (alpha >= 1f) {  
                  alpha = 1f;
                  increment = -increment;  
                } 
                repaint();

                if (evenTimer.isRunning()||oddTimer.isRunning())
                      counter++;
                
                if (counter == 200)
                    evenTimer.stop();
                else if (counter==400){
                    oddTimer.stop();
                    counter=0;
                    
                    if(oddIndex<=(icons.length-3) && evenIndex<=(icons.length-2)){
                        evenIndex += 2;
                        oddIndex += 2;
                    }
                    else{
                        evenIndex = 0;
                        oddIndex = 1;
                    }
                    
                    evenTimer.start();
                    oddTimer.start();
                }
            }
            
        }
    }
}
    
