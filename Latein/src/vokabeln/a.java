package vokabeln;

public class a {
	static String[][] �bergabe = new String[3][];
	

	final static public String[] verbena = {"labor", "pecc", "am", "laud", "abalien", "abdic", "abequit", "aberr", "abiudic","abiur","adaequ", "ableg", "abloc", "abneg", "abnoct", "abnut", "abomin", "abrog", "abst", "abund", "accel", "acclam", "acclar", "acclin", "accommod", "accub", "accumul", "accur", "accus", "accusit", "acerb", "acerv", "adaequ", "adagger", "adallig", "adam", "adambul", "adapt", "adaqu", "adhort", "adinspect", "adiudic", "adiur", "adiut", "adiuv", "admatur", "admigr", "adminicul", "administr", "admurmur", "admutil", "adnat", "adopt", "ador", "adorn", "adul","adulter", "adumbr", "adun", "advect", "advel",
												"advent", "adver", "adaequ", "adaequ"};
	final static public String[] verbenau = {"concrep", "crep", "discrep", "cub", "excub", "incub", "discrep", "dissec", "dom", "excub", "incub", "increp", "mic", "reson", "sec", "dissec", "son", "ton", "vet"};
	
	final static public String[] verbenaun = {"concrepare", "crepare", "discrepare", "cubare", "excubare", "incubare", "discrepare", "dissecare", "domare", "excubare", "incubare", "increpare", "micare", "resonare", "secare", "dissecare", "sonare", "resonare", "tonare", "vetare"};
	
	final static public String[] verbenadp = {"admir", "admoder", "adopin"};
	
	static public String[] rverbena (){
		return verbena;
	}
	
	static public String[] rverbenau() {
		return verbenau;
	}
	
	static public String[] rverbenadp() {
		return verbenadp;
	}
	
	public static void verbenAkon() {
		�bergabe[0] = new String[verbena.length];
		�bergabe[1] = new String[verbenau.length];
		�bergabe[2] = new String[verbenadp.length];
		
		
		
		for (int i = 0; i < verbena.length; i++) {
			�bergabe[0][i] = verbena[i];
		}
		for (int i = 0; i < verbenau.length; i++) {
			�bergabe[1][i] = verbenau[i];
		}
		for (int i = 0; i < verbenadp.length; i++) {
			�bergabe[2][i] = verbenadp[i];
		}
	}
	
	public static String[][] getVerbenAkon() {
		return �bergabe;
	}
}