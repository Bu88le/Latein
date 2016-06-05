package frames;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

import übersetzung.zusammenfassung;


public class frameadmin extends JFrame implements ItemListener, ActionListener, ComponentListener{
	
	static JFrame frame1;
	static JRadioButton rbutton1;
	static JButton button1, button2, button3, button4, button5, button6, button7;
	public static int Y_Buttons = 20;
	int höhe;
	
	public frameadmin() {
		super("ADMIN ACCESS");
		setSize(450, 400);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		addComponentListener(this);
		setResizable(true);
		
		/*frame1 = new JFrame("ADMIN ACCESS");
		frame1.setSize(450, 400);
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);
		frame1.addComponentListener(this);*/
		
		frame();
	}
	
	public void frame() {

		
		rbutton1 = new JRadioButton("Resizable", false);
		rbutton1.setBounds(0,Y_Buttons-20,150,15);
		rbutton1.setVisible(true);
		rbutton1.addItemListener(this);
		super.add(rbutton1);
		
		button1 = new JButton("Vokabel suchen");
		button1.setBounds(125,Y_Buttons,200,30);
		button1.setBackground(Color.lightGray);
		button1.setForeground(Color.BLUE);
		button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button1.addActionListener(this);
		super.add(button1);
		
		button2 = new JButton("Versuch");
		button2.setBounds(280, Y_Buttons+40, 150, 30);
		button2.setBackground(Color.lightGray);
		button2.setForeground(Color.BLUE);
		button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button2.addActionListener(this);
		super.add(button2);
		
		button3 = new JButton("Button 3");
		button3.setBounds(280, Y_Buttons+80, 150, 30);
		button3.setBackground(Color.lightGray);
		button3.setForeground(Color.BLUE);
		button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button3.addActionListener(this);
		super.add(button3);
		
		
		button4 = new JButton("Button 4");
		button4.setBounds(125, Y_Buttons+120, 200, 30);
		button4.setBackground(Color.lightGray);
		button4.setForeground(Color.BLUE);
		button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button4.addActionListener(this);
		super.add(button4);
		
		button5 = new JButton("Button 5");
		button5.setBounds(10, Y_Buttons+80, 150, 30);
		button5.setBackground(Color.lightGray);
		button5.setForeground(Color.BLUE);
		button5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button5.addActionListener(this);
		super.add(button5);
		
		button6 = new JButton("Button 6");
		button6.setBounds(10, Y_Buttons+40, 150, 30);
		button6.setBackground(Color.lightGray);
		button6.setForeground(Color.BLUE);
		button6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button6.addActionListener(this);
		super.add(button6);
		
		
		
		super.setVisible(true);
	}
	
	public void resetY(int i) {
		Y_Buttons += i;
		button1.updateUI();
	}

	public void itemStateChanged(ItemEvent arg0) {
		if (rbutton1.isSelected() == true) {
			super.setResizable(true);
		}else if (rbutton1.isSelected() == false) {
			super.setResizable(false);
		}	
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == frameadmin.button1) {
			frame1.dispose();
			new framemain();
		}else if (ae.getSource() == frameadmin.button2) {
			zusammenfassung.returnallevocs();
		}
		
	}
	
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void componentResized(ComponentEvent arg0) {
		int height;
		int width;
		if (super.getHeight() > höhe) {
				height = 400 - super.getHeight();
				höhe = height;
				resetY(height);
		}else if (super.getHeight() < höhe) {
				height = super.getHeight() - 400;
				höhe = height;
				resetY(height);
		}else if (super.getHeight() == 273 ) {
				super.setResizable(false);
				rbutton1.setSelected(false);
				Point d = super.getLocation();
				super.setLocation((int)d.getX(), (int) (d.getY()-5));
		}
		
		/*if (super.getWidth() != 450) {
			if (frame1.getWidth() == 1936) {
				System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getWidth());
				button1.setBounds((int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth())/2)-100, (int)button1.getLocation().getY(), button1.getWidth(), button1.getHeight());
				button2.setBounds((int) (((Toolkit.getDefaultToolkit().getScreenSize().getWidth())/2)+80), (int)button2.getLocation().getY(), button1.getWidth(), button1.getHeight());
				button3.setBounds((int) (((Toolkit.getDefaultToolkit().getScreenSize().getWidth())/2+80)), (int)button3.getLocation().getY(), button1.getWidth(), button1.getHeight());
				button4.setBounds((int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth())/2)-100, (int)button4.getLocation().getY(), button1.getWidth(), button1.getHeight());
				button5.setBounds((int) (button1.getLocation().getX()-115), (int)button5.getLocation().getY(), button1.getWidth(), button1.getHeight());
				button6.setBounds((int) (button1.getLocation().getX()-115), (int)button6.getLocation().getY(), button1.getWidth(), button1.getHeight());
				
			}else if (frame1.getWidth() > 450) {
				width = frame1.getWidth() - 450;
				System.out.println(width);
				button1.setBounds(125+(width), (int)button1.getLocation().getY(), button1.getWidth(), button1.getHeight());
				button2.setBounds(280+(width), (int)button2.getLocation().getY(), button2.getWidth(), button2.getHeight());
				button3.setBounds(280+(width), (int)button3.getLocation().getY(), button3.getWidth(), button3.getHeight());
				button4.setBounds(125+(width), (int)button4.getLocation().getY(), button4.getWidth(), button4.getHeight());
				button5.setBounds(10+(width), (int)button5.getLocation().getY(), button5.getWidth(), button5.getHeight());
				button6.setBounds(10+(width), (int)button6.getLocation().getY(), button6.getWidth(), button6.getHeight());
			}else if (frame1.getWidth() < 450) {
				width = frame1.getWidth() - 400;
				button1.setBounds(125-(width), (int)button1.getLocation().getY(), button1.getWidth(), button1.getHeight());
				button2.setBounds(280-(width), (int)button2.getLocation().getY(), button2.getWidth(), button2.getHeight());
				button3.setBounds(280-(width), (int)button3.getLocation().getY(), button3.getWidth(), button3.getHeight());
				button4.setBounds(125-(width), (int)button4.getLocation().getY(), button4.getWidth(), button4.getHeight());
				button5.setBounds(10-(width), (int)button5.getLocation().getY(), button5.getWidth(), button5.getHeight());
				button6.setBounds(10-(width), (int)button6.getLocation().getY(), button6.getWidth(), button6.getHeight());
				Point d = frame1.getLocation();
				if (frame1.getWidth() == 449 || frame1.getHeight() < 449) {
					
					frame1.setResizable(false);
					rbutton1.setSelected(false);
					  Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					  robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					  robot.mouseMove((int) ((d.getX())+((frame1.getWidth()/2))), (int) ((d.getY())+(frame1.getHeight()/2)));
					  frame1.setBounds((int)(d.getX()), (int)d.getY(), 452, frame1.getHeight());
				}
				

			}
		}*/
	}

	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void setVisible() {
		rbutton1.setVisible(false);
		button1.setVisible(false);
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
		button5.setVisible(false);
		button6.setVisible(false);
	}

}