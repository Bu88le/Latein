package wörter;

import frames.frame;

public class ekonjugation {
	
	public static String gvs, gv;
	static public boolean ekon;
	
	public ekonjugation(String s, String t) {
		gv = s;
		gvs = t;
		formen();
	}
	
	//-----------------------------------------------------------------------------------------------
	//--------------------------------------PRÄSENS--------------------------------------------------
	//-----------------------------------------------------------------------------------------------
	public static String[] präsensaktivindikativ = {"", "", "", "", "", ""};
	public static String[] präsensaktivkonjunktiv = {"", "", "", "", "", ""};
	public static String[] präsenspassivindikativ = {"", "", "", "", "", ""};
	public static String[] präsenspassivkonjunktiv = {"", "", "", "", "", ""};
	
	public static String[] endungenpräsensaktiv = {"eo", "es", "et", "emus", "etis", "ent"};
	public static String[] endungenpräsensaktivkonjunktiv = {"eam", "eas", "eat", "eamus", "eatis", "eant"};
	public static String[] endungenpräsenspassiv = {"eor", "eris", "etur", "emur", "emini", "entur"};
	public static String[] endungenpräsenspassivkonjunktiv = {"ear", "earis", "eatur", "eamur", "eamini", "eantur"};
	
	//-------------------------------------------------------------------------------------------------
	//-------------------------------------IMPERFEKT---------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	public static String[] imperfektaktivindikativ = {"", "", "", "", "", ""};
	public static String[] imperfektaktivkonjunktiv = {"", "", "", "", "", ""};
	public static String[] imperfektpassivindikativ = {"", "", "", "", "", ""};
	public static String[] imperfektpassivkonjunktiv = {"", "", "", "", "", ""};
	
	public static String[] endungenimperfektaktiv = {"ebam", "ebas", "ebat", "ebamus", "ebatis", "ebant"};
	public static String[] endungenimperfektaktivkonjunktiv = {"erem", "eres", "eret", "eremus", "eretis", "erent"};
	public static String[] endungenimperfektpassiv = {"ebar", "ebaris", "ebatur", "ebamur", "ebamini", "ebantur"};
	public static String[] endungenimperfektpassivkonjunktiv = {"erer", "ereris", "eretur", "eremur", "eremini", "erentur"};
	
	//-------------------------------------------------------------------------------------------------
	//------------------------------------PERFEKT------------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	public static String[] perfektaktivindikativ = {"", "", "", "", "", ""};
	public static String[] perfektaktivkonjunktiv = {"", "", "", "", "", ""};
	public static String[] perfektpassivindikativ = {"", "", "", "", "", ""};
	public static String[] perfektpassivkonjunktiv = {"", "", "", "", "", ""};
	
	public static String[] endungenperfektaktiv = {"ui", "uisti", "uit", "uimus", "uistis", "uerunt"};
	public static String[] endungenperfektpassiv = {"itus sum", "itus es", "itus est", "iti sumus", "iti estis", "iti sunt"};
	public static String[] endungenperfektaktivkonjunktiv = {"uerium", "ueris", "uerit", "uerimus", "ueritis", "uerint"};
	public static String[] endungenperfektpassivkonjunktiv = {"itus sim", "itus sis", "itus sit", "iti simus", "iti sitis", "iti sint"};
	
	//-------------------------------------------------------------------------------------------------
	//-----------------------------------PLUSQUAMPERFEKT-----------------------------------------------
	//-------------------------------------------------------------------------------------------------
	public static String[] plusquamperfektaktivindikativ = {"", "", "", "", "", ""};
	public static String[] plusquamperfektaktivkonjunktiv = {"", "", "", "", "", ""};
	public static String[] plusquamperfektpassivindikativ = {"", "", "", "", "", ""};
	public static String[] plusquamperfektpassivkonjunktiv = {"", "", "", "", "", ""};
	
	public static String[] endungenplusqaktiv = {"ueram", "ueras", "uerat", "ueramus", "ueratis", "uerant"};
	public static String[] endungenplusqaktivkonjunktiv = {"uissem", "uisses", "uisset", "uissemus", "uissetis", "uissent"};
	public static String[] endungenplusqpassiv = {"us eram", "itus eras", "itus erat", "iti eramus", "iti eratis", "iti erant"};
	public static String[] endungenplusqpassivkonjunktiv = {"itus essem", "itus esses", "itus esset", "iti essemus", "iti essetis", "iti essent"};
	
	
	//-------------------------------------------------------------------------------------------------
	//-----------------------------------FUTUR I-------------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	public static String[] futurIaktiv = {"", "", "", "", "", ""};
	public static String[] futurIpassiv = {"", "", "", "", "", ""};
	
	public static String[] endungenfuturIaktiv = {"ebo", "ebis", "ebit", "ebimus", "ebitis", "ebunt"};
	public static String[] endungenfuturIpassiv = {"ebor", "eberis", "ebitur", "ebimur", "ebimini", "ebuntur"};
	
	//--------------------------------------------------------------------------------------------------
	//--------------------------------------FUTUR II----------------------------------------------------
	//--------------------------------------------------------------------------------------------------
	public static String[] futurIIaktiv = {"", "", "", "", "", ""};
	public static String[] futurIIpassiv = {"", "", "", "", "", ""};
	
	public static String[] endungenfuturIIaktiv = {"uero", "ueris", "uerit", "uerimus", "ueritis", "uerint"};
	public static String[] endungenfuturIIpassiv = {"itus ero", "itus eris", "itus erit", "iti erimus", "iti eritis", "iti erunt"};
	
	
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
	
	static void abfrage() {
		new frame();
	}
	
	
	public String[] präsensaktivindikativ() {
		return präsensaktivindikativ;
	}
	
	public String[] präsensaktivkonjunktiv() {
		return präsensaktivkonjunktiv;
	}
	
	public String[] präsenspassivindikativ() {
		return präsenspassivindikativ;
	}
	
	public String[] präsenspassivkonjunktiv() {
		return präsenspassivkonjunktiv;
	}
}
