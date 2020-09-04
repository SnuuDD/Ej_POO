import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class Bala{
       // Random e=new Random();
        private  Color col=new Color(0,0,0);
        private int x;
        private int y ;
        private static int r=20;
        
        public Bala() {
            x=300;
            y=100;
        }
        public Bala(int x, int y) {
            this.x=x;
            this.y=y;
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
    
       /* public void setR(int r) {
            this.r = r;
        }*/
    
        public Color getCol() {
            return col;
        }
    
        public void setCol(Color col) {
            this.col = col;
        }
        public void paint (Graphics g) 
        {
            g.setColor(col);
            g.fillRect(x,y,r,r/2);
            //g.drawOval(this.x, this.y, this.size, this.size);
        }
        /*public void disparada() {
            if(this.getX()<550){
                for(int i=this.getX();i<=550;i+=10){
                    this.setX(i);
                }
            }
        }*/
    

}