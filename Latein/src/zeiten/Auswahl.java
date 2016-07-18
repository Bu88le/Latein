package zeiten;

import java.awt.Point;
import java.util.ArrayList;
import java.util.logging.MemoryHandler;

import latein.Main;
import vokabeln.a;
import vokabeln.e;
import wörter.akonjugation;
import wörter.ekonjugation;
import übersetzung.uea;

public class Auswahl {
	
	private static String gv;
	private static int zähler = 0;
	public static ArrayList<Point> pointArray = new ArrayList<Point>();
	public static boolean akon, ekon, ekon2, konskon, ikon, found;
	public static ArrayList <String> MehrereVokabeln = new ArrayList<String>();
	
	private static String[][] getVerben;
	
	public Auswahl(String gvs) {
		akon = false;
		ekon = false;
		ekon2 = false;
		konskon = false;
		ikon = false;
		found = false;
		pointArray.clear();
		MehrereVokabeln.clear();
		überprüfungAKonjugation(gvs);
	}
	
	private static void überprüfungAKonjugation(String gvs) {
		zähler = 0;
		
		a.verbenAkon();
		getVerben = a.getVerbenAkon();
		
		forSchleife:
		for (int i = 0; i < getVerben.length; i++) {
			for (int z = 0; z < getVerben[i].length; z++) {
				if (gvs.equals(getVerben[i][z])) {
					zähler++;
					pointArray.add(new Point(i,z));
					akon = true;
					found = true;
				}
			}
		}
		
		if (akon && zähler > 0 && found) {
			Auswertung(gvs);
		}
		if (found == false) {
			überprüfungEKonjugation(gvs);
		}
	}
	
	private static void überprüfungEKonjugation(String gvs) {
		zähler = 0;
		
		e.verbenEkon();
		getVerben = e.getVerbenEkon();
		
		for (int i = 0; i < getVerben.length; i++) {
			for (int z = 0; z < getVerben[i].length; z++) {
				if (gvs.equals(getVerben[i][z])) {
					zähler++;
					pointArray.add(new Point(i,z));
					ekon = true;
					found = true;
				}
			}
		}
		
		if (ekon && zähler > 0 && found) {
			Auswertung(gvs);
		}
		
		getVerben = e.getVerbenEkonRest();
		System.out.println(gvs);
		for (int i = 0; i < getVerben.length; i++) {
			for (int z = 0; z < getVerben[i].length; z ++) {
				if ( gvs.equals(getVerben[i][z])) {
					zähler++;
					pointArray.add(new Point(i,z));
					ekon2 = true;
					found = true;
				}
			}
		}
		
		if (ekon2 && zähler > 0 && found) {
			Auswertung(gvs);
		}
		if (found == false){
			//TODO
		}
	}
	
	private static void Auswertung(String gvs) {
		if (zähler == 1 && found) {
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
		if (zähler > 1 && found) {
			System.out.println(zähler);
		}
	}
	

}
