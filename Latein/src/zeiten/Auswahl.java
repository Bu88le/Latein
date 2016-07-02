package zeiten;

import java.awt.Point;
import java.util.ArrayList;
import java.util.logging.MemoryHandler;

import latein.Main;
import vokabeln.a;
import vokabeln.e;
import w�rter.akonjugation;
import w�rter.ekonjugation;
import �bersetzung.uea;

public class Auswahl {
	
	private static String gv;
	private static int z�hler = 0;
	public static ArrayList<Point> pointArray = new ArrayList<Point>();
	public static boolean akon, ekon, ekon2, kosnkon, ikon;
	public static ArrayList <String> MehrereVokabeln = new ArrayList<String>();
	
	public static void �berpr�fung(String gvs) {		
		z�hler = 0;
		a.verbenAkon();
		akonjugation:
		for (int i = 0; i < a.getVerbenAkon().length; i++) {
			for (int z = 0; z < a.getVerbenAkon()[i].length; z++) {
				if (gvs.equals(a.getVerbenAkon()[i][z])) {
					z�hler++;
					pointArray.add(new Point(i,z));
					akon = true;
				}
				if (akon && z�hler > 0 && gvs.equals(a.getVerbenAkon()[i][z])) {
					auswertung(i, z, gvs);
					break akonjugation;
				}
				if (i == a.getVerbenAkon().length-1 && z == a.getVerbenAkon()[i].length-1 && akon == false) {
					�berpr�fung2(gvs);
				}
			}
		}
	}
	
	private static void �berpr�fung2(String gvs) {
		e.verbenEkon();
		ekonjugation:
		for (int i = 0; i < e.getVerbenEkon().length; i++) {
			for (int z = 0; z < e.getVerbenEkon()[i].length; z++) {
				if (gvs.equals(e.getVerbenEkon()[i][z])) {
					z�hler++;
					pointArray.add(new Point(i,z));
					ekon = true;
				}
				if (ekon && z�hler > 0 && gvs.equals(e.getVerbenEkon()[i][z])) {
					auswertung(i, z, gvs);
					break ekonjugation;
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
				if (ekon2 && z�hler > 0 && gvs.equals(e.getVerbenEkonRest()[i][z])) {
					System.out.println("hi");
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
		}else if (akon && z�hler == 1) {
			gv = a.getVerbenAkon()[i][z] + "o";
			new akonjugation(gv, s);
		}
		
		if (z�hler > 1) {
			StringBuffer sb = new StringBuffer();
			if (ekon) {				
				for (int a = 0; a < pointArray.size(); a++) {
					gv = e.getVerbenEkon()[(int) pointArray.get(a).getX()][(int) pointArray.get(a).getY()] + "eo";
				}
				Main.mf.panelMehrereW�rter(MehrereVokabeln);
			}else if (ekon2) {
				for (int a = 0; a < pointArray.size(); a++) {
					gv = e.rverbenespn()[(int) pointArray.get(a).getY()] + "eo";
					sb.append("<html>" + gv);
					sb.append("<p/");
				}
				Main.mf.panelMehrereW�rter(MehrereVokabeln);
			}else if (akon) {
				for (int a = 0; a < pointArray.size(); a++) {
					gv = vokabeln.a.getVerbenAkon()[(int) pointArray.get(a).getX()][(int) pointArray.get(a).getY()] + "o";
					MehrereVokabeln.add(gv);
					uea.Vokabel�berpr�fung(gv);
				}
				z�hler = 0;
				for (int b = 0; b < uea.�bersetzungen.size(); b++) {
					MehrereVokabeln.add(z�hler+1, uea.�bersetzungen.get(b));
				}
				Main.mf.panelMehrereW�rter(MehrereVokabeln);
			}
			
		}
	}
	

}
