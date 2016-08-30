package vokabeln;

public class a {
	static String[][] übergabe = new String[3][];
	

	final static public String[] verbena = {"labor", "pecc", "am", "laud", "abalien", "abdic", "abequit", "aberr", "abiudic","abiur", "ableg", "abloc", "abneg", "abnoct", "abnut", "abomin", "abrog", "abst", "abund", "accel", "acclam", "acclar", "acclin", "accommod", "accub", "accumul", "accur", "accus", "accusit", "acerb", "acerv", "adaequ", "adagger", "adallig", "adam", "adambul", "adapt", "adaqu", "adhort", "adinspect", "adiudic", "adiur", "adiut", "adiuv", "admatur", "admigr", "adminicul", "administr", "admurmur", "admutil", "adnat", "adopt", "ador", "adorn", "adul","adulter", "adumbr", "adun", "advect", "advel",
												"advent", "adver"};
	final static public String[] verbenau = {"concrep", "crep", "cub", "incub", "discrep", "dom", "excub", "increp", "mic", "reson", "sec", "dissec", "son", "ton", "vet"};
	
	final static public String[] verbenaun = {"concrepare", "crepare", "cubare", "incubare", "discrepare", "domare", "excubare", "increpare", "micare", "resonare", "secare", "dissecare", "sonare", "tonare", "vetare"};
	
	final static public String[] verbenadp = {"admir", "admoder", "adopin"};
	
	static public String[] rverbena (){
		return verbena;
	}
	
	static public String[] rverbenau() {
		return verbenaun;
	}
	
	static public String[] rverbenadp() {
		return verbenadp;
	}
	
	public static void verbenAkon() {
		übergabe[0] = new String[verbena.length];
		übergabe[1] = new String[verbenau.length];
		übergabe[2] = new String[verbenadp.length];
		
		
		
		for (int i = 0; i < verbena.length; i++) {
			übergabe[0][i] = verbena[i];
		}
		for (int i = 0; i < verbenau.length; i++) {
			übergabe[1][i] = verbenau[i];
		}
		for (int i = 0; i < verbenadp.length; i++) {
			übergabe[2][i] = verbenadp[i];
		}
	}
	
	public static String[][] getVerbenAkon() {
		return übergabe;
	}
}