package doSomething;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;

public class ShapeFactory extends JFrame implements ActionListener{
	private static final long serialVersionUID = -1811969284106827032L;
	public JButton b1;
    public JButton b2;
    public String check="";
	public shapes [] sList = new shapes [6];
    JFrame f;
    JPanel p; 
    public void paint(Graphics g){
    	int count = 50;
    	super.paintComponents(g);
    	Graphics2D g2d = (Graphics2D) g;
    	
    		if (check.equals("true")) {
    		for (int x = 0; x < 6;x++)
    		{
    			if (sList[x].getType().equals("r")|| sList[x].getType().equals("s"))
    			{
    				g2d.setColor(sList[x].getColor());
    	            g2d.fillRect(count, count, sList[x].getLength(), sList[x].getWidth());
    	            count = count + 70;
    			}
    			else if (sList[x].getType().equals("c"))
    			{
    				g2d.setColor(sList[x].getColor());
    				g2d.fillOval(count, count, sList[x].getRadius(), sList[x].getRadius());
    				count = count + 100;
    			}
    		}
    			//g2d.setColor(sList[2].getColor());
	            //g2d.fillRect(count, count, sList[2].getLength(), sList[2].getWidth());
	            
            //g2d.setColor(Color.red);
            //g2d.fillRect(count, count, 50, 50);
    	}
    	else if (check.equals("false")) {
            g2d.setColor(Color.green);
            g2d.fillRect(50, 70, 50, 50);
          g2d.setColor(Color.red);
          g2d.fillRect(count, count, 50, 50);
    	}
    	
    	
    }

    public void start(){
    	f = new JFrame();
    	p = new JPanel();
        b1=new JButton();
        b2=new JButton();
        
        b1.setPreferredSize(new Dimension(20,20));
        b1.setText("load"); 
        b1.setActionCommand("load");
        b1.addActionListener(this);
        b1.setBounds(100,100,100,100);
        f.add(p);
        f.add(b1);
        f.setSize(600,600);  
        f.setLayout(null);  
        f.setVisible(true);  
      
        b2.setPreferredSize(new Dimension(20,20));
        b2.setText("sort"); 
        b2.setActionCommand("sort");
        b2.addActionListener(this);
        b2.setBounds(300,100,100,100);
        f.add(p);
        f.add(b2);
        f.setSize(600,600);  
        f.setLayout(null);  
        f.setVisible(true);   
        setSize(600,600);
        setVisible(true);
        
    }    

    public void actionPerformed(ActionEvent e) {   
    	if(("load").equals(e.getActionCommand())) {
	    		check = "true";
	    		repaint();
    	}
    	else if (("sort").equals(e.getActionCommand())) {
    		check = "true";
    		BubbleSort b = new BubbleSort(sList);
    		sList = b.sort();
    		repaint();
    	}
        	repaint();
        
        	
    }
    public ShapeFactory() {
    	Random r = new Random ();
    	int rInt1 = r.nextInt(70);
    	int rInt2 = r.nextInt(70); 
    	sList[0] = new Rectangle(rInt1,rInt2,Color.blue);
    	rInt1 = r.nextInt(50)+ 20;//range from 20-70
    	sList[1] = new Square (rInt1,rInt1, Color.red);
    	rInt1 = r.nextInt(50)+ 20;;
    	sList[2] = new Circle (rInt1,rInt1, Color.green);
    	rInt1 = r.nextInt(50)+ 20;;
    	sList[3] = new Square (rInt1,rInt1, Color.cyan);
    	rInt1 = r.nextInt(50)+ 20;;
    	sList[4] = new Circle (rInt1,rInt1, Color.gray);
    	rInt1 = r.nextInt(50)+ 20;;
    	rInt2 = r.nextInt(50)+ 20;;
    	sList[5] = new Rectangle (rInt1,rInt2, Color.yellow);
    }
    public static void main(String args[]){
        ShapeFactory x=new ShapeFactory();
        x.start();
    }
}
