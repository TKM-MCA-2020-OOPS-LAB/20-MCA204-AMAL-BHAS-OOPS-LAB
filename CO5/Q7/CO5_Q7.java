import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="CO5_Q7" width=300 height=300></applet>*/
public class CO5_Q7 extends Applet implements MouseListener
{

String msg="";
public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
msg="Mouse Clicked";
repaint();
}
public void mousePressed(MouseEvent me)
{
msg="Mouse Pressed";
repaint();
}
public void mouseReleased(MouseEvent me)
{
msg="Mouse Released";
repaint();
}
public void mouseEntered(MouseEvent me)
{
msg="Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
msg="Mouse Exited";
repaint();
}
public void paint(Graphics g)
{
g.drawString(" Mouse Handling Events",30,20);
g.drawString(msg,90,60);
}
}