package w�rter;
import vokabeln.*;
import frames.*;
import �bersetzung.*;
public class akonjugation {
	
	public static String gv;
	static String gvs;
	static public boolean akon;
	
	public akonjugation(String s, String t) {
		gv = s;
		gvs = t;
		testen();

	}
	
	void testen() {
		for (int i = 0; i < a.rverbena().length; i++) {
			if (gv.equals(a.rverbena()[i])) {
				if (gv.equals(a.verbenapu[i])) {
					akon = true;
					formenu();
					new uea(gv);
				}else {
					akon = true;
					formen();
					new uea(gv);
				}

			}else {
				
		}
			
		}
	}

		//-----------------------------------------------------------------------------------------------
		//--------------------------------------PR�SENS--------------------------------------------------
		//-----------------------------------------------------------------------------------------------
		public static String[] pr�sensaktivindikativ = {"", "", "", "", "", ""};
		public static String[] pr�sensaktivkonjunktiv = {"", "", "", "", "", ""};
		public static String[] pr�senspassivindikativ = {"", "", "", "", "", ""};
		public static String[] pr�senspassivkonjunktiv = {"", "", "", "", "", ""};
		
		
		static String[] endungenpr�sensaktiv = {"o \n", "as \n", "at \n", "amus \n", "atis \n", "ant \n"};
		static String[] endungenpr�sensaktivkonjunktiv = {"em ", "es", "et", "emus", "etis", "ent"};
		static String[] endungenpr�senspassiv = {"or", "aris", "atur", "amur", "amini", "antur"};
		static String[] endungenpr�senspassivkonjunktiv = {"er", "eris", "etur", "emur", "emini", "entur"};
		
		
		//-------------------------------------------------------------------------------------------------
		//-------------------------------------IMPERFEKT---------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		public static String[] imperfektaktivindikativ = {"", "", "", "", "", ""};
		public static String[] imperfektaktivkonjunktiv = {"", "", "", "", "", ""};
		public static String[] imperfektpassivindikativ = {"", "", "", "", "", ""};
		public static String[] imperfektpassivkonjunktiv = {"", "", "", "", "", ""};
		
		static String[] endungenimperfektaktiv = {"abam", "abas", "abat", "abamus", "abatis", "abant"};
		static String[] endungenimperfektaktivkonjunktiv = {"arem", "ares", "aret", "aremus", "aretis", "arent"};
		static String[] endungenimperfektpassiv = {"abar", "abaris", "abatur", "abamur", "abamini", "abantur"};
		static String[] endungenimperfektpassivkonjunktiv = {"arer", "areris", "aretur", "aremur", "aremini", "arentur"};
		
		
		//-------------------------------------------------------------------------------------------------
		//------------------------------------PERFEKT------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		public static String[] perfektaktivindikativ = {"", "", "", "", "", ""};
		public static String[] perfektaktivkonjunktiv = {"", "", "", "", "", ""};
		public static String[] perfektpassivindikativ = {"", "", "", "", "", ""};
		public static String[] perfektpassivkonjunktiv = {"", "", "", "", "", ""};
		
		public static String[] endungenperfektaktiv = {"avi", "avisti", "avit", "avimus", "avistis", "averunt"};
		public static String[] endungenperfektaktivkonjunktiv = {"averim", "averis", "averit", "averimus", "averitis", "averint"};
		public static String[] endungenperfektpassiv = {"atus sum", "atus es", "atus est", "ati sumus", "ati estis", "ati sunt"};
		public static String[] endungenperfektpassivkonjunktiv = {"atus sim", "atus sis", "atus sit", "ati simus", "ati sitis", "ati sint"};
		
		public static String[] endungenperfektaktivu = {"ui", "uisti", "uit", "uimus", "uistis", "uerunt"};
		public static String[] endungenperfektaktivkonjunktivu = {"uerim", "ueris", "uerit", "uerimus", "ueritis", "uerint"};
		public static String[] endungenperfektpassivu = {"itus sum", "itus es", "itus est", "iti sumus", "iti estis", "iti sunt"};
		public static String[] endungenperfektpassivkonjunktivu = {"itus sim", "itus sis", "itus sit", "iti sumus", "iti sitis", "iti sint"};
		
		//-------------------------------------------------------------------------------------------------
		//-----------------------------------PLUSQUAMPERFEKT-----------------------------------------------
		//-------------------------------------------------------------------------------------------------
		public static String[] plusquamperfektaktivindikativ = {"", "", "", "", "", ""};
		public static String[] plusquamperfektaktivkonjunktiv = {"", "", "", "", "", ""};
		public static String[] plusquamperfektpassivindikativ = {"", "", "", "", "", ""};
		public static String[] plusquamperfektpassivkonjunktiv = {"", "", "", "", "", ""};
		
		public static String[] endungenplusqaktiv = {"averam", "averas", "averat", "averamus", "averatis", "averant"};
		public static String[] endungenplusqaktivkonjunktiv = {"avissem", "avisses", "avisset", "avissemus", "avissetis", "avissent"};
		public static String[] endungenplusqpassiv = {"atus eram", "atus eras", "atus erat", "ati eramus", "ati eratis", "ati erant"};
		public static String[] endungenplusqpassivkonjunktiv = {"atus essem", "atus esses", "atus esset", "ati essemus", "ati essetis", "ati essent"};
		
		
		//-------------------------------------------------------------------------------------------------
		//-----------------------------------FUTUR I-------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		public static String[] futurIaktiv = {"", "", "", "", "", ""};
		public static String[] futurIpassiv = {"", "", "", "", "", ""};
		
		public static String[] endungenfuturIaktiv = {"abo", "abis", "abit", "abimus", "abitis", "abunt"};
		public static String[] endungenfuturIpassiv = {"abor", "aberis", "abitur", "abimur", "abimini", "abuntur"};
	
		
		//--------------------------------------------------------------------------------------------------
		//--------------------------------------FUTUR II----------------------------------------------------
		//--------------------------------------------------------------------------------------------------
		public static String[] futurIIaktiv = {"", "", "", "", "", ""};
		public static String[] futurIIpassiv = {"", "", "", "", "", ""};
		
		public static String[] endungenfuturIIaktiv = {"avero", "averis", "averit", "averimus", "averitis", "averint"};
		public static String[] endungenfuturIIpassiv = {"atus ero", "atus eris", "atus erit", "ati erimus", "ati eritis", "ati erunt"};
		
		
	public static void formen(){

		for (int i = 0; i < 6; i++) {
			pr�sensaktivindikativ[i] = gvs + endungenpr�sensaktiv[i];	
			System.out.println (pr�sensaktivindikativ[i]);
			
			pr�sensaktivkonjunktiv[i] = gvs + endungenpr�sensaktivkonjunktiv[i];
			System.out.println(pr�sensaktivkonjunktiv[i]);
			
			pr�senspassivindikativ[i] = gvs + endungenpr�senspassiv[i];
			System.out.println(pr�senspassivindikativ[i]);
			
			pr�senspassivkonjunktiv[i] = gvs + endungenpr�senspassivkonjunktiv[i];
			System.out.println(pr�senspassivkonjunktiv[i]);
			
			imperfektaktivindikativ[i] = gvs + endungenimperfektaktiv[i];
			System.out.println(imperfektaktivindikativ[i]);
			
			imperfektaktivkonjunktiv[i] = gvs + endungenimperfektaktivkonjunktiv[i];
			System.out.println(imperfektaktivkonjunktiv[i]);
			
			imperfektpassivindikativ[i] = gvs + endungenimperfektpassiv[i];
			System.out.println(imperfektpassivindikativ[i]);
			
			imperfektpassivkonjunktiv[i] = gvs + endungenimperfektpassivkonjunktiv[i];
			System.out.println(imperfektpassivkonjunktiv[i]);
			
			perfektaktivindikativ[i] = gvs + endungenperfektaktiv[i];
			System.out.println(perfektaktivindikativ[i]);
			
			perfektaktivkonjunktiv[i] = gvs + endungenperfektaktivkonjunktiv[i];
			System.out.println(perfektaktivkonjunktiv[i]);	
			
			perfektpassivindikativ[i] = gvs + endungenperfektpassiv[i];
			System.out.println(perfektpassivindikativ[i]);
			
			perfektpassivkonjunktiv[i] = gvs + endungenperfektpassivkonjunktiv[i];
			System.out.println(perfektpassivkonjunktiv[i]);
			
			plusquamperfektaktivindikativ[i] = gvs + endungenplusqaktiv[i];
			System.out.println(plusquamperfektaktivindikativ[i]);
			
			plusquamperfektaktivkonjunktiv[i] = gvs + endungenplusqaktivkonjunktiv[i];
			System.out.println(plusquamperfektaktivkonjunktiv[i]);
			
			plusquamperfektpassivindikativ[i] = gvs + endungenplusqpassiv[i];
			System.out.println(plusquamperfektpassivindikativ[i]);
			
			plusquamperfektpassivkonjunktiv[i] = gvs + endungenplusqpassivkonjunktiv[i];
			System.out.println(plusquamperfektpassivkonjunktiv[i]);
			
			futurIaktiv[i] = gvs + endungenfuturIaktiv[i];
			System.out.println(futurIaktiv[i]);
			
			futurIpassiv[i] = gvs + endungenfuturIpassiv[i];
			System.out.println(futurIpassiv[i]);
			
			futurIIaktiv[i] = gvs + endungenfuturIIaktiv[i];
			System.out.println(futurIIaktiv[i]);
			
			futurIIpassiv[i] = gvs + endungenfuturIIpassiv[i];
			System.out.println(futurIIpassiv[i]);
		}
		
		abfrage();
	}
	
	static public void formenu() {
		for (int i = 0; i < 6; i++) {
			pr�sensaktivindikativ[i] = gvs + endungenpr�sensaktiv[i];	
			System.out.println (pr�sensaktivindikativ[i]);
			
			pr�sensaktivkonjunktiv[i] = gvs + endungenpr�sensaktivkonjunktiv[i];
			System.out.println(pr�sensaktivkonjunktiv[i]);
			
			pr�senspassivindikativ[i] = gvs + endungenpr�senspassiv[i];
			System.out.println(pr�senspassivindikativ[i]);
			
			pr�senspassivkonjunktiv[i] = gvs + endungenpr�senspassivkonjunktiv[i];
			System.out.println(pr�senspassivkonjunktiv[i]);
			
			imperfektaktivindikativ[i] = gvs + endungenimperfektaktiv[i];
			System.out.println(imperfektaktivindikativ[i]);
			
			imperfektaktivkonjunktiv[i] = gvs + endungenimperfektaktivkonjunktiv[i];
			System.out.println(imperfektaktivkonjunktiv[i]);
			
			imperfektpassivindikativ[i] = gvs + endungenimperfektpassiv[i];
			System.out.println(imperfektpassivindikativ[i]);
			
			imperfektpassivkonjunktiv[i] = gvs + endungenimperfektpassivkonjunktiv[i];
			System.out.println(imperfektpassivkonjunktiv[i]);
			
			perfektaktivindikativ[i] = gvs + endungenperfektaktivu[i];
			System.out.println(perfektaktivindikativ[i]);
			
			perfektaktivkonjunktiv[i] = gvs + endungenperfektaktivkonjunktivu[i];
			
		}
	}
	

	static void abfrage() {
		new frame();
	}
	
	public String[] pr�sensaktivindikativ() {
		return pr�sensaktivindikativ;
	}
	
	public String[] pr�sensaktivkonjunktiv() {
		return pr�sensaktivkonjunktiv;
	}
	
	public String[] pr�senspassivindikativ() {
		return pr�senspassivindikativ;
	}
	
	public String[] pr�senspassivkonjunktiv() {
		return pr�senspassivkonjunktiv;
	}
}