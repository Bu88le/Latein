package vokabeln;

import javax.swing.JOptionPane;

public class e {
	static String[][] übergabe = new String[2][];
	static String[][] rest = new String[1][];
	
	final static public String[] verbene = {"mon"};
	final static public String[] verbenes = {"adhae", "ar"};
	
	final static public String[] verbenesn = {"adhaereo", "ardeo"};
	final static public String[] verbenespn = {"adhaer", "ard"};
	
	static public String[] rverbene() {
		return verbene;
	}
	
	static public String[] rverbenes() {
		return verbenes;
	}
	
	static public String[] rverbenesn() {
		return verbenesn;
	}
	
	static public String[] rverbenespn() {
		return verbenespn;
	}
	
	public static void verbenEkon() {
		übergabe[0] = new String[verbene.length];
		übergabe[1] = new String[verbenes.length];
		
		for (int i = 0; i < verbene.length; i++) {
			übergabe[0][i] = verbene[i];
		}
		for (int i = 0; i < verbenespn.length; i++) {
			übergabe[1][i] = verbenespn[i];
		}
		verbenEkonRest();
	}
	
	private static void verbenEkonRest() {
		rest[0] = new String[verbenes.length];
		for (int i = 0; i < verbenes.length; i++) {
			rest[0][i] = verbenes[i];
		}
	}
	
	public static String[][] getVerbenEkon() {
		return übergabe;
	}
	
	public static String[][] getVerbenEkonRest() {
		return rest;
	}

}