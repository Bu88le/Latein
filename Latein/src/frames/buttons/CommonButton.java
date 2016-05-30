package frames.buttons;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;

public class CommonButton extends JButton {
	
	public CommonButton(String Text, int x, int y) {
		setBounds(x, y, 250, 30);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setText(Text);
		
	}
	
	public CommonButton(String Text, int x, int y, int sizex, int sizey) {
		setBounds(x, y, sizex, sizey);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setText(Text);
	}
	
	public CommonButton(String Text, int x, int y, int sizex, int sizey, Color backg, Color foreg) {
		setBounds(x,y,sizex,sizey);
		setBackground(backg);
		setForeground(foreg);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setText(Text);
	}
	
	public CommonButton(String Text, int Variation, int x, int y) {
		setBounds(x, y, 120, 30);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setText(Text);
		if (Variation == 0) {
			setBackground(Color.LIGHT_GRAY);
			setForeground(Color.BLUE);
		}
		if (Variation == 1) {
			setBackground(Color.RED);
			setForeground(Color.BLACK);
			setFont(new Font("Harrington Standard", Font.ITALIC, 15));
		}
		if (Variation < 0 || Variation > 1 ){
			new CommonButton(Text, x, y);
		}
	}
	
}
