package formatives;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


@SuppressWarnings("serial")
public class TrafficLight extends Canvas implements ActionListener {
	
	static JRadioButton redB;
	static JRadioButton greenB;
	static JRadioButton yellowB;
	boolean red = false;
	boolean yellow = false;
	boolean green = false;
	
	public void paint(Graphics g) {
		if (red) {
			// Draw skeleton of traffic light
			g.setColor(Color.BLACK);
			g.drawRect(150, 40, 100, 200);
			g.setColor(Color.YELLOW);
			g.fillRect(151, 41, 99, 199);
			g.setColor(Color.RED);
			g.fillOval(185, 60, 30, 30);
			g.setColor(Color.WHITE);
			g.fillOval(185, 110, 30, 30);
			g.fillOval(185, 160, 30, 30);
		} else if (green) {
			// Draw skeleton of traffic light
			g.setColor(Color.BLACK);
			g.drawRect(150, 40, 100, 200);
			g.setColor(Color.YELLOW);
			g.fillRect(151, 41, 99, 199);
			g.setColor(Color.WHITE);
			g.fillOval(185, 60, 30, 30);
			g.fillOval(185, 110, 30, 30);
			g.setColor(Color.GREEN);
			g.fillOval(185, 160, 30, 30);
		} else if (yellow) {
			// Draw skeleton of traffic light
			g.setColor(Color.BLACK);
			g.drawRect(150, 40, 100, 200);
			g.setColor(Color.YELLOW);
			g.fillRect(151, 41, 99, 199);
			g.setColor(Color.WHITE);
			g.fillOval(185, 60, 30, 30);
			g.setColor(Color.ORANGE);
			g.fillOval(185, 110, 30, 30);
			g.setColor(Color.WHITE);
			g.fillOval(185, 160, 30, 30);
		} else {
			// Draw skeleton of traffic light
			g.setColor(Color.BLACK);
			g.drawRect(150, 40, 100, 200);
			g.setColor(Color.YELLOW);
			g.fillRect(151, 41, 99, 199);
			g.setColor(Color.WHITE);
			g.fillOval(185, 60, 30, 30);
			g.fillOval(185, 110, 30, 30);
			g.fillOval(185, 160, 30, 30);
		}
		
	}

	public static void main(String[] args) {
		
		TrafficLight tl = new TrafficLight();
		JFrame f = new JFrame("Traffic Light");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		
		p.setLayout(new FlowLayout());
		p.setBounds(150, 255, 100, 100);
		redB = new JRadioButton("Red");
		redB.setBounds(170, 40, 100, 30);
		greenB = new JRadioButton("Green");
		redB.setBounds(170, 60, 100, 30);
		yellowB = new JRadioButton("Yellow");
		redB.setBounds(200, 60, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(redB); bg.add(greenB); bg.add(yellowB);
		p.add(redB);
		p.add(greenB);
		p.add(yellowB);
		
		redB.addActionListener(tl);
		yellowB.addActionListener(tl);
		greenB.addActionListener(tl);
		
		f.add(p);
		f.add(tl);
		f.setSize(400, 400);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (redB.isSelected()) {
			red = true;
			green = false;
			yellow = false;
			repaint();
		} else if (greenB.isSelected()) {
			green = true;
			yellow = false;
			red = false;
			repaint();
		} else if (yellowB.isSelected()) {
			yellow = true;
			green = false;
			red = false;
			repaint();
		}
	}

}
