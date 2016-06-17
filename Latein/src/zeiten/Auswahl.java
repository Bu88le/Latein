package zeiten;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import vokabeln.a;
import vokabeln.e;
import w�rter.akonjugation;
import w�rter.ekonjugation;

public class Auswahl {
	
	private static String gv;
	private static int z�hler = 0;
	private static ArrayList<Point> pointArray = new ArrayList<Point>();
	public static boolean akon, ekon, ekon2, kosnkon, ikon;
	
	public static void �berpr�fung(String gvs) {
		z�hler = 0;
		a.verbenAkon();
		akonjugation:
		for (int i = 0; i < a.getVerbenAkon().length; i++) {
			for (int z = 0; z < a.getVerbenAkon()[i].length; z++) {
				if (gvs.equals(a.getVerbenAkon()[i][z])) {
					gv = gvs + "o";
					new akonjugation(gv, gvs);
					break akonjugation;
				}
				if (i == a.getVerbenAkon().length-1 && !gvs.equals(a.getVerbenAkon()[i][z])) {
					�berpr�fung2(gvs);
					break akonjugation;
				}
			}
		}
	}
	
	private static void �berpr�fung2(String gvs) {
		e.verbenEkon();
		System.out.println(e.getVerbenEkon().length);
		ekonjugation:
		for (int i = 0; i < e.getVerbenEkon().length; i++) {
			for (int z = 0; z < e.getVerbenEkon()[i].length; z++) {
				if (gvs.equals(e.getVerbenEkon()[i][z])) {
					z�hler++;
					pointArray.add(new Point(i,z));
					ekon = true;
				}
				if (i == e.getVerbenEkon().length && !gvs.equals(e.getVerbenEkon()[i][z])) {
					break ekonjugation;
				}
				if (i == e.getVerbenEkon().length-1 && z�hler > 0 && gvs.equals(e.getVerbenEkon()[i][z])) {
					auswertung(i, z, gvs);
				}
			}
		}
		ekonjugation2:
		for (int i = 0; i < e.getVerbenEkonRest().length; i++){
			for (int z = 0; z < e.getVerbenEkonRest()[i].length; z++) {
				if (gvs.equals(e.getVerbenEkonRest()[i][z])) {
					z�hler++;
					pointArray.add(new Point(i,z));
					ekon2 = true;
				}
				if (i == e.getVerbenEkonRest().length-1 && z�hler > 0 && gvs.equals(e.getVerbenEkonRest()[i][z])) {
					auswertung(i,z,gvs);
				}
			}
		}
	}
	
	
	private static void auswertung(int i, int z, String s) {
		if (ekon && z�hler == 1) {
			gv = e.getVerbenEkon()[i][z] + "eo";
			new ekonjugation(gv, s);
		}else if (ekon2 && z�hler == 1) {
			gv = e.rverbenespn()[z] + "eo";
			new ekonjugation(gv, s);
		}
		
		if (z�hler > 1) {
			StringBuffer sb = new StringBuffer();
			if (ekon) {				
				for (int a = 0; a < pointArray.size(); a++) {
					gv = e.getVerbenEkon()[(int) pointArray.get(a).getX()][(int) pointArray.get(a).getY()] + "eo";
					sb.append(gv);
					sb.append("\n");
					new ekonjugation(gv, s);
				}
			}else if (ekon2) {
				for (int a = 0; a < pointArray.size(); a++) {
					gv = e.rverbenespn()[(int) pointArray.get(a).getY()] + "eo";
					sb.append(gv);
					sb.append("\n");
				}
			}
			
		}
	}
	

}
