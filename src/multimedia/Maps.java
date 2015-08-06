package multimedia;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Maps extends JPanel {
       
        private BufferedImage img;
        private float scale = 1;

        public Maps(String mapName) {
            try {img = ImageIO.read(new File(mapName));} catch (Exception ex) {}
            addMouseWheelListener(new MouseAdapter() {
                @Override
                public void mouseWheelMoved(MouseWheelEvent e) {
                    double delta = 0.05f * e.getPreciseWheelRotation();
                    scale += delta;
                    revalidate();
                    repaint();
                }});
        }
        @Override
        public Dimension getPreferredSize() {            
            Dimension size = new Dimension(200, 200);
            if (img != null) {            
                size.width = Math.round(img.getWidth() * scale);
                size.height = Math.round(img.getHeight() * scale);                
            }        
            return size;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (img != null) {
                Graphics2D g2d = (Graphics2D) g.create();
                AffineTransform at = new AffineTransform();
                at.scale(scale, scale);
                g2d.drawImage(img, at, this);
                g2d.dispose();
            }
        }
    }

