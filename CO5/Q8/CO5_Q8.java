import java.awt.*;  
import java.awt.event.*;  
/* <applet code="CO5_Q8.class" width=700 height=700></applet> */
public class CO5_Q8 extends Frame implements KeyListener
{  
    Label l;  
    TextArea area;  
    public CO5_Q8()
    {  
        l=new Label();  
        l.setBounds(20,50,200,40);  
        area=new TextArea();  
        area.setBounds(20,100,200,100);  
        area.addKeyListener(this);  
          
        add(l);
        add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) 
    {  
        l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) 
    {  
        l.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) 
    {  
        l.setText("Key Typed");  
    }  
    public static void main(String[] args) 
    {  
        new CO5_Q8();  
    }  
}  