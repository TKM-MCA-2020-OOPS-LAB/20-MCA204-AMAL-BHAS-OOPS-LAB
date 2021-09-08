import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code = "CO5_Q6.class" width = "600" height = "600"></applet>*/

public class CO5_Q6 extends Applet implements ItemListener
{
    Choice c;
    int index;
    public void init()
    {
        
        c=new Choice();   
        c.addItem("Select one");
        c.addItem("Rectangle");
        c.addItem("Square");
        c.addItem("Circle");
        c.addItem("Triangle");
        add(c);
        c.addItemListener(this);
        
    }
    public void itemStateChanged (ItemEvent e)
    {

        index=c.getSelectedIndex();
        repaint();
    }
    public void paint(Graphics g)
    {
        switch(index)
        {
            case 1: g.drawRect(300,300,250,150);
                    break;
            case 2: g.drawRect(300,300,200,200);
                    break;
            case 3: g.drawOval(300,300,200,200);
                    break;
            case 4: g.drawLine(180,150,180,370);
                    g.drawLine(180,150,440,370);
                    g.drawLine(180,370,440,370);
                    
        }
    }
}
