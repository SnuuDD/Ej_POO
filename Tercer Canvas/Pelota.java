import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class Pelota{
        Random e=new Random();
        Color col=new Color(e.nextInt(255),e.nextInt(255),e.nextInt(255));
        private int x;
        private int y ;
        private int r;
        
        public Pelota() {
            this.x=200;
            this.y=200;
            this.r=100;
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
            g.fillOval(this.x, this.y, this.r, this.r);
            //g.drawOval(this.x, this.y, this.size, this.size);
        }
    

}