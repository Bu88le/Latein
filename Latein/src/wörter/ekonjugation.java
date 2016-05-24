package wörter;

import vokabeln.e;
import übersetzung.*;

public class ekonjugation {
	
	public static String gvs, gv;
	static public boolean ekon;
	
	public ekonjugation(String s, String t) {
		gv = s;
		gvs = t;
		testen();
	}
	
	public static void testen() {
		for (int i = 0; i < e.rverbene().length; i++) {
			if (gvs.equals(e.rverbene()[i])) {
				ekon = true;
				formen();
				new uee(gv);
			}else if (gvs.equals(e.rverbenes()[i])) {
				ekon = true;
				formens(i);
				new uee(gv);
			}else if (gvs.equals(e.rverbenespn()[i])) {
				ekon = true;
				formens(i);
				new uee(gv);
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
	
	public static String[] endungenpräsensaktiv = {"eo", "es", "et", "emus", "etis", "ent"};
	public static String[] endungenpräsensaktivkonjunktiv = {"eam", "eas", "eat", "eamus", "eatis", "eant"};
	public static String[] endungenpräsenspassiv = {"eor", "eris", "etur", "emur", "emini", "entur"};
	public static String[] endungenpräsenspassivkonjunktiv = {"ear", "earis", "eatur", "eamur", "eamini", "eantur"};
	
	//-------------------------------------------------------------------------------------------------
	//-------------------------------------IMPERFEKT---------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	public static String[] imperfektaktivindikativ = new String[6];
	public static String[] imperfektaktivkonjunktiv = new String[6];
	public static String[] imperfektpassivindikativ = new String[6];
	public static String[] imperfektpassivkonjunktiv = new String[6];
	
	public static String[] endungenimperfektaktiv = {"ebam", "ebas", "ebat", "ebamus", "ebatis", "ebant"};
	public static String[] endungenimperfektaktivkonjunktiv = {"erem", "eres", "eret", "eremus", "eretis", "erent"};
	public static String[] endungenimperfektpassiv = {"ebar", "ebaris", "ebatur", "ebamur", "ebamini", "ebantur"};
	public static String[] endungenimperfektpassivkonjunktiv = {"erer", "ereris", "eretur", "eremur", "eremini", "erentur"};
	
	//-------------------------------------------------------------------------------------------------
	//------------------------------------PERFEKT------------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	public static String[] perfektaktivindikativ = new String[6];
	public static String[] perfektaktivkonjunktiv = new String[6];
	public static String[] perfektpassivindikativ = new String[6];
	public static String[] perfektpassivkonjunktiv = new String[6];
	
	public static String[] endungenperfektaktiv = {"ui", "uisti", "uit", "uimus", "uistis", "uerunt"};
	public static String[] endungenperfektpassiv = {"itus sum", "itus es", "itus est", "iti sumus", "iti estis", "iti sunt"};
	public static String[] endungenperfektaktivkonjunktiv = {"uerium", "ueris", "uerit", "uerimus", "ueritis", "uerint"};
	public static String[] endungenperfektpassivkonjunktiv = {"itus sim", "itus sis", "itus sit", "iti simus", "iti sitis", "iti sint"};
	
	public static String[] endungenperfektaktivs = {"si", "sisti", "sit", "simus", "sitis", "serunt"};
	public static String[] endungenperfektaktivskonjunktiv = {"serim", "seris", "serit", "serimus", "seritis", "serint"};
	public static String[] endungenperfektpassivs = {"sus sum", "sus es", "sus est", "si sumus", "si estis", "si sunt"};
	public static String[] endungenperfektpassivskonjunktiv = {"sus sim", "sus sis", "sus sit", "si simus", "si sitis", "si sint"};
	
	//-------------------------------------------------------------------------------------------------
	//-----------------------------------PLUSQUAMPERFEKT-----------------------------------------------
	//-------------------------------------------------------------------------------------------------
	public static String[] plusquamperfektaktivindikativ = new String[6];
	public static String[] plusquamperfektaktivkonjunktiv = new String[6];
	public static String[] plusquamperfektpassivindikativ = new String[6];
	public static String[] plusquamperfektpassivkonjunktiv = new String[6];
	
	public static String[] endungenplusqaktiv = {"ueram", "ueras", "uerat", "ueramus", "ueratis", "uerant"};
	public static String[] endungenplusqaktivkonjunktiv = {"uissem", "uisses", "uisset", "uissemus", "uissetis", "uissent"};
	public static String[] endungenplusqpassiv = {"itus eram", "itus eras", "itus erat", "iti eramus", "iti eratis", "iti erant"};
	public static String[] endungenplusqpassivkonjunktiv = {"itus essem", "itus esses", "itus esset", "iti essemus", "iti essetis", "iti essent"};
	
	public static String[] endungenplusqsaktiv = {"seram", "seras", "serat", "seramus", "seratis", "serant"};
	public static String[] endungenplusqsaktivkonjunktiv = {"sissem", "sisses", "sisset", "sissemus", "sissetis", "sissent"};
	public static String[] endungenplusqspassiv = {"sus eram", "sus eras", "sus erat", "si eramus", "si eratis", "si erant"};
	public static String[] endungenplusqspassivkonjunktiv = {"sus essem", "sus esses", "sus esset", "si essemus", "si essetis", "si essent"};
	
	//-------------------------------------------------------------------------------------------------
	//-----------------------------------FUTUR I-------------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	public static String[] futurIaktiv = new String[6];
	public static String[] futurIpassiv = new String[6];
	
	public static String[] endungenfuturIaktiv = {"ebo", "ebis", "ebit", "ebimus", "ebitis", "ebunt"};
	public static String[] endungenfuturIpassiv = {"ebor", "eberis", "ebitur", "ebimur", "ebimini", "ebuntur"};
	
	//--------------------------------------------------------------------------------------------------
	//--------------------------------------FUTUR II----------------------------------------------------
	//--------------------------------------------------------------------------------------------------
	public static String[] futurIIaktiv = new String[6];
	public static String[] futurIIpassiv = new String[6];
	
	public static String[] endungenfuturIIaktiv = {"uero", "ueris", "uerit", "uerimus", "ueritis", "uerint"};
	public static String[] endungenfuturIIpassiv = {"itus ero", "itus eris", "itus erit", "iti erimus", "iti eritis", "iti erunt"};
	
	public static String[] endungenfuturIIsaktiv = {"sero", "seris", "serit", "serimus", "seritis", "serint"};
	public static String[] endungenfuturIIspassiv = {"sus ero", "sus eris", "sus erit", "si erimus", "si eritis", "si erunt"};
	
	
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
	}
	
	static void formens(int z) {
		for (int i = 0; i<6; i++) {
			präsensaktivindikativ[i] = e.rverbenespn()[z] + endungenpräsensaktiv[i];
			System.out.println(präsensaktivindikativ[i]);
			
			präsensaktivkonjunktiv[i] = e.rverbenespn()[z] + endungenpräsensaktivkonjunktiv[i];
			System.out.println(präsensaktivkonjunktiv[i]);
			
			präsenspassivindikativ[i] = e.rverbenespn()[z] + endungenpräsenspassiv[i];
			System.out.println(präsenspassivindikativ[i]);
			
			präsenspassivkonjunktiv[i] = e.rverbenespn()[z] + endungenpräsenspassivkonjunktiv[i];
			System.out.println(präsenspassivkonjunktiv[i]);
			
			imperfektaktivindikativ[i] = e.rverbenespn()[z] + endungenimperfektaktiv[i];
			System.out.println(imperfektaktivindikativ[i]);
			
			imperfektaktivkonjunktiv[i] = e.rverbenespn()[z] + endungenimperfektaktivkonjunktiv[i];
			System.out.println(imperfektaktivkonjunktiv[i]);
			
			imperfektpassivindikativ[i] = e.rverbenespn()[z] + endungenimperfektpassiv[i];
			System.out.println(imperfektpassivindikativ[i]);
			
			imperfektpassivkonjunktiv[i] = e.rverbenespn()[z] + endungenimperfektpassivkonjunktiv[i];
			System.out.println(imperfektpassivkonjunktiv[i]);
			
			futurIaktiv[i] = e.rverbenespn()[z] + endungenfuturIaktiv[i];
			System.out.println(futurIaktiv[i]);
			
			futurIpassiv[i] = e.rverbenespn()[z] + endungenfuturIpassiv[i];
			System.out.println(futurIpassiv[i]);
			
			perfektaktivindikativ[i] = e.rverbenes()[z] + endungenperfektaktivs[i];
			System.out.println(perfektaktivindikativ[i]);
			
			perfektaktivkonjunktiv[i] = e.rverbenes()[z] + endungenperfektaktivskonjunktiv[i];
			System.out.println(perfektaktivkonjunktiv[i]);
			
			perfektpassivindikativ[i] = e.rverbenes()[z] + endungenperfektpassivs[i];
			System.out.println(perfektpassivindikativ[i]);
			
			perfektpassivkonjunktiv[i] = e.rverbenes()[z] + endungenperfektpassivskonjunktiv[i];
			System.out.println(perfektpassivkonjunktiv[i]);
			
			plusquamperfektaktivindikativ[i] = e.rverbenes()[z] + endungenplusqsaktiv[i];
			System.out.println(plusquamperfektaktivindikativ[i]);
			
			plusquamperfektaktivkonjunktiv[i] = e.rverbenes()[z] + endungenplusqsaktivkonjunktiv[i];
			System.out.println(plusquamperfektaktivkonjunktiv[i]);
			
			plusquamperfektpassivindikativ[i] = e.rverbenes()[z] + endungenplusqspassiv[i];
			System.out.println(plusquamperfektpassivindikativ[i]);
			
			plusquamperfektpassivkonjunktiv[i] = e.rverbenes()[z] + endungenplusqspassivkonjunktiv[i];
			System.out.println(plusquamperfektpassivkonjunktiv[i]);
			
			futurIIaktiv[i] =  e.rverbenes()[z] + endungenfuturIIsaktiv[i];
			System.out.println(futurIIaktiv[i]);
			
			futurIIpassiv[i] =  e.rverbenes()[z] + endungenfuturIIspassiv[i];
			System.out.println(futurIIpassiv[i]);
		}
		
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
