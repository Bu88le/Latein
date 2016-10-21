package zeiten;

import java.awt.Point;
import java.util.ArrayList;

import latein.Main;
import vokabeln.a;
import vokabeln.e;
import w�rter.akonjugation;
import w�rter.ekonjugation;

public class Auswahl {
	
	private static String gv;
	public static String gvs;
	private static int z�hler = 0;
	public static ArrayList<Point> pointArray = new ArrayList<Point>();
	public static boolean akon, ekon, ekon2, konskon, ikon, found;
	public static ArrayList <String> MehrereVokabeln = new ArrayList<String>();
	
	private static String[][] getVerben;
	
	public Auswahl(String gvs) {
		Auswahl.gvs = gvs;
		akon = false;
		ekon = false;
		ekon2 = false;
		konskon = false;
		ikon = false;
		found = false;
		pointArray.clear();
		MehrereVokabeln.clear();
		�berpr�fungAKonjugation(gvs);
	}
	
	private static void �berpr�fungAKonjugation(String gvs) {
		z�hler = 0;
		
		a.verbenAkon();
		getVerben = a.getVerbenAkon();
		
		
		for (int i = 0; i < getVerben.length; i++) {
			for (int z = 0; z < getVerben[i].length; z++) {
				if (gvs.equals(getVerben[i][z])) {
					z�hler++;
					pointArray.add(new Point(i,z));
					akon = true;
					found = true;
				}
			}
		}
		
		if (akon && z�hler > 0 && found) {
			Auswertung(gvs);
		}
		if (found == false) {
			�berpr�fungEKonjugation(gvs);
		}
	}
	
	private static void �berpr�fungEKonjugation(String gvs) {
		z�hler = 0;
		
		e.verbenEkon();
		getVerben = e.getVerbenEkon();
		
		for (int i = 0; i < getVerben.length; i++) {
			for (int z = 0; z < getVerben[i].length; z++) {
				if (gvs.equals(getVerben[i][z])) {
					z�hler++;
					pointArray.add(new Point(i,z));
					ekon = true;
					found = true;
				}
			}
		}
		
		if (ekon && z�hler > 0 && found) {
			Auswertung(gvs);
		}
		
		getVerben = e.getVerbenEkonRest();
		System.out.println(gvs);
		for (int i = 0; i < getVerben.length; i++) {
			for (int z = 0; z < getVerben[i].length; z ++) {
				if ( gvs.equals(getVerben[i][z])) {
					z�hler++;
					pointArray.add(new Point(i,z));
					ekon2 = true;
					found = true;
				}
			}
		}
		
		if (ekon2 && z�hler > 0 && found) {
			Auswertung(gvs);
		}
		if (found == false){
			//TODO
		}
	}
	
	private static void Auswertung(String gvs) {
		if (z�hler == 1 && found) {
			if (akon) {
				gv = getVerben[(int) pointArray.get(0).getX()][(int) pointArray.get(0).getY()] + "o";
				new akonjugation(gv, gvs);
			}
			if (ekon) {
				gv = getVerben[(int) pointArray.get(0).getX()][(int) pointArray.get(0).getY()] + "eo";
				new ekonjugation(gv, gvs);
			}
			if (ekon2) {
				getVerben = e.getVerbenEkon();
				gv = getVerben[1][(int) pointArray.get(0).getY()] + "eo";
				new ekonjugation(gv, gvs);
			}
		}
		if (z�hler > 1 && found) {
			for (int i = 0; i < pointArray.size(); i++){
				if (akon) {
					MehrereVokabeln.add((getVerben[(int) pointArray.get(i).getX()][(int) pointArray.get(i).getY()]) + "o" );
				}
				if (ekon) {
					MehrereVokabeln.add((getVerben[(int) pointArray.get(i).getX()][(int) pointArray.get(i).getY()]) + "eo");
				}
				if (ekon2) {
					MehrereVokabeln.add((getVerben[1][(int)pointArray.get(i).getY()]) + "eo");
				}
			}
			
			Main.mf.panelMehrereW�rter(MehrereVokabeln);
		}
	}
	

}
