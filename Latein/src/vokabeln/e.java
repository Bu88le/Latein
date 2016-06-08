package vokabeln;

public class e {
	
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
	
	public static String[][] rverbenekon() {
		String[][] übergabe = new String[3][];
		übergabe[0] = new String[verbene.length];
		übergabe[1] = new String[verbenes.length];
		übergabe[2] = new String[verbenespn.length];
		
		
		
		for (int i = 0; i < verbene.length; i++) {
			übergabe[0][i] = verbene[i];
		}
		for (int i = 0; i < verbenes.length; i++) {
			übergabe[1][i] = verbenes[i];
		}
		for (int i = 0; i < verbenespn.length; i++) {
			übergabe[2][i] = verbenespn[i];
		}
		return übergabe;
	}

}