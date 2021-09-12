import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;

/*<applet code = "CO5_Q4.class" width = "600" height = "600"></applet>*/

public class CO5_Q4 extends Applet implements MouseListener
{
int a,b;
public void init()
{
addMouseListener(this);
}
public void paint(Graphics g){ 
      g.drawRect(10,50,50,100); //house
      g.setColor(Color.green);
      g.fillRect(10,50,50,100);
      g.drawRect(25,100,20,50); //door
      g.setColor(Color.blue);
      g.fillRect(25,100,20,50);
      g.drawArc(10,30,50,40,0,180);
      g.setColor(Color.red);
      g.fillArc(10,30,50,40,0,180);
    
if(a>25 && a<100 && b>25 && b<100)
        {
            g.setColor(Color.yellow);
            g.fillRect(25,100,20,50);
        }
    }
    public void mouseClicked(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){

    }
    public void mouseExited(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e){

        a=e.getX();
        b=e.getY();
        repaint();
    }
    public void mouseReleased(MouseEvent e){

    }
 }
