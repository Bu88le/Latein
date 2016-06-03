package wörter;
import vokabeln.*;
import frames.*;
import übersetzung.*;
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
			if (gvs.equals(a.rverbena()[i])) {
				akon = true;
				formen();
				new uea(gv);
			}
		}
		for (int i = 0; i < a.rverbenau().length; i++) {
			if (gvs.equals(a.rverbenau()[i])) {
				akon = true;
				formenu(i);
				new uea(gv);
			}
		}
	}

		//-----------------------------------------------------------------------------------------------
		//--------------------------------------PRÄSENS--------------------------------------------------
		//-----------------------------------------------------------------------------------------------
		public static String[] präsensaktivindikativ = new String[6];
		public static String[] präsensaktivkonjunktiv = new String[6];
		public static String[] präsenspassivindikativ = new String[6];
		public static String[] präsenspassivkonjunktiv = new String[6];
		
		
		static String[] endungenpräsensaktiv = {"o \n", "as \n", "at \n", "amus \n", "atis \n", "ant \n"};
		static String[] endungenpräsensaktivkonjunktiv = {"em ", "es", "et", "emus", "etis", "ent"};
		static String[] endungenpräsenspassiv = {"or", "aris", "atur", "amur", "amini", "antur"};
		static String[] endungenpräsenspassivkonjunktiv = {"er", "eris", "etur", "emur", "emini", "entur"};
		
		
		//-------------------------------------------------------------------------------------------------
		//-------------------------------------IMPERFEKT---------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		public static String[] imperfektaktivindikativ = new String[6];
		public static String[] imperfektaktivkonjunktiv = new String[6];
		public static String[] imperfektpassivindikativ = new String[6];
		public static String[] imperfektpassivkonjunktiv = new String[6];
		
		static String[] endungenimperfektaktiv = {"abam", "abas", "abat", "abamus", "abatis", "abant"};
		static String[] endungenimperfektaktivkonjunktiv = {"arem", "ares", "aret", "aremus", "aretis", "arent"};
		static String[] endungenimperfektpassiv = {"abar", "abaris", "abatur", "abamur", "abamini", "abantur"};
		static String[] endungenimperfektpassivkonjunktiv = {"arer", "areris", "aretur", "aremur", "aremini", "arentur"};
		
		
		//-------------------------------------------------------------------------------------------------
		//------------------------------------PERFEKT------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		public static String[] perfektaktivindikativ = new String[6];
		public static String[] perfektaktivkonjunktiv = new String[6];
		public static String[] perfektpassivindikativ = new String[6];
		public static String[] perfektpassivkonjunktiv = new String[6];
		
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
		public static String[] plusquamperfektaktivindikativ = new String[6];
		public static String[] plusquamperfektaktivkonjunktiv = new String[6];
		public static String[] plusquamperfektpassivindikativ = new String[6];
		public static String[] plusquamperfektpassivkonjunktiv = new String[6];
		
		public static String[] endungenplusqaktiv = {"averam", "averas", "averat", "averamus", "averatis", "averant"};
		public static String[] endungenplusqaktivkonjunktiv = {"avissem", "avisses", "avisset", "avissemus", "avissetis", "avissent"};
		public static String[] endungenplusqpassiv = {"atus eram", "atus eras", "atus erat", "ati eramus", "ati eratis", "ati erant"};
		public static String[] endungenplusqpassivkonjunktiv = {"atus essem", "atus esses", "atus esset", "ati essemus", "ati essetis", "ati essent"};
		
		public static String[] endungenplusquaktiv = {"ueram", "ueras", "uerat", "ueramus", "ueratis", "uerant"};
		public static String[] endungenplusquaktivkonjunktiv = {"uissem", "uisses", "uisset", "uissemus", "uissetis", "uissent"};
		public static String[] endungenplusqupassiv = {"itus eram", "itus eras", "itus erat", "iti eramus", "iti eratis", "iti erant"};
		public static String[] endungenplusqupassivkonjunktiv = {"itus essem", "itus esses", "itus esset", "iti essemus", "iti essetis", "iti essent"};
		//-------------------------------------------------------------------------------------------------
		//-----------------------------------FUTUR I-------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		public static String[] futurIaktiv = new String[6];
		public static String[] futurIpassiv = new String[6];
		
		public static String[] endungenfuturIaktiv = {"abo", "abis", "abit", "abimus", "abitis", "abunt"};
		public static String[] endungenfuturIpassiv = {"abor", "aberis", "abitur", "abimur", "abimini", "abuntur"};
	
		
		//--------------------------------------------------------------------------------------------------
		//--------------------------------------FUTUR II----------------------------------------------------
		//--------------------------------------------------------------------------------------------------
		public static String[] futurIIaktiv = new String[6];
		public static String[] futurIIpassiv = new String[6];
		
		public static String[] endungenfuturIIaktiv = {"avero", "averis", "averit", "averimus", "averitis", "averint"};
		public static String[] endungenfuturIIpassiv = {"atus ero", "atus eris", "atus erit", "ati erimus", "ati eritis", "ati erunt"};
		
		public static String[] endungenfuturIIuaktiv = {"uero", "ueris", "uerit", "uerimus", "ueritis", "uerint"};
		public static String[] endungenfuturIIupassiv = {"itus ero", "itus eris", "itus erit", "iti erimus", "iti eritis", "iti erunt"};
		
		
	public static void formen(){

		for (int i = 0; i < 6; i++) {
			präsensaktivindikativ[i] = gvs + endungenpräsensaktiv[i];
			System.out.println (präsensaktivindikativ[i]);
			
			präsensaktivkonjunktiv[i] = gvs + endungenpräsensaktivkonjunktiv[i];
			System.out.println(präsensaktivkonjunktiv[i]);
			
			präsenspassivindikativ[i] = gvs + endungenpräsenspassiv[i];
			System.out.println(präsenspassivindikativ[i]);
			
			präsenspassivkonjunktiv[i] = gvs + endungenpräsenspassivkonjunktiv[i];
			System.out.println(präsenspassivkonjunktiv[i]);
			
			imperfektaktivindikativ[i] = gvs + endungenimperfektaktiv[i];
			System.out.println(imperfektaktivindikativ[i]);
			
			imperfektaktivkonjunktiv[i] = gvs + endungenimperfektaktivkonjunktiv[i];
			System.out.println(imperfektaktivkonjunktiv[i]);
			
			imperfektpassivindikativ[i] = gvs + endungenimperfektpassiv[i];
			System.out.println(imperfektpassivindikativ[i]);
			
			imperfektpassivkonjunktiv[i] = (gvs + endungenimperfektpassivkonjunktiv[i]);
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
	}
	
	static public void formenu(int z) {
		for (int i = 0; i < 6; i++) {
			präsensaktivindikativ[i] = a.rverbenau()[z] + endungenpräsensaktiv[i];	
			System.out.println (präsensaktivindikativ[i]);
			
			präsensaktivkonjunktiv[i] = a.rverbenau()[z] + endungenpräsensaktivkonjunktiv[i];
			System.out.println(präsensaktivkonjunktiv[i]);
			
			präsenspassivindikativ[i] = a.rverbenau()[z] + endungenpräsenspassiv[i];
			System.out.println(präsenspassivindikativ[i]);
			
			präsenspassivkonjunktiv[i] = a.rverbenau()[z] + endungenpräsenspassivkonjunktiv[i];
			System.out.println(präsenspassivkonjunktiv[i]);
			
			imperfektaktivindikativ[i] = a.rverbenau()[z] + endungenimperfektaktiv[i];
			System.out.println(imperfektaktivindikativ[i]);
			
			imperfektaktivkonjunktiv[i] = a.rverbenau()[z] + endungenimperfektaktivkonjunktiv[i];
			System.out.println(imperfektaktivkonjunktiv[i]);
			
			imperfektpassivindikativ[i] = a.rverbenau()[z] + endungenimperfektpassiv[i];
			System.out.println(imperfektpassivindikativ[i]);
	
			imperfektpassivkonjunktiv[i] = a.rverbenau()[z] + endungenimperfektpassivkonjunktiv[i];
			System.out.println(imperfektpassivkonjunktiv[i]);
			
			perfektaktivindikativ[i] = a.rverbenau()[z] + endungenperfektaktivu[i];
			System.out.println(perfektaktivindikativ[i]);
			
			perfektaktivkonjunktiv[i] = a.rverbenau()[z] + endungenperfektaktivkonjunktivu[i];
			System.out.println(perfektaktivkonjunktiv[i]);
			
			perfektpassivindikativ[i] = a.rverbenau()[z] + endungenperfektpassivu[i];
			System.out.println(perfektpassivindikativ[i]);
			
			perfektpassivkonjunktiv[i] = a.rverbenau()[z] + endungenperfektpassivkonjunktivu[i];
			System.out.println(perfektpassivkonjunktiv[i]);
			
			plusquamperfektaktivindikativ[i] = a.rverbenau()[z] + endungenplusquaktiv[i];
			System.out.println(plusquamperfektaktivindikativ[i]);
			
			plusquamperfektaktivkonjunktiv[i] = a.rverbenau()[z] + endungenplusquaktivkonjunktiv[i];
			System.out.println(plusquamperfektaktivkonjunktiv[i]);
			
			plusquamperfektpassivindikativ[i] = a.rverbenau()[z] + endungenplusqupassiv[i];
			System.out.println(plusquamperfektpassivindikativ[i]);
			
			plusquamperfektpassivkonjunktiv[i] = a.rverbenau()[z] + endungenplusqupassivkonjunktiv[i];
			System.out.println(plusquamperfektpassivkonjunktiv[i]);
			
			futurIIaktiv[i] = a.rverbenau()[z] + endungenfuturIIuaktiv[i];
			System.out.println(futurIIaktiv[i]);
			
			futurIIpassiv[i] = a.rverbenau()[z] + endungenfuturIIupassiv[i];
			System.out.println(futurIIpassiv[i]);
		}
	}
	
	public static String getPräsensaktivindikativ() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < präsensaktivindikativ.length; i++) {
				sb.append("&#160" + präsensaktivindikativ[i] + "<p/>");
			
			if (i == präsensaktivindikativ.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString();
	}
	
	public static String getPräsensaktivkonjunktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < präsensaktivkonjunktiv.length; i++) {
			sb.append("&#160" + präsensaktivkonjunktiv[i]);
			sb.append("<p/>");
			if (i == präsensaktivkonjunktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPräsenspassivindikativ() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < präsenspassivindikativ.length; i++) {
			sb.append("&#160" + präsenspassivindikativ[i]);
			sb.append("<p/>");
			if (i == präsenspassivindikativ.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPräsenspassivkonjunktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < präsenspassivkonjunktiv.length; i++) {
			sb.append("&#160" + präsenspassivkonjunktiv[i]);
			sb.append("<p/>");
			if (i == präsenspassivkonjunktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getImperfektAktivIndikativ() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < imperfektaktivindikativ.length; i++) {
			sb.append("&#160" + imperfektaktivindikativ[i]);
			sb.append("<p/>");
			if (i == imperfektaktivindikativ.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getImperfektAktivKonjunktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < imperfektaktivkonjunktiv.length; i++) {
			sb.append("&#160" + imperfektaktivkonjunktiv[i]);
			sb.append("<p/>");
			if (i == imperfektaktivkonjunktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getImperfektPassivIndikativ() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < imperfektpassivindikativ.length; i++) {
			sb.append("&#160" + imperfektpassivindikativ[i]);
			sb.append("<p/>");
			if (i == imperfektpassivindikativ.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getImperfektPassivKonjunktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < imperfektpassivkonjunktiv.length; i++) {
			sb.append("&#160" + imperfektpassivkonjunktiv[i]);
			sb.append("<p/>");
			if (i == imperfektpassivkonjunktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getFuturIAktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < futurIaktiv.length; i++) {
			sb.append("&#160" + futurIaktiv[i]);
			sb.append("<p/>");
			if (i == futurIaktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getFuturIPassiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < futurIpassiv.length; i++) {
			sb.append("&#160" + futurIpassiv[i]);
			sb.append("<p/>");
			if (i == futurIpassiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getFuturIIAktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < futurIIaktiv.length; i++) {
			sb.append("&#160" + futurIIaktiv[i]);
			sb.append("<p/>");
			if (i == futurIIaktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getFuturIIPassiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < futurIIpassiv.length; i++) {
			sb.append("&#160" + futurIIpassiv[i]);
			sb.append("<p/>");
			if (i == futurIIpassiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPerfektAktivIndikativ(){
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < perfektaktivindikativ.length; i++) {
			sb.append("&#160" + perfektaktivindikativ[i]);
			sb.append("<p/>");
			if (i == perfektaktivindikativ.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPerfektAktivKonjunktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < perfektaktivkonjunktiv.length; i++) {
			sb.append("&#160" + perfektaktivkonjunktiv[i]);
			sb.append("<p/>");
			if (i == perfektaktivkonjunktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPerfektPassivIndikativ() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < perfektpassivindikativ.length; i++) {
			sb.append("&#160" + perfektpassivindikativ[i]);
			sb.append("<p/>");
			if (i == perfektpassivindikativ.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPerfektPassivKonjunktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < perfektpassivkonjunktiv.length; i++) {
			sb.append("&#160" + perfektpassivkonjunktiv[i]);
			sb.append("<p/>");
			if (i == perfektpassivkonjunktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPlusqAktivIndikativ() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < plusquamperfektaktivindikativ.length; i++) {
			sb.append("&#160" + plusquamperfektaktivindikativ[i]);
			sb.append("<p/>");
			if (i == plusquamperfektaktivindikativ.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPlusqAktivKonjunktiv(){
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < plusquamperfektaktivkonjunktiv.length; i++) {
			sb.append("&#160" + plusquamperfektaktivkonjunktiv[i]);
			sb.append("<p/>");
			if (i == plusquamperfektaktivkonjunktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPlusqPassivIndikativ() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < plusquamperfektpassivindikativ.length; i++) {
			sb.append("&#160" + plusquamperfektpassivindikativ[i]);
			sb.append("<p/>");
			if (i == plusquamperfektpassivindikativ.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPlusqPassivKonjunktiv() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < plusquamperfektpassivkonjunktiv.length; i++) {
			sb.append("&#160" + plusquamperfektpassivkonjunktiv[i]);
			sb.append("<p/>");
			if (i == plusquamperfektpassivkonjunktiv.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
}