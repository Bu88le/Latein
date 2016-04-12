package übersetzung;
import frames.*;

import javax.swing.JOptionPane;

public class uea {
	
	static String gv;
	static int zähler;
	
	public uea(String s) {
		gv = s;
		auswahl();
	}
	
	static String[] a = {"laudo", "laudare", "loben", "preisen", "anpreisen", "gutheißen", "rühmen"};
	static String[] b = {"pecco", "peccare", "sündigen", "(etwas) verkehrt machen", "einen Fehler machen", "schuldig machen"};
	static String[] c = {"laboro", "laborare", "arbeiten", "leiden", "abmühen", "sich anstrengen", "sich mühen"};
	static String[] d = {"amo", "amare", "lieben, ", "mögen"};
	static String[] e = {"abalieno", "abalienare", "veräußern", "abtreten", "berauben ", "abtrünnig machen", "entfremden ", " ", "aliquem re ~ :", "jmd. einer Sache berauben", " ", "aliquem iure civium ~ :",  "jmd. das Bürgerrecht wegnehmen", " ", "aliquem ab aliquo/alicui ~ :", "jn. jdm. entfremden"};
	static String[] f = {"abdico", "abdicare", "lossagen ", "verstoßen", "abschaffen", "niederlegen", "aufgeben", " ", "se tutela ~ :", "sich von der Unterhaltungspflicht lossagen", " ", "filium ~ :", "seinen Sohn verstoßen", "~ munus / ~ se a munere :",  "ein Amt niederlegen / abdanken"};
	static String[] g = {"abequito", "abequitare", "wegreiten"};
	static String[] h = {"aberro", "aberrare", "sich verirren", "abkommen", "abweichen/abschweifen ", "sich irren ", "zerstreut sein"," ", "~ re / ~ a re :", "von etw. abkommen", "a regula ~ :", "von der Regel abschweifen/abkommen", " ", "a sententia ~ :", "von seiner Meinung abschweifen/abkommen", " ", "~ re :", "sich in einer Sache irren", " ", "~ coniectura :", "sich in seiner Vermutung irren"};
	static String[] i = {"abiudico", "abiudicare", "richterlich aberkennen", "absprechen", " ", "~ aliquid ab aliquo/alicui: ", "jmd. etw. absprechen"};
	static String[] j = {"abiuro", "abiurare", "abschwören", "verleugnen"};
	static String[] k = {"ablego", "ablegare", "wegschicken", "entfernen", "abkommandieren"};
	static String[] l = {"abloco", "ablocare", "verpachten", "vermieten"};
	static String[] m = {"abnego", "abnegare", "abschlagen", "verweigern"};
	static String[] n = {"abnocto", "abnoctare", "auswärts übernachten"};
	static String[] o = {"abnuto", "abnutare", "heftig abwinken", "ablehnen"};
	static String[] p = {"abomino", "abominare", "verwünschen", "verabscheuen", " ", "quod abominor!:", "was Gott verhüte!", " ", "abominandus:", "verabscheuungswürdig"};
	static String[] q = {"abrogo", "abrogare", "durch Volksbeschluss wegnehmen" , "entziehen", "durch Volksbeschluss abschaffen", "beseitigen", " ", "alicui magistratum ~ :", "jmd. ein Amt wegnehmen", " ", "alicui fidem ~ :", "jmd. die Treue entziehen", " ", "legem ~ : ", "ein Gesetz aufheben", "ein Gesetz abschaffen"};
	static String[] r = {"absto", "abstare", "abseits stellen", "fernhalten"};
	static String[] s = {"abundo", "abundare", "überfließen", "über die Ufer treten", "(im) Überfluss haben", "(über)reich sein", " ", "~ re :", "an etw. (über)reich sein", "überladen sein","zu weit gehen", "reichlich vorhanden sein", " ", "regio lacte et melle abundant :", "die Gegend fließt über von Milch und Honig", " ", "omnia abundant", "alles ist reichlich vorhanden"};
	static String[] t = {"accelo", "accelare", "beschleunigen", "herbeieilen", " ", "iter ~ : ", "den Marsch beschleunigen"};
	static String[] u = {"acclamo", "acclamare", "(höhnisch oder beifällig) zurufen", "ausrufen", "(laut) bezeichnen", " ", "~ (+ dopp. Akk.):", "jmd. als etw. bezeichnen", " ", "aliquem imperatorem ~ :", "jmd. als Kaiser ausrufen", " ", "aliquem nocentem ~ :", "jmd. als schuldig bezeichnen"};
	static String[] v = {"acclaro", "acclarare", "klarmachen", "offenbaren", " ", "signa certa ~ :", "die Vorzeichen als sicher auslegen"};
	static String[] w = {"acclino", "acclinare", "anlehnen", " ", "se ~ ad aliquem :", "sich an jmd. anlehnen", " ", "ad causam senatus ~ :", "zur Haltung des Senats neigen", " ", "castra tumulo acclinata :", "an einen Hügel geschmiegtes Lager"}; 
	static String[] x = {"accommodo", "accommodare", "anlegen", "anfügen", "anpassen", "angleichen", " ", "aliquid alicui ~ :", "etw. an jmd. anlegen", " ", "sibi coronam ad caput ~ :", "sich einen Kranz auf das Haupt setzen", " ", "sumptus ad mercedem ~ :", "die Ausgaben den Einnahmen angleichen", " ", "orationem auribus audientium ~ :", "eine Rede auf die Zuhörer abstimmen", " ", "diis effigiem ~ :", "sich ein Bild von den Göttern machen", " ", "alicui verba ~ :", "jmd. die Worte in den Mund legen", " ", "se ad aliquid ~ :", "sich nach etw. richten", " ", "se ad popularem intelligentiam ~ :", "sich nach dem Verständnis des Volkes richten", " ", "in aliquid ~ :", "auf etw. andwenden/beziehen", " ", "exordium in plures causas ~ :", "eine Rede auf mehrere Gesichtspunkte hin anlegen", " ", "~ ad aliquid/alicui rei :", "auf etw. verwenden / einer Sache widmen", " ", "operam studiis ~ :", "Mühe auf die Studien verwenden", " ", "se ad re publicam ~ :", "sich dem Staatsdienst widmen"};
	static String[] y = {"accubo", "accubare", "lagern", "liegen", "(bei Tisch) liegen", " ", "alicui rei / re ~ :", "bei etw./in etw. liegen", " ", "umbra ~ :", "im Schatten liegen", " ", "apud aliquem ~ :", "bei jmd. zu Gast sein", " ", "cum aliquo ~ :", "jmd. zum Tischnachbarn haben", " ", "alicui ~ :", "mit jmd. schlafen"};
	static String[] z = {"accumulo", "accumulare", "aufhäufen", "überhäufen", "steigern", " ", "aliquem honoribus ~ :", "jmd. mit Ehren überhäufen", " ", "caedem caede ~ :", "das Blutbad durch ein weiteres Blutbad steigern"};
	static String[] aa = {"accuro", "accurare", "sorgfältig betreiben", "pünktlich besorgen", "gut bewirten"};
	static String[] ab = {"accuso", "accusare", "(vor Gericht) anklagen", "beschuldigen", " ", "aliquem alicuius rei ~ :", "jmd. wegen einer Sache anklagen/beschuldigen", " ", "proditionis ~ :", "wegen Gewalttätigkeit/Giftmischerei anklagen", " ", "inter sicarios ~ :", "wegen Meuchelmordes anklagen", " ", "capitis ~ :", "auf Leben und Tod anklagen", " ", "aliquem/aliquid ~ :", "jmd./etw. tadeln, sich über jmd./etw. beklagen", " ", "de/in re / alicuius rei ~ :", "wegen etw. tadeln", " ", "superbiam alicuius ~ :", "jmds. Hochmut tadeln", " ", "consulem segnitatis ~ :", "den Konsul wegen seiner Trägheit tadeln", " ", "me accusas, cur/quod ... :", "du tadelst mich, weil..."}; 
	static String[] ac = {"accusito", "accusitare", "anklagen"};
	static String[] ad = {"acerbo", "acerbare", "verbittern", "verschlimmern"};
	static String[] ae = {"acervo", "acervare", "häufen", "aufhäufen", " ", "alias super alias leges ~ :", "Gesetze über Gesetze erlassen"};
	static String[] af = {"adaequo", "adaequare", "gleichmachen", "gleichsetzen", "vergleichen", "gleichkommen", "erreichen", " ", "aliquid alicui rei ~ :", " etw. einer Sache gleichmachen", " ", "tecta solo ~ :", "Gebäude dem Erdboden gleichmachen", " ", "aliquid alicui/cum re ~ :", "etw. mit etw. gleichsetzen", " ", "fortunam cum virtute ~ :", "das Glück mit der Tüchtigkeit gleichsetzen", " ", "aliquid cum re/alicui rei ~ :", "etw. mit etw. vergleichen", " ", "genus mortis magni Alexandri fatis ~ :", "Die Todesart Alexanders des Großen mit seinem Schicksal vergleichen", " ", "aliquid ~ :", "einer Sache gleichkommen", " ", "aliquid ~ :", "etw. erreichen", " ", "cursum equorum ~ :", "mit dem Lauf der Pferde Schritt halten", " ", "urna adaequat :", "es liegt Stimmengleichheit vor"}; 
	static String[] ag = {"adaggero", "adaggerare", "anhäufen", "aufhäufen", " ", "terram ~ :", "Erde anhäufen"};
	static String[] ah = {"adalligo", "adalligare", "anbinden", " ", "aliquid alicui / alicui rei / ad aliquid  ~ :", "etw. an jmd./an etw. andbinden"};
	static String[] ai = {"adamo", "adamare", "lieb gewinnen", "sich verlieben in"};
	static String[] aj = {"adambulo", "adambulare", "auf und ab gehen", " ", "alicui ~ :", "neben jmd./bei jmd. auf und ab gehen", " ", "alicui rei ~ :", "neben etw/bei etw. auf und abgehen"};
	static String[] ak = {"adapto", "adaptare", "anpassen", "passend machen"};
	static String[] al = {"adaquo", "adaquare", "zur Tränke führen", "bewässern", "benetzen", " ", "Passiv: adaquari", "Wasser holen"};
	static String[] am = {"adhorto", "adhortari", "aufmuntern", "ermahnen", " ", "ad aliquid / in aliquid ~ :", "zu etw. aufmuntern", " ", "de re ~ ut/ne : ", "in Bezug auf etw. ermahnen", " ", "ad defendam rem publicam ~ :", "zur Verteidigung des Staates ermahnen", " ", "de re frumentaria ~ :", "an die Getreideversorgung erinnern"};
	static String[] an = {"adinspecto", "adinspectare", "mit ansehen"};
	static String[] ao = {"adiudico", "adiudicare", "zuerkennen", "zusprechen", "zuschreiben", " ", "alicui aliquid ~ :", "jmd. etw. zusprechen", " ", "agrum populo ~ :", "das Land dem Volk zusprechen", " ", "causam alicui ~ :", "den Prozess zu jdms. Gunsten entscheiden", " ", "alicui salutem orbis terrarum ~ :", "jmd. die Rettung des Erdkreises zuschreiben"};
	static String[] ap = {"adiuro", "adiurare", "dazu noch schwören", "unter Schwur hinzufügen","beschwören", "eidlich versichern", "schwören", "flehentlich bitten", "beschwören", " ", "aliquid ~ :", "etw. beschwören (+AcI)", " ", "per aliquem/aliquem/aliquid ~ :", "bei jmd./etw. schwören)", " ", "per deos ~ :", "bei den Göttern schwören", " ", "caput alicuius ~ :", "bei jmds. Haupt schwören"};
	static String[] aq = {"adiuto", "adiutare", "aliuem ~ :", "jmd. helfen", "jmd. unterstützen"};
	static String[] ar = {"adiuvo", "adiuvare", "moralisch aufrichten", "ermutigen", "fördern", "nähren", "förderlich sein", "hilfreich sein", " ", "aliquem ~ :", "jmd. helfen", "jmd. unterstützen", " ", "in re/de re/ad aliquid ~ :", "in etw./bei etw. untersützen", " ", "ut/ne", "darin", "dass/dass nicht", " ", "ad bellum ~ :", "beim Krieg unterstützen", " ", "ad verum probandum ~ :", "bei der Untersuchung der Wahrheit helfen", " ", "clamore milites ~ :", "die Soldaten durch Geschrei moralisch aufrichten", " ", "ignem amoris ~ :", "das Feuer der Liebe schüren", " ", "formam cura ~ :", "die Schönheit durch Pflege fördern", " ", "maerorem orationis lacrimis suis ~ :", "den traurigen Inhalt der Rede durch seine Tränen steigern", "multum ad rem ~", "viel zur Sache beitragen", " ", "causae adiuvantes", "mittelbare Ursachen"};
	
	
	
	
	public static String[][] zg = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, aa, ab, 
			ac, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar};
	
	public static void auswahl() {
		for (int i = 0; i<zg.length; i++) {
		 if (zg[i][0].equals(gv)) {
			
			System.out.println("jei");
			ausgabe(i);
			break;
		 }
		 
		 
		}
	}
	
	public static void ausgabe(int z) {
		StringBuffer s = new StringBuffer();
		s.append(zg[z][1]);
		s.append(" : ");
		s.append("\n");
		s.append("\n");
		
		for (int i = 2; i < zg[z].length; i++) {
			s.append(zg[z][i]);
			s.append("\n");
		}
		
		JOptionPane.showMessageDialog(null, s, framemain.tfield1.getText(), JOptionPane.INFORMATION_MESSAGE);
	}

	

}
