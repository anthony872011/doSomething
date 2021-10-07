package doSomething;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JFrame implements ActionListener {

	static JPanel p; 
	static JLabel l;
	static JFrame frame;
	/*public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(131, 21, 1));//
		//g2d.fillRect(250, 195, 90, 60);//
		 g.fillOval(0,0,100,100);
	}*/
	public MyPanel() {
		 frame = new JFrame("Display a rectangle");
		 setLayout (null);
		 frame.setSize (500,700);
		 JButton b1 = new JButton("Load");
		// JButton b2 = new JButton ("Sort");
		 b1.setBounds(0,0, 10,10);
		 //b2.setBounds(10,60, 30,30);
		 b1.addActionListener(this);
		// b2.addActionListener(this);
		 frame.add(b1);
		 //add(b2);
		 
		 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,500);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
	}
	 public void actionPerformed (ActionEvent e) {
		 	makeShapes(null);
	 }
	 public void makeShapes(Graphics g) {
		 	super.paintComponent(g);
		 	Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(new Color(131, 21, 1));
			g2d.fillRect(250, 195, 90, 60);
	 }



}