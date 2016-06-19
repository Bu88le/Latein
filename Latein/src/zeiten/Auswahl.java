package zeiten;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import latein.Main;
import vokabeln.a;
import vokabeln.e;
import wörter.akonjugation;
import wörter.ekonjugation;

public class Auswahl {
	
	private static String gv;
	private static int zähler = 0;
	public static ArrayList<Point> pointArray = new ArrayList<Point>();
	public static boolean akon, ekon, ekon2, kosnkon, ikon;
	
	public static void überprüfung(String gvs) {
		zähler = 0;
		a.verbenAkon();
		akonjugation:
		for (int i = 0; i < a.getVerbenAkon().length; i++) {
			for (int z = 0; z < a.getVerbenAkon()[i].length; z++) {
				if (gvs.equals(a.getVerbenAkon()[i][z])) {
					zähler++;
					pointArray.add(new Point(i,z));
					akon = true;
				}
				if (akon && zähler > 0 && gvs.equals(a.getVerbenAkon()[i][z])) {
					auswertung(i, z, gvs);
					break akonjugation;
				}
				if (i == a.getVerbenAkon().length-1 && z == a.getVerbenAkon()[i].length-1 && akon == false) {
					überprüfung2(gvs);
				}
			}
		}
	}
	
	private static void überprüfung2(String gvs) {
		e.verbenEkon();
		ekonjugation:
		for (int i = 0; i < e.getVerbenEkon().length; i++) {
			for (int z = 0; z < e.getVerbenEkon()[i].length; z++) {
				if (gvs.equals(e.getVerbenEkon()[i][z])) {
					zähler++;
					pointArray.add(new Point(i,z));
					ekon = true;
				}
				if (ekon && zähler > 0 && gvs.equals(e.getVerbenEkon()[i][z])) {
					auswertung(i, z, gvs);
					break ekonjugation;
				}
			}
		}
		ekonjugation2:
		for (int i = 0; i < e.getVerbenEkonRest().length; i++){
			for (int z = 0; z < e.getVerbenEkonRest()[i].length; z++) {
				if (gvs.equals(e.getVerbenEkonRest()[i][z])) {
					zähler++;
					pointArray.add(new Point(i,z));
					ekon2 = true;
				}
				if (ekon2 && zähler > 0 && gvs.equals(e.getVerbenEkonRest()[i][z])) {
					System.out.println("hi");
					auswertung(i,z,gvs);
				}
			}
		}
	}
	
	
	private static void auswertung(int i, int z, String s) {
		if (ekon && zähler == 1) {
			gv = e.getVerbenEkon()[i][z] + "eo";
			new ekonjugation(gv, s);
		}else if (ekon2 && zähler == 1) {
			gv = e.rverbenespn()[z] + "eo";
			new ekonjugation(gv, s);
		}else if (akon && zähler == 1) {
			gv = a.getVerbenAkon()[i][z] + "o";
			new akonjugation(gv, s);
		}
		
		if (zähler > 1) {
			StringBuffer sb = new StringBuffer();
			if (ekon) {				
				for (int a = 0; a < pointArray.size(); a++) {
					gv = e.getVerbenEkon()[(int) pointArray.get(a).getX()][(int) pointArray.get(a).getY()] + "eo";
					sb.append("<html>" + gv);
					sb.append("<p/");
				}
				Main.mf.panelMehrereWörter(sb.append("<html/>"));
			}else if (ekon2) {
				for (int a = 0; a < pointArray.size(); a++) {
					gv = e.rverbenespn()[(int) pointArray.get(a).getY()] + "eo";
					sb.append("<html>" + gv);
					sb.append("<p/");
				}
				Main.mf.panelMehrereWörter(sb.append("<html/>"));
			}else if (akon) {
				for (int a = 0; a < pointArray.size(); a++) {
					gv = vokabeln.a.getVerbenAkon()[(int) pointArray.get(a).getX()][(int) pointArray.get(a).getY()] + "o";
					sb.append("<html>" + gv);
					sb.append("<p/");
				}
				Main.mf.panelMehrereWörter(sb.append("<html/>"));
			}
			
		}
	}
	

}
