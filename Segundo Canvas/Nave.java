import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class Nave{
        Random e=new Random();
        Color col=new Color(e.nextInt(255),e.nextInt(255),e.nextInt(255));
        private int x;
        private int y ;
        private int r;
        
        public Nave() {
            this.x=50;
            this.y=50;
            this.r=50;
            this.col=col;
        }
    
        public int getX() {
            return x;
        }
    
        public void setX(int x) {
            this.x = x;
        }
    
        public int getY() {
            return y;
        }
    
        public void setY(int y) {
            this.y = y;
        }
    
        public int getR() {
            return r;
        }
    
        public void setR(int r) {
            this.r = r;
        }
    
        public Color getCol() {
            return col;
        }
    
        public void setCol(Color col) {
            this.col = col;
        }
        public void paint (Graphics g) 
        {
            g.setColor(col);
            g.fillRect(x,y,r,r);
            Color red=new Color(255,0,0);
            g.setColor(red);
            int xdel[] = {x+r, x+r, (x+2*r)};
            int ydel[] = {y,y+r,y+r/2};
            int ndel = 3;
            g.fillPolygon(xdel, ydel, ndel);
            int xi[] = {x, x+r/2, x};
            int yi[] = {y,y,y-r/2};
            int ni = 3;
            g.fillPolygon(xi, yi, ni);
            int xd[] = {x, x+r/2, x};
            int yd[] = {y+r,y+r,y+3*r/2};
            int nd = 3;
            g.fillPolygon(xd, yd, nd);
            

            //g.drawOval(this.x, this.y, this.size, this.size);
        }
    

}