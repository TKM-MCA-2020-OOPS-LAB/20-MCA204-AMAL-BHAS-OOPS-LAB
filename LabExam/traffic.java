package labexam;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
/*<applet code="traffic.class" width="500" height="700" ></applet> */

public class traffic extends Applet implements ItemListener
{
	TextField t=new TextField(10);
	String str;
	Choice ch=new Choice();
	public void init()
	{
		ch.add("Red");
		ch.add("Yellow");
		ch.add("Green");
		add(ch);
		add(t);
		ch.addItemListener(this);	
	}
	public void itemStateChanged(ItemEvent e) 
	{
	   str=ch.getSelectedItem();
	   if(str=="Green"){
	   ArrayList obj=new ArrayList();
	   obj.add(2);
	   obj.add(4);
	   obj.add(6);
	   obj.add(8);
	   obj.add(10);
	   t.setText(String.valueOf(obj));
	   }
	   if(str=="Yellow"){
		   ArrayList obj=new ArrayList();
		   obj.add(1);
		   obj.add(3);
		   obj.add(5);
		   obj.add(7);
		   obj.add(9);
		   t.setText(String.valueOf(obj));
		   }
	   if(str=="Red"){
		   ArrayList obj=new ArrayList();
		   obj.add(1);
		   obj.add(2);
		   obj.add(3);
		   obj.add(4);
		   obj.add(5);
		   t.setText(String.valueOf(obj));
		   }
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(400,200,350,100);
		g.setColor(Color.red);
		g.fillOval(450,220,50,50);
		g.setColor(Color.yellow);
		g.fillOval(550,220,50,50);
		g.setColor(Color.green);
		g.fillOval(650,220,50,50);
		
	}


}
