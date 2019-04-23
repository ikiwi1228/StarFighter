package StarFighter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {

    private int speed;

    public Ammo() {
        this(0, 0, 0);
    }

    public Ammo(int x, int y) {
        super(x, y);
        speed = 5;
    }

    public Ammo(int x, int y, int s) {
        super(x, y);
        speed = s;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void draw(Graphics window) {
        //add code to draw the ammo
        window.setColor(Color.yellow);
        window.fillOval(super.getX(), super.getY(), 5, 5);
    }

    public void move(String direction) {
        //add code to draw the ammo
        if (direction.equals("DOWN")) {
            super.setY(super.getY() + getSpeed());
        }
        if (direction.equals("UP")) {
            super.setY(super.getY() - getSpeed());
        }
        if (direction.equals("LEFT")) {
            super.setX(super.getX() - getSpeed());
        }
        if (direction.equals("RIGHT")) {
            super.setX(super.getX() + getSpeed());
        }
    }

    public String toString() {
        return "";
    }
}
