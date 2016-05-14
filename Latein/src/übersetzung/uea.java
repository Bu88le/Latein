package übersetzung;
import frames.*;
import wörter.akonjugation;

import javax.swing.JOptionPane;

public class uea {
	
	static String gv;
	static int zähler;
	public static StringBuffer stringbuffer = new StringBuffer();
	public static String ss = "";
	
	public uea(String s) {
		gv = s;
		auswahl();
	}
	
	static String[] a = {"laudo", "laudare", "loben", "preisen", "anpreisen", "gutheißen", "rühmen"};
	static String[] b = {"pecco", "peccare", "sündigen", "(etwas) verkehrt machen", "einen Fehler machen", "schuldig machen"}; 
	static String[] c = {"laboro", "laborare", "arbeiten", "leiden", "abmühen", "sich anstrengen", "sich mühen"};
	static String[] d = {"amo", "amare", "lieben, ", "mögen"};
	static String[] e = {"abalieno", "<u><b><font color=\"#FF0000\">abalienare</font></u></b>", "veräußern", "abtreten", "berauben ", "abtrünnig machen", "entfremden ", " ", "<font color=\"#6E6E6E\">aliquem re ~ :</font>", "jmd. einer Sache berauben", " ", "<font color=\"#6E6E6E\">aliquem iure civium ~ :</font>",  "jmd. das Bürgerrecht wegnehmen", " ", "<font color=\"#6E6E6E\">aliquem ab aliquo / alicui ~ :</font>", "jn. jdm. entfremden"};
	
	static String[] f = {"abdico", "<u><b><font color=\"#FF0000\">abdicare</font></u></b>", "lossagen ", "verstoßen", "abschaffen", "niederlegen", "aufgeben", " ", "<font color=\"#6E6E6E\">se tutela ~ :</font>", "sich von der Unterhaltungspflicht lossagen", " ", "<font color=\"#6E6E6E\">filium ~ :</font>", "seinen Sohn verstoßen", "<font color=\"#6E6E6E\">~ munus / ~ se a munere :</font>",  "ein Amt niederlegen / abdanken"};
	static String[] g = {"abequito", "<u><b><font color=\"#FF0000\">abequitare</font></u></b>", "wegreiten"};
	static String[] h = {"aberro", "<u><b><font color=\"#FF0000\">aberrare</font></u></b>", "sich verirren", "abkommen", "abweichen/abschweifen ", "sich irren ", "zerstreut sein"," ", "<font color=\"#6E6E6E\">~ re / ~ a re :</font>", "von etw. abkommen", "<font color=\"#6E6E6E\">a regula ~ :</font>", "von der Regel abschweifen/abkommen", " ", "<font color=\"#6E6E6E\">a sententia ~ :</font>", "von seiner Meinung abschweifen/abkommen", " ", "<font color=\"#6E6E6E\">~ re :</font>", "sich in einer Sache irren", " ", "<font color=\"#6E6E6E\">~ coniectura :</font>", "sich in seiner Vermutung irren"};
	static String[] i = {"abiudico", "<u><b><font color=\"#FF0000\">abiudicare</font></u></b>", "richterlich aberkennen", "absprechen", " ", "<font color=\"#6E6E6E\">~ aliquid ab aliquo/alicui:</font>", "jmd. etw. absprechen"};
	static String[] j = {"abiuro", "<u><b><font color=\"#FF0000\">abiurare</font></u></b>", "abschwören", "verleugnen"};
	
	static String[] k = {"ablego", "<u><b><font color=\"#FF0000\">ablegare</font></u></b>", "wegschicken", "entfernen", "abkommandieren"};
	static String[] l = {"abloco", "<u><b><font color=\"#FF0000\">ablocare</font></u></b>", "verpachten", "vermieten"};
	static String[] m = {"abnego", "<u><b><font color=\"#FF0000\">abnegare</font></u></b>", "abschlagen", "verweigern"};
	static String[] n = {"abnocto", "<u><b><font color=\"#FF0000\">abnoctare</font></u></b>", "auswärts übernachten"};
	static String[] o = {"abnuto", "<u><b><font color=\"#FF0000\">abnutare</font></u></b>", "heftig abwinken", "ablehnen"};
	
	static String[] p = {"abomino", "<u><b><font color=\"#FF0000\">abominare</font></u></b>", "verwünschen", "verabscheuen", " ", "<font color=\"#6E6E6E\">quod abominor! :</font>", "was Gott verhüte!", " ", "<font color=\"#6E6E6E\">abominandus:</font>", "verabscheuungswürdig"};
	static String[] q = {"abrogo", "<u><b><font color=\"#FF0000\">abrogare</font></u></b>", "durch Volksbeschluss wegnehmen" , "entziehen", "durch Volksbeschluss abschaffen", "beseitigen", " ", "<font color=\"#6E6E6E\">alicui magistratum ~ :</font>", "jmd. ein Amt wegnehmen", " ", "<font color=\"#6E6E6E\">alicui fidem ~ :</font>", "jmd. die Treue entziehen", " ", "<font color=\"#6E6E6E\">legem ~ :</font>", "ein Gesetz aufheben", "ein Gesetz abschaffen"};
	static String[] r = {"absto", "<u><b><font color=\"#FF0000\">abstare</font></u></b>", "abseits stellen", "fernhalten"};
	static String[] s = {"abundo", "<u><b><font color=\"#FF0000\">abundare</font></u></b>", "überfließen", "über die Ufer treten", "(im) Überfluss haben", "(über)reich sein", " ", "<font color=\"#6E6E6E\">~ re :</font>", "an etw. (über)reich sein", "überladen sein","zu weit gehen", "reichlich vorhanden sein", " ", "<font color=\"#6E6E6E\">regio lacte et melle abundant :</font>", "die Gegend fließt über von Milch und Honig", " ", "omnia abundant", "alles ist reichlich vorhanden"};
	static String[] t = {"accelo", "<u><b><font color=\"#FF0000\">accelare</font></u></b>", "beschleunigen", "herbeieilen", " ", "<font color=\"#6E6E6E\">iter ~ :</font> ", "den Marsch beschleunigen"};
	
	static String[] u = {"acclamo", "<u><b><font color=\"#FF0000\">acclamare</font></u></b>", "(höhnisch oder beifällig) zurufen", "ausrufen", "(laut) bezeichnen", " ", "<font color=\"#6E6E6E\">~ (+ dopp. Akk.):</font>", "jmd. als etw. bezeichnen", " ", "<font color=\"#6E6E6E\">aliquem imperatorem ~ :</font>", "jmd. als Kaiser ausrufen", " ", "<font color=\"#6E6E6E\">aliquem nocentem ~ ::</font>", "jmd. als schuldig bezeichnen"};
	static String[] v = {"acclaro", "<u><b><font color=\"#FF0000\">acclarare</font></u></b>", "klarmachen", "offenbaren", " ", "<font color=\"#6E6E6E\">signa certa ~ :</font>", "die Vorzeichen als sicher auslegen"};
	static String[] w = {"acclino", "<u><b><font color=\"#FF0000\">acclinare</font></u></b>", "anlehnen", " ", "<font color=\"#6E6E6E\">se ~ ad aliquem :</font>", "sich an jmd. anlehnen", " ", "<font color=\"#6E6E6E\">ad causam senatus ~ :</font>", "zur Haltung des Senats neigen", " ", "<font color=\"#6E6E6E\">castra tumulo acclinata :</font>", "an einen Hügel geschmiegtes Lager"}; 
	static String[] x = {"accommodo", "<u><b><font color=\"#FF0000\">accommodare</font></u></b>", "anlegen", "anfügen", "anpassen", "angleichen", " ", "<font color=\"#6E6E6E\">aliquid alicui ~ :</font>", "etw. an jmd. anlegen", " ", "<font color=\"#6E6E6E\">sibi coronam ad caput ~ :</font>", "sich einen Kranz auf das Haupt setzen", " ", "<font color=\"#6E6E6E\">sumptus ad mercedem ~ :</font>", "die Ausgaben den Einnahmen angleichen", " ", "<font color=\"#6E6E6E\">orationem auribus audientium ~ :</font>", "eine Rede auf die Zuhörer abstimmen", " ", "<font color=\"#6E6E6E\">diis effigiem ~ :</font>", "sich ein Bild von den Göttern machen", " ", "<font color=\"#6E6E6E\">alicui verba ~ :</font>", "jmd. die Worte in den Mund legen", " ", "<font color=\"#6E6E6E\">se ad aliquid ~ :</font>", "sich nach etw. richten", " ", "<font color=\"#6E6E6E\">se ad popularem intelligentiam ~ :</font>", "sich nach dem Verständnis des Volkes richten", " ", "<font color=\"#6E6E6E\">in aliquid ~ :</font>", "auf etw. andwenden/beziehen", " ", "<font color=\"#6E6E6E\">exordium in plures causas ~ :</font>", "eine Rede auf mehrere Gesichtspunkte hin anlegen", " ", "<font color=\"#6E6E6E\">~ ad aliquid/alicui rei :</font>", "auf etw. verwenden / einer Sache widmen", " ", "<font color=\"#6E6E6E\">operam studiis ~ :</font>", "Mühe auf die Studien verwenden", " ", "<font color=\"#6E6E6E\">se ad re publicam ~ :</font>", "sich dem Staatsdienst widmen"};
	static String[] y = {"accubo", "<u><b><font color=\"#FF0000\">accubare</font></u></b>", "lagern", "liegen", "(bei Tisch) liegen", " ", "<font color=\"#6E6E6E\">alicui rei / re ~ :</font>", "bei etw./in etw. liegen", " ", "<font color=\"#6E6E6E\">umbra ~ :</font>", "im Schatten liegen", " ", "<font color=\"#6E6E6E\">apud aliquem ~ :</font>", "bei jmd. zu Gast sein", " ", "<font color=\"#6E6E6E\">cum aliquo ~ :</font>", "jmd. zum Tischnachbarn haben", " ", "<font color=\"#6E6E6E\">alicui ~ :</font>", "mit jmd. schlafen"};
	
	static String[] z = {"accumulo", "<u><b><font color=\"#FF0000\">accumulare</font></u></b>", "aufhäufen", "überhäufen", "steigern", " ", "<font color=\"#6E6E6E\">aliquem honoribus ~ :</font>", "jmd. mit Ehren überhäufen", " ", "<font color=\"#6E6E6E\">caedem caede ~ :</font>", "das Blutbad durch ein weiteres Blutbad steigern"};
	static String[] aa = {"accuro", "<u><b><font color=\"#FF0000\">accurare</font></u></b>", "sorgfältig betreiben", "pünktlich besorgen", "gut bewirten"};
	static String[] ab = {"accuso", "<u><b><font color=\"#FF0000\">accusare</font></u></b>", "(vor Gericht) anklagen", "beschuldigen", " ", "<font color=\"#6E6E6E\">aliquem alicuius rei ~ :</font>", "jmd. wegen einer Sache anklagen/beschuldigen", " ", "<font color=\"#6E6E6E\">proditionis ~ :</font>", "wegen Gewalttätigkeit/Giftmischerei anklagen", " ", "<font color=\"#6E6E6E\">inter sicarios ~ :</font>", "wegen Meuchelmordes anklagen", " ", "<font color=\"#6E6E6E\">capitis ~ :</font>", "auf Leben und Tod anklagen", " ", "<font color=\"#6E6E6E\">aliquem/aliquid ~ :</font>", "jmd./etw. tadeln, sich über jmd./etw. beklagen", " ", "<font color=\"#6E6E6E\">de/in re / alicuius rei ~ :</font>", "wegen etw. tadeln", " ", "<font color=\"#6E6E6E\">superbiam alicuius ~ :</font>", "jmds. Hochmut tadeln", " ", "<font color=\"#6E6E6E\">consulem segnitatis ~ :</font>", "den Konsul wegen seiner Trägheit tadeln", " ", "<font color=\"#6E6E6E\">me accusas, cur/quod ... :</font>", "du tadelst mich, weil..."}; 
	static String[] ac = {"accusito", "<u><b><font color=\"#FF0000\">accusitare</font></u></b>", "anklagen"};
	static String[] ad = {"acerbo", "<u><b><font color=\"#FF0000\">acerbare</font></u></b>", "verbittern", "verschlimmern"};
	
	static String[] ae = {"acervo", "<u><b><font color=\"#FF0000\">acervare</font></u></b>", "häufen", "aufhäufen", " ", "<font color=\"#6E6E6E\">alias super alias leges ~ :</font>", "Gesetze über Gesetze erlassen"};
	static String[] af = {"adaequo", "<u><b><font color=\"#FF0000\">adaequare</font></u></b>", "gleichmachen", "gleichsetzen", "vergleichen", "gleichkommen", "erreichen", " ", "<font color=\"#6E6E6E\">aliquid alicui rei ~ :</font>", " etw. einer Sache gleichmachen", " ", "<font color=\"#6E6E6E\">tecta solo ~ :</font>", "Gebäude dem Erdboden gleichmachen", " ", "<font color=\"#6E6E6E\">aliquid alicui/cum re ~ :</font>", "etw. mit etw. gleichsetzen", " ", "<font color=\"#6E6E6E\">fortunam cum virtute ~ :</font>", "das Glück mit der Tüchtigkeit gleichsetzen", " ", "<font color=\"#6E6E6E\">aliquid cum re/alicui rei ~ :</font>", "etw. mit etw. vergleichen", " ", "<font color=\"#6E6E6E\">genus mortis magni Alexandri fatis ~ :</font>", "Die Todesart Alexanders des Großen mit seinem Schicksal vergleichen", " ", "<font color=\"#6E6E6E\">aliquid ~ :</font>", "einer Sache gleichkommen", " ", "<font color=\"#6E6E6E\">aliquid ~ :</font>", "etw. erreichen", " ", "<font color=\"#6E6E6E\">cursum equorum ~ :</font>", "mit dem Lauf der Pferde Schritt halten", " ", "<font color=\"#6E6E6E\">urna adaequat :</font>", "es liegt Stimmengleichheit vor"}; 
	static String[] ag = {"adaggero", "<u><b><font color=\"#FF0000\">adaggerare</font></u></b>", "anhäufen", "aufhäufen", " ", "<font color=\"#6E6E6E\">terram ~ :</font>", "Erde anhäufen"};
	static String[] ah = {"adalligo", "<u><b><font color=\"#FF0000\">adalligare</font></u></b>", "anbinden", " ", "<font color=\"#6E6E6E\">aliquid alicui / alicui rei / ad aliquid  ~ :</font>", "etw. an jmd./an etw. andbinden"};
	static String[] ai = {"adamo", "<u><b><font color=\"#FF0000\">adamare</font></u></b>", "lieb gewinnen", "sich verlieben in"};
	
	static String[] aj = {"adambulo", "<u><b><font color=\"#FF0000\">adambulare</font></u></b>", "auf und ab gehen", " ", "<font color=\"#6E6E6E\">alicui ~ :</font>", "neben jmd./bei jmd. auf und ab gehen", " ", "<font color=\"#6E6E6E\">alicui rei ~ :</font>", "neben etw/bei etw. auf und abgehen"};
	static String[] ak = {"adapto", "<u><b><font color=\"#FF0000\">adaptare</font></u></b>", "anpassen", "passend machen"};
	static String[] al = {"adaquo", "<u><b><font color=\"#FF0000\">adaquare</font></u></b>", "zur Tränke führen", "bewässern", "benetzen", " ", "<b><font color=\"#6E6E6E\">Passiv: adaquari</font></b>", "Wasser holen"};
	static String[] am = {"adhorto", "<u><b><font color=\"#FF0000\">adhortari</font></u></b>", "aufmuntern", "ermahnen", " ", "<font color=\"#6E6E6E\">ad aliquid / in aliquid ~ :</font>", "zu etw. aufmuntern", " ", "<font color=\"#6E6E6E\">de re ~ ut/ne :</font> ", "in Bezug auf etw. ermahnen", " ", "<font color=\"#6E6E6E\">ad defendam rem publicam ~ :</font>", "zur Verteidigung des Staates ermahnen", " ", "<font color=\"#6E6E6E\">de re frumentaria ~ :</font>", "an die Getreideversorgung erinnern"};
	static String[] an = {"adinspecto", "<u><b><font color=\"#FF0000\">adinspectare</font></u></b>", "mit ansehen"};
	
	static String[] ao = {"adiudico", "<u><b><font color=\"#FF0000\">adiudicare</font></u></b>", "zuerkennen", "zusprechen", "zuschreiben", " ", "<font color=\"#6E6E6E\">alicui aliquid ~ :</font>", "jmd. etw. zusprechen", " ", "<font color=\"#6E6E6E\">agrum populo ~ :</font>", "das Land dem Volk zusprechen", " ", "<font color=\"#6E6E6E\">causam alicui ~ :</font>", "den Prozess zu jdms. Gunsten entscheiden", " ", "<font color=\"#6E6E6E\">alicui salutem orbis terrarum ~ :</font>", "jmd. die Rettung des Erdkreises zuschreiben"};
	static String[] ap = {"adiuro", "<u><b><font color=\"#FF0000\">adiurare</font></u></b>", "dazu noch schwören", "unter Schwur hinzufügen","beschwören", "eidlich versichern", "schwören", "flehentlich bitten", "beschwören", " ", "<font color=\"#6E6E6E\">aliquid ~ :</font>", "etw. beschwören (+AcI)", " ", "<font color=\"#6E6E6E\">per aliquem/aliquem/aliquid ~ :</font>", "bei jmd./etw. schwören)", " ", "<font color=\"#6E6E6E\">per deos ~ :</font>", "bei den Göttern schwören", " ", "<font color=\"#6E6E6E\">caput alicuius ~ :</font>", "bei jmds. Haupt schwören"};
	static String[] aq = {"adiuto", "<u><b><font color=\"#FF0000\">adiutare</font></u></b>", "<font color=\"#6E6E6E\">aliuem ~ :</font>", "jmd. helfen", "jmd. unterstützen"};
	static String[] ar = {"adiuvo", "<u><b><font color=\"#FF0000\">adiuvare</font></u></b>", "moralisch aufrichten", "ermutigen", "fördern", "nähren", "förderlich sein", "hilfreich sein", " ", "<font color=\"#6E6E6E\">aliquem ~ :</font>", "jmd. helfen", "jmd. unterstützen", " ", "<font color=\"#6E6E6E\">in re/de re/ad aliquid ~ :</font>", "in etw./bei etw. untersützen", " ", "<font color=\"#6E6E6E\">ut/ne :</font>", "darin", "dass/dass nicht", " ", "<font color=\"#6E6E6E\">ad bellum ~ :</font>", "beim Krieg unterstützen", " ", "<font color=\"#6E6E6E\">ad verum probandum ~ :</font>", "bei der Untersuchung der Wahrheit helfen", " ", "<font color=\"#6E6E6E\">clamore milites ~ :</font>", "die Soldaten durch Geschrei moralisch aufrichten", " ", "<font color=\"#6E6E6E\">ignem amoris ~ :</font>", "das Feuer der Liebe schüren", " ", "<font color=\"#6E6E6E\">formam cura ~ :</font>", "die Schönheit durch Pflege fördern", " ", "<font color=\"#6E6E6E\">maerorem orationis lacrimis suis ~ :</font>", "den traurigen Inhalt der Rede durch seine Tränen steigern", " ", "<font color=\"#6E6E6E\">multum ad rem ~ :</font>", "viel zur Sache beitragen", " ", "<font color=\"#6E6E6E\">causae adiuvantes ~ :</font>", "mittelbare Ursachen"};
	
	
	
	
	public static String[][] zg = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, aa, ab, 
			ac, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar};
	
	public static void auswahl() {
		for (int i = 0; i<zg.length; i++) {
		 if (zg[i][0].equals(gv)) {
			 
			ausgabe(i);
			break;
		 }			 
		}
	}
	
	public static void ausgabe(int z) {


		ss = "<html>" + zg[z][1] + " :" + "<p/>" + "<p/>";
				
		for (int i = 2; i < zg[z].length; i++) {
			ss = ss + zg[z][i] + "<p/>";
			if (i == zg[z].length) {
				ss = ss + "<html/>";
			}
		}
		
		new übergabe(ss);
	}
}
