package �bersetzung;
import frames.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class uea {
	
	static String gv;
	static int z�hler;
	
	public uea(String s) {
		gv = s;
		auswahl();
	}
	
	static String[] a = {"laudo", "laudare", "loben", "preisen", "anpreisen", "guthei�en", "r�hmen"};
	static String[] b = {"pecco", "peccare", "s�ndigen", "(etwas) verkehrt machen", "einen Fehler machen", "schuldig machen"};
	static String[] c = {"laboro", "laborare", "arbeiten", "leiden", "abm�hen", "sich anstrengen", "sich m�hen"};
	static String[] d = {"amo", "amare", "lieben, ", "m�gen"};
	static String[] e = {"abalieno", "abalienare", "ver�u�ern", "abtreten", "berauben (aliquem re j-n einer Sache)", "aliquem iure civium ~: jm. das B�rgerrecht wegnehmen", "abtr�nnig machen", "entfremden (aliquem ab aliquo{alicui j-n jdm)"};
	static String[] f = {"abdico", "abdicare", "lossagen (se tutela: sich von der Unterhaltungspflicht)", "versto�en", "abschaffen", "filium ~: seinen Sohn versto�en", "niederlegen", "aufgeben", "~ munus / se a munere: ein Amt niederlegen / abdanken"};
	static String[] g = {"abequito", "abequitare", "wegreiten"};
	static String[] h = {"aberro", "aberrare", "sich verirren", "abkommen", "~ re / a re: vin etw. abkommen", "abweichen/abschweifen ( a regula: von der Regel, a sententia: von seiner Meinung)", "sich irren ( re: in einer Sache)(coniectura: in seiner Vermutung)", "zerstreut sein"};
	static String[] i = {"abiudico", "abiudicare", "richterlich aberkennen", "absprechen (aliquid ab aliquo/alicui"};
	static String[] j = {"abiuro", "abiurare", "abschw�ren", "verleugnen"};
	static String[] k = {"ablego", "ablegare", "wegschicken", "entfernen", "abkommandieren"}; 
	
	
	public static String[][] zg = {a, b, c, d, e, f, g, h, i, j, k};
	
	public static void auswahl() {
		for (int i = 0; i<zg.length; i++) {
		 if (zg[i][0].equals(gv)) {
			
			System.out.println("jei");
			ausgabe(i);
			break;
		 }
		 
		 
		}
	}
	
	public static void ausgabe(int z) {
		StringBuffer s = new StringBuffer();
		s.append(zg[z][1]);
		s.append(" : ");
		s.append("\n");
		s.append("\n");
		
		for (int i = 2; i < zg[z].length; i++) {
			s.append(zg[z][i]);
			s.append("\n");
		}
		
		JOptionPane.showMessageDialog(null, s, framemain.tfield1.getText(), JOptionPane.INFORMATION_MESSAGE);
	}

	

}
