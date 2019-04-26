package StarFighter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {

    private List<Alien> aliens;
    private boolean movement;
    public AlienHorde(int size) {
        aliens = new ArrayList<Alien>();
        int x=0;
        int y=0;
        for (int j=0; j<3;j++){
            x=0;
            for(int i=0; i<size; i++){
                aliens.add(new Alien(30+x,30+y,30,30,1));
                x+=70;
            }
            y+=70;
        }
    }

    public void add(Alien al) {
        aliens.add(al);
    }

    public void drawEmAll(Graphics window) {
        for(Alien i:aliens){
            i.draw(window);
        }
    }

    public void moveEmAll() {
        for(Alien i:aliens){
            if(i.getX()>760){
                movement=true;
                for (Alien x:aliens){
                    x.setY(x.getY()+1);
                }
                //i.setY(i.getY()+50);
            }
            else if(i.getX()<0){
                movement=false;
                for (Alien x:aliens){
                    x.setY(x.getY()+1);
                }
                //i.setY(i.getY()+50);
            }

            if(movement==true){
                i.move("LEFT");
            }
            else if(movement==false){
                i.move("RIGHT");
            }
            
            

        }
    }

    public void removeDeadOnes(List<Ammo> shots) {
        
        for (Ammo i: shots){
            for (Alien x: aliens){
                if(i.getY()>=x.getY() && i.getY()<=x.getY()+x.getHeight() && i.getX()>=x.getX() && i.getX()<=x.getX()+x.getWidth()){
                    aliens.remove(x);
                    i.setY(0);
                    i.setX(0);
                    break;
                }
               
            }
        }
        
    }

    public String toString() {
        return "";
    }
}
