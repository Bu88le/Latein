package �bersetzung;

public class uea {
	
	static String gv;
	static int z�hler;
	public static StringBuffer stringbuffer = new StringBuffer();
	private static String ss = "";
	
	public uea(String s) {
		gv = s;
		auswahl();
	}
	
	static String[] a = {"laudo", "laudare", "loben", "preisen", "anpreisen", "guthei�en", "r�hmen"};
	static String[] b = {"pecco", "peccare", "s�ndigen", "(etwas) verkehrt machen", "einen Fehler machen", "schuldig machen"}; 
	static String[] c = {"laboro", "laborare", "arbeiten", "leiden", "abm�hen", "sich anstrengen", "sich m�hen"};
	static String[] d = {"amo", "amare", "lieben, ", "m�gen"};
	static String[] e = {"abalieno", "<u><b><font color=\"#FF0000\">abalienare</font></u></b>", "ver�u�ern", "abtreten", "berauben ", "abtr�nnig machen", "entfremden ", " ", "<font color=\"#6E6E6E\">aliquem re ~ :</font>", "jmd. einer Sache berauben", " ", "<font color=\"#6E6E6E\">aliquem iure civium ~ :</font>",  "jmd. das B�rgerrecht wegnehmen", " ", "<font color=\"#6E6E6E\">aliquem ab aliquo / alicui ~ :</font>", "jn. jdm. entfremden"};
	
	static String[] f = {"abdico", "<u><b><font color=\"#FF0000\">abdicare</font></u></b>", "lossagen ", "versto�en", "abschaffen", "niederlegen", "aufgeben", " ", "<font color=\"#6E6E6E\">se tutela ~ :</font>", "sich von der Unterhaltungspflicht lossagen", " ", "<font color=\"#6E6E6E\">filium ~ :</font>", "seinen Sohn versto�en", "<font color=\"#6E6E6E\">~ munus / ~ se a munere :</font>",  "ein Amt niederlegen / abdanken"};
	static String[] g = {"abequito", "<u><b><font color=\"#FF0000\">abequitare</font></u></b>", "wegreiten"};
	static String[] h = {"aberro", "<u><b><font color=\"#FF0000\">aberrare</font></u></b>", "sich verirren", "abkommen", "abweichen/abschweifen ", "sich irren ", "zerstreut sein"," ", "<font color=\"#6E6E6E\">~ re / ~ a re :</font>", "von etw. abkommen", "<font color=\"#6E6E6E\">a regula ~ :</font>", "von der Regel abschweifen/abkommen", " ", "<font color=\"#6E6E6E\">a sententia ~ :</font>", "von seiner Meinung abschweifen/abkommen", " ", "<font color=\"#6E6E6E\">~ re :</font>", "sich in einer Sache irren", " ", "<font color=\"#6E6E6E\">~ coniectura :</font>", "sich in seiner Vermutung irren"};
	static String[] i = {"abiudico", "<u><b><font color=\"#FF0000\">abiudicare</font></u></b>", "richterlich aberkennen", "absprechen", " ", "<font color=\"#6E6E6E\">~ aliquid ab aliquo/alicui:</font>", "jmd. etw. absprechen"};
	static String[] j = {"abiuro", "<u><b><font color=\"#FF0000\">abiurare</font></u></b>", "abschw�ren", "verleugnen"};
	
	static String[] k = {"ablego", "<u><b><font color=\"#FF0000\">ablegare</font></u></b>", "wegschicken", "entfernen", "abkommandieren"};
	static String[] l = {"abloco", "<u><b><font color=\"#FF0000\">ablocare</font></u></b>", "verpachten", "vermieten"};
	static String[] m = {"abnego", "<u><b><font color=\"#FF0000\">abnegare</font></u></b>", "abschlagen", "verweigern"};
	static String[] n = {"abnocto", "<u><b><font color=\"#FF0000\">abnoctare</font></u></b>", "ausw�rts �bernachten"};
	static String[] o = {"abnuto", "<u><b><font color=\"#FF0000\">abnutare</font></u></b>", "heftig abwinken", "ablehnen"};
	
	static String[] p = {"abomino", "<u><b><font color=\"#FF0000\">abominare</font></u></b>", "verw�nschen", "verabscheuen", " ", "<font color=\"#6E6E6E\">quod abominor! :</font>", "was Gott verh�te!", " ", "<font color=\"#6E6E6E\">abominandus:</font>", "verabscheuungsw�rdig"};
	static String[] q = {"abrogo", "<u><b><font color=\"#FF0000\">abrogare</font></u></b>", "durch Volksbeschluss wegnehmen" , "entziehen", "durch Volksbeschluss abschaffen", "beseitigen", " ", "<font color=\"#6E6E6E\">alicui magistratum ~ :</font>", "jmd. ein Amt wegnehmen", " ", "<font color=\"#6E6E6E\">alicui fidem ~ :</font>", "jmd. die Treue entziehen", " ", "<font color=\"#6E6E6E\">legem ~ :</font>", "ein Gesetz aufheben", "ein Gesetz abschaffen"};
	static String[] r = {"absto", "<u><b><font color=\"#FF0000\">abstare</font></u></b>", "abseits stellen", "fernhalten"};
	static String[] s = {"abundo", "<u><b><font color=\"#FF0000\">abundare</font></u></b>", "�berflie�en", "�ber die Ufer treten", "(im) �berfluss haben", "(�ber)reich sein", " ", "<font color=\"#6E6E6E\">~ re :</font>", "an etw. (�ber)reich sein", "�berladen sein","zu weit gehen", "reichlich vorhanden sein", " ", "<font color=\"#6E6E6E\">regio lacte et melle abundant :</font>", "die Gegend flie�t �ber von Milch und Honig", " ", "omnia abundant", "alles ist reichlich vorhanden"};
	static String[] t = {"accelo", "<u><b><font color=\"#FF0000\">accelare</font></u></b>", "beschleunigen", "herbeieilen", " ", "<font color=\"#6E6E6E\">iter ~ :</font> ", "den Marsch beschleunigen"};
	
	static String[] u = {"acclamo", "<u><b><font color=\"#FF0000\">acclamare</font></u></b>", "(h�hnisch oder beif�llig) zurufen", "ausrufen", "(laut) bezeichnen", " ", "<font color=\"#6E6E6E\">~ (+ dopp. Akk.):</font>", "jmd. als etw. bezeichnen", " ", "<font color=\"#6E6E6E\">aliquem imperatorem ~ :</font>", "jmd. als Kaiser ausrufen", " ", "<font color=\"#6E6E6E\">aliquem nocentem ~ ::</font>", "jmd. als schuldig bezeichnen"};
	static String[] v = {"acclaro", "<u><b><font color=\"#FF0000\">acclarare</font></u></b>", "klarmachen", "offenbaren", " ", "<font color=\"#6E6E6E\">signa certa ~ :</font>", "die Vorzeichen als sicher auslegen"};
	static String[] w = {"acclino", "<u><b><font color=\"#FF0000\">acclinare</font></u></b>", "anlehnen", " ", "<font color=\"#6E6E6E\">se ~ ad aliquem :</font>", "sich an jmd. anlehnen", " ", "<font color=\"#6E6E6E\">ad causam senatus ~ :</font>", "zur Haltung des Senats neigen", " ", "<font color=\"#6E6E6E\">castra tumulo acclinata :</font>", "an einen H�gel geschmiegtes Lager"}; 
	static String[] x = {"accommodo", "<u><b><font color=\"#FF0000\">accommodare</font></u></b>", "anlegen", "anf�gen", "anpassen", "angleichen", " ", "<font color=\"#6E6E6E\">aliquid alicui ~ :</font>", "etw. an jmd. anlegen", " ", "<font color=\"#6E6E6E\">sibi coronam ad caput ~ :</font>", "sich einen Kranz auf das Haupt setzen", " ", "<font color=\"#6E6E6E\">sumptus ad mercedem ~ :</font>", "die Ausgaben den Einnahmen angleichen", " ", "<font color=\"#6E6E6E\">orationem auribus audientium ~ :</font>", "eine Rede auf die Zuh�rer abstimmen", " ", "<font color=\"#6E6E6E\">diis effigiem ~ :</font>", "sich ein Bild von den G�ttern machen", " ", "<font color=\"#6E6E6E\">alicui verba ~ :</font>", "jmd. die Worte in den Mund legen", " ", "<font color=\"#6E6E6E\">se ad aliquid ~ :</font>", "sich nach etw. richten", " ", "<font color=\"#6E6E6E\">se ad popularem intelligentiam ~ :</font>", "sich nach dem Verst�ndnis des Volkes richten", " ", "<font color=\"#6E6E6E\">in aliquid ~ :</font>", "auf etw. andwenden/beziehen", " ", "<font color=\"#6E6E6E\">exordium in plures causas ~ :</font>", "eine Rede auf mehrere Gesichtspunkte hin anlegen", " ", "<font color=\"#6E6E6E\">~ ad aliquid/alicui rei :</font>", "auf etw. verwenden / einer Sache widmen", " ", "<font color=\"#6E6E6E\">operam studiis ~ :</font>", "M�he auf die Studien verwenden", " ", "<font color=\"#6E6E6E\">se ad re publicam ~ :</font>", "sich dem Staatsdienst widmen"};
	static String[] y = {"accubo", "<u><b><font color=\"#FF0000\">accubare</font></u></b>", "lagern", "liegen", "(bei Tisch) liegen", " ", "<font color=\"#6E6E6E\">alicui rei / re ~ :</font>", "bei etw./in etw. liegen", " ", "<font color=\"#6E6E6E\">umbra ~ :</font>", "im Schatten liegen", " ", "<font color=\"#6E6E6E\">apud aliquem ~ :</font>", "bei jmd. zu Gast sein", " ", "<font color=\"#6E6E6E\">cum aliquo ~ :</font>", "jmd. zum Tischnachbarn haben", " ", "<font color=\"#6E6E6E\">alicui ~ :</font>", "mit jmd. schlafen"};
	
	static String[] z = {"accumulo", "<u><b><font color=\"#FF0000\">accumulare</font></u></b>", "aufh�ufen", "�berh�ufen", "steigern", " ", "<font color=\"#6E6E6E\">aliquem honoribus ~ :</font>", "jmd. mit Ehren �berh�ufen", " ", "<font color=\"#6E6E6E\">caedem caede ~ :</font>", "das Blutbad durch ein weiteres Blutbad steigern"};
	static String[] aa = {"accuro", "<u><b><font color=\"#FF0000\">accurare</font></u></b>", "sorgf�ltig betreiben", "p�nktlich besorgen", "gut bewirten"};
	static String[] ab = {"accuso", "<u><b><font color=\"#FF0000\">accusare</font></u></b>", "(vor Gericht) anklagen", "beschuldigen", " ", "<font color=\"#6E6E6E\">aliquem alicuius rei ~ :</font>", "jmd. wegen einer Sache anklagen/beschuldigen", " ", "<font color=\"#6E6E6E\">proditionis ~ :</font>", "wegen Gewaltt�tigkeit/Giftmischerei anklagen", " ", "<font color=\"#6E6E6E\">inter sicarios ~ :</font>", "wegen Meuchelmordes anklagen", " ", "<font color=\"#6E6E6E\">capitis ~ :</font>", "auf Leben und Tod anklagen", " ", "<font color=\"#6E6E6E\">aliquem/aliquid ~ :</font>", "jmd./etw. tadeln, sich �ber jmd./etw. beklagen", " ", "<font color=\"#6E6E6E\">de/in re / alicuius rei ~ :</font>", "wegen etw. tadeln", " ", "<font color=\"#6E6E6E\">superbiam alicuius ~ :</font>", "jmds. Hochmut tadeln", " ", "<font color=\"#6E6E6E\">consulem segnitatis ~ :</font>", "den Konsul wegen seiner Tr�gheit tadeln", " ", "<font color=\"#6E6E6E\">me accusas, cur/quod ... :</font>", "du tadelst mich, weil..."}; 
	static String[] ac = {"accusito", "<u><b><font color=\"#FF0000\">accusitare</font></u></b>", "anklagen"};
	static String[] ad = {"acerbo", "<u><b><font color=\"#FF0000\">acerbare</font></u></b>", "verbittern", "verschlimmern"};
	
	static String[] ae = {"acervo", "<u><b><font color=\"#FF0000\">acervare</font></u></b>", "h�ufen", "aufh�ufen", " ", "<font color=\"#6E6E6E\">alias super alias leges ~ :</font>", "Gesetze �ber Gesetze erlassen"};
	static String[] af = {"adaequo", "<u><b><font color=\"#FF0000\">adaequare</font></u></b>", "gleichmachen", "gleichsetzen", "vergleichen", "gleichkommen", "erreichen", " ", "<font color=\"#6E6E6E\">aliquid alicui rei ~ :</font>", " etw. einer Sache gleichmachen", " ", "<font color=\"#6E6E6E\">tecta solo ~ :</font>", "Geb�ude dem Erdboden gleichmachen", " ", "<font color=\"#6E6E6E\">aliquid alicui/cum re ~ :</font>", "etw. mit etw. gleichsetzen", " ", "<font color=\"#6E6E6E\">fortunam cum virtute ~ :</font>", "das Gl�ck mit der T�chtigkeit gleichsetzen", " ", "<font color=\"#6E6E6E\">aliquid cum re/alicui rei ~ :</font>", "etw. mit etw. vergleichen", " ", "<font color=\"#6E6E6E\">genus mortis magni Alexandri fatis ~ :</font>", "Die Todesart Alexanders des Gro�en mit seinem Schicksal vergleichen", " ", "<font color=\"#6E6E6E\">aliquid ~ :</font>", "einer Sache gleichkommen", " ", "<font color=\"#6E6E6E\">aliquid ~ :</font>", "etw. erreichen", " ", "<font color=\"#6E6E6E\">cursum equorum ~ :</font>", "mit dem Lauf der Pferde Schritt halten", " ", "<font color=\"#6E6E6E\">urna adaequat :</font>", "es liegt Stimmengleichheit vor"}; 
	static String[] ag = {"adaggero", "<u><b><font color=\"#FF0000\">adaggerare</font></u></b>", "anh�ufen", "aufh�ufen", " ", "<font color=\"#6E6E6E\">terram ~ :</font>", "Erde anh�ufen"};
	static String[] ah = {"adalligo", "<u><b><font color=\"#FF0000\">adalligare</font></u></b>", "anbinden", " ", "<font color=\"#6E6E6E\">aliquid alicui / alicui rei / ad aliquid  ~ :</font>", "etw. an jmd./an etw. andbinden"};
	static String[] ai = {"adamo", "<u><b><font color=\"#FF0000\">adamare</font></u></b>", "lieb gewinnen", "sich verlieben in"};
	
	static String[] aj = {"adambulo", "<u><b><font color=\"#FF0000\">adambulare</font></u></b>", "auf und ab gehen", " ", "<font color=\"#6E6E6E\">alicui ~ :</font>", "neben jmd./bei jmd. auf und ab gehen", " ", "<font color=\"#6E6E6E\">alicui rei ~ :</font>", "neben etw/bei etw. auf und abgehen"};
	static String[] ak = {"adapto", "<u><b><font color=\"#FF0000\">adaptare</font></u></b>", "anpassen", "passend machen"};
	static String[] al = {"adaquo", "<u><b><font color=\"#FF0000\">adaquare</font></u></b>", "zur Tr�nke f�hren", "bew�ssern", "benetzen", " ", "<b><font color=\"#6E6E6E\">Passiv: adaquari</font></b>", "Wasser holen"};
	static String[] am = {"adhorto", "<u><b><font color=\"#FF0000\">adhortari</font></u></b>", "aufmuntern", "ermahnen", " ", "<font color=\"#6E6E6E\">ad aliquid / in aliquid ~ :</font>", "zu etw. aufmuntern", " ", "<font color=\"#6E6E6E\">de re ~ ut/ne :</font> ", "in Bezug auf etw. ermahnen", " ", "<font color=\"#6E6E6E\">ad defendam rem publicam ~ :</font>", "zur Verteidigung des Staates ermahnen", " ", "<font color=\"#6E6E6E\">de re frumentaria ~ :</font>", "an die Getreideversorgung erinnern"};
	static String[] an = {"adinspecto", "<u><b><font color=\"#FF0000\">adinspectare</font></u></b>", "mit ansehen"};
	
	static String[] ao = {"adiudico", "<u><b><font color=\"#FF0000\">adiudicare</font></u></b>", "zuerkennen", "zusprechen", "zuschreiben", " ", "<font color=\"#6E6E6E\">alicui aliquid ~ :</font>", "jmd. etw. zusprechen", " ", "<font color=\"#6E6E6E\">agrum populo ~ :</font>", "das Land dem Volk zusprechen", " ", "<font color=\"#6E6E6E\">causam alicui ~ :</font>", "den Prozess zu jdms. Gunsten entscheiden", " ", "<font color=\"#6E6E6E\">alicui salutem orbis terrarum ~ :</font>", "jmd. die Rettung des Erdkreises zuschreiben"};
	static String[] ap = {"adiuro", "<u><b><font color=\"#FF0000\">adiurare</font></u></b>", "dazu noch schw�ren", "unter Schwur hinzuf�gen","beschw�ren", "eidlich versichern", "schw�ren", "flehentlich bitten", "beschw�ren", " ", "<font color=\"#6E6E6E\">aliquid ~ :</font>", "etw. beschw�ren (+AcI)", " ", "<font color=\"#6E6E6E\">per aliquem/aliquem/aliquid ~ :</font>", "bei jmd./etw. schw�ren)", " ", "<font color=\"#6E6E6E\">per deos ~ :</font>", "bei den G�ttern schw�ren", " ", "<font color=\"#6E6E6E\">caput alicuius ~ :</font>", "bei jmds. Haupt schw�ren"};
	static String[] aq = {"adiuto", "<u><b><font color=\"#FF0000\">adiutare</font></u></b>", "<font color=\"#6E6E6E\">aliuem ~ :</font>", "jmd. helfen", "jmd. unterst�tzen"};
	static String[] ar = {"adiuvo", "<u><b><font color=\"#FF0000\">adiuvare</font></u></b>", "moralisch aufrichten", "ermutigen", "f�rdern", "n�hren", "f�rderlich sein", "hilfreich sein", " ", "<font color=\"#6E6E6E\">aliquem ~ :</font>", "jmd. helfen", "jmd. unterst�tzen", " ", "<font color=\"#6E6E6E\">in re/de re/ad aliquid ~ :</font>", "in etw./bei etw. unters�tzen", " ", "<font color=\"#6E6E6E\">ut/ne :</font>", "darin", "dass/dass nicht", " ", "<font color=\"#6E6E6E\">ad bellum ~ :</font>", "beim Krieg unterst�tzen", " ", "<font color=\"#6E6E6E\">ad verum probandum ~ :</font>", "bei der Untersuchung der Wahrheit helfen", " ", "<font color=\"#6E6E6E\">clamore milites ~ :</font>", "die Soldaten durch Geschrei moralisch aufrichten", " ", "<font color=\"#6E6E6E\">ignem amoris ~ :</font>", "das Feuer der Liebe sch�ren", " ", "<font color=\"#6E6E6E\">formam cura ~ :</font>", "die Sch�nheit durch Pflege f�rdern", " ", "<font color=\"#6E6E6E\">maerorem orationis lacrimis suis ~ :</font>", "den traurigen Inhalt der Rede durch seine Tr�nen steigern", " ", "<font color=\"#6E6E6E\">multum ad rem ~ :</font>", "viel zur Sache beitragen", " ", "<font color=\"#6E6E6E\">causae adiuvantes ~ :</font>", "mittelbare Ursachen"};
	static String[] as = {"admaturo", "<u><b><font color=\"#FF0000\">admaturare</font></u></b>", "noch mehr beschleunigen"};
	
	static String[] at = {"admigro", "<u><b><font color=\"#FF0000\">admigrare</font></u></b>", "hinzukommen"};
	static String[] au = {"adminiculo", "<u><b><font color=\"#FF0000\">adminiculare</font></u></b>","st�tzen", " ", "<font color=\"#6E6E6E\">adminiculum ~ :</font>", "durch Pf�hle st�tzen", " ", "<font color=\"#6E6E6E\">vitem ~ :</font>", "den Weinstock st�tzen", " ", "<font color=\"#6E6E6E\">aliquem/aliquid ~ :</font>", "jmd./etw. unterst�tzen, jmd. beistehen"};
	static String[] av = {"administro", "<u><b><font color=\"#FF0000\">administrare</font></u></b>", "behilflich sein", "lenken, leiten", "verwalten", "besorgen, ausf�hren", "arbeiten", " ", "<font color=\"#6E6E6E\">alicui ad rem divinam ~ :</font>", "jmd. beim Gottesdienst behilflich sein", " ", "<font color=\"#6E6E6E\">navem ~ :</font>", "ein Schiff lenken", " ", "<font color=\"#6E6E6E\">exercitum ~ :</font>", "ein Heer befehligen", " ", "<font color=\"#6E6E6E\">summam rerum ~ :</font>", "den Oberbefehl haben", " ", "<font color=\"#6E6E6E\">rem familiarem ~ :</font>", "das Familienverm�gen verwalten", " ", "<font color=\"#6E6E6E\">rem publicam ~ :</font>", "den Staat regieren", " ", "<font color=\"#6E6E6E\">negotium ~ :</font>", "ein Gesch�ft besorgen", " ", "<font color=\"#6E6E6E\">caedem ~ :</font>", "ein Blutbad anrichten", " ", "<font color=\"#6E6E6E\">ita ~, ut :</font>", "es so einrichten, dass"};
	static String[] aw = {"admiro", "<u><b><font color=\"#FF0000\">admirari</font></u></b>", "bewundern", "anstaunen", "sich wundern", "staunen", " ", "<font color=\"#6E6E6E\">aliquem/aliquid ~ :</font>", "jmd./etw. bewundern", " ", "<font color=\"#6E6E6E\">aliquem in re ~ :</font>", "jmd. f�r etw. bewundern", " ", "<font color=\"#6E6E6E\">res gestas alicuius ~ :</font>", "jmds. Taten bewundern", " ", "<font color=\"#6E6E6E\">aliquem/aliquid/de aliquo/de re ~ :</font>", "�ber jmd./etw. staunen"};
	static String[] ax = {"admodero", "<u><b><font color=\"#FF0000\">admoderari</font></u></b>", "an sich halten", "m��igen", " ", "<font color=\"#6E6E6E\">nequeo risu (dat) admoderarier ~ :</font>", "ich kann mir das Lachen nicht verkneifen"};
	
	static String[] ay = {"admurmuro", "<u><b><font color=\"#FF0000\">admurmurare</font></u></b>", "beif�llig murmeln", "murren"};
	static String[] az = {"admutilo", "<u><b><font color=\"#FF0000\">admutilare</font></u></b>", "verst�mmeln", "hereinlegen"};
	static String[] ba = {"adnato", "<u><b><font color=\"#FF0000\">adnatare</font></u></b>", "heranschwimmen", " ", "<font color=\"#6E6E6E\">ad aliquid/alicui rei ~ :</font>", "an etw. heranschwimmen"};
	static String[] bb = {"adopino", "<u><b><font color=\"#FF0000\">adopinare</font></u></b>", "(dazu) vermuten"};
	static String[] bc = {"adopto", "<u><b><font color=\"#FF0000\">adoptare</font></u></b>", "erw�hlen", "annehmen", "zu Hilfe nehmen", "sich aneignen", "adoptieren", "aneignen", "<font color=\"#6E6E6E\">sibi aliquem defensorem~ :</font>", "sich jmd. als Verteidiger nehmen", " ", "<font color=\"#6E6E6E\">Etruscas opes ~ :</font>", "die Streitkr�fte der Etrusker zu Hilfe holen", " ", "<font color=\"#6E6E6E\">ramus ramum adoptat :</font>", "ein Zweig nimmt einen anderen Zweig auf", " ", "<font color=\"#6E6E6E\">aliquem sibi filium ~ :</font>", "jmd. als Sohn adoptieren", " ", "<font color=\"#6E6E6E\">illum pro filio ~ :</font>", "jenen an Sohnes Statt annehmen", " ", "<font color=\"#6E6E6E\">aliquem a patre ~ :</font>", "jmd. vom (leiblichen) Vater adoptieren", " ", "<font color=\"#6E6E6E\">aliquem in regnum ~ :</font>", "jmd. durch Adoption als Nachfolger berufen", " ", "<font color=\"#6E6E6E\">sibi cognomen ~ :</font>", "sich einen Beinnamen aneignen"};
	
	static String[] bd = {"adoro", "<u><b><font color=\"#FF0000\">adorare</font></u></b>", "anflehen", "erflehen", "verehren", " ", "<font color=\"#6E6E6E\">aliquem aliquid ~ :</font>", "jmd. um etw. anflehen", " ", "<font color=\"#6E6E6E\">pacem deum ~ :</font>", "Gott um Frieden anflehen"," ","<font color=\"#6E6E6E\">Ennium poetam ~ :</font>", "den Dichter Ennius verehren"};
	static String[] be = {"adorno", "<u><b><font color=\"#FF0000\">adornare</font></u></b>", "ausr�sten", "zurechtmachen", "ausstatten", "schm�cken", " ", "<font color=\"#6E6E6E\">naves ~ :</font>", "Schiffe ausr�sten", " ", "<font color=\"#6E6E6E\">accusationem ~ :</font>", "eine Anklage vorbereiten", " ", "<font color=\"#6E6E6E\">maria classibus ~ :</font>", "Meere mit Flotten ausstatten", " ", "<font color=\"#6E6E6E\">forum magnifico ornatu ~ :</font>", "das Forum mit pr�chtigem Aufwand schm�cken"};
	static String[] bf = {"adulo", "<u><b><font color=\"#FF0000\">adulare</font></u></b>", "mit dem Schwanz wedeln", "sich anschmiegen", "sanft abwischen", "streichelnd abwischen", " ", "<font color=\"#6E6E6E\">sanguinem ~ :</font>", "das Blut sanft abwischen", " ", "<font color=\"#6E6E6E\">alicui/aliquem ~ :</font>", "vor jmdn. kriechen", "jmd. schmeicheln", " ", "<font color=\"#6E6E6E\">plebem/plebi ~ :</font>", "dem P�bel schmeicheln"};
	static String[] bg = {"adultero", "<u><b><font color=\"#FF0000\">adulterare</font></u></b>", "die Ehe brechen", "zum Ehebruch verf�hren", "verf�lschen", "nachmachen", " ", "<font color=\"#6E6E6E\">alicui/cum aliquo ~ :</font>", "mit jmd. die Ehe brechen", " ", "<font color=\"#6E6E6E\">adulterari ~ :</font>", "herumhuren", " ", "<font color=\"#6E6E6E\">alicui adulterari :</font>", "mit jmd. herumhuren"," ", "<font color=\"#6E6E6E\">miluo adulterari :</font>", "mit dem Falken herumhuren"," ", "<font color=\"#6E6E6E\">ius civile ~ :</font>", "das B�rgerrecht verf�lschen", " ", "<font color=\"#6E6E6E\">faciem arte ~ :</font>", "das Gesicht k�nstlich ver�ndern"};
	static String[] bh = {"adumbro", "<u><b><font color=\"#FF0000\">adumbrare</font></u></b>", "beschatten", "skizzieren", "schildern", "nachahmen", " ", "<font color=\"#6E6E6E\">Macedonum morem ~ :</font>", "die Art der Makedonen nachahmen"};
	
	static String[]	bi = {"aduno", "<u><b><font color=\"#FF0000\">adunare</font></u></b>", "vereinigen", "verbinden"};
	static String[] bj = {"advecto", "<u><b><font color=\"#FF0000\">advectare</font></u></b>", "zuf�hren"};
	static String[] bk = {"advelo", "<u><b><font color=\"#FF0000\">advelare</font></u></b>", "umh�llen", "bekr�nzen", "<font color=\"#6E6E6E\">tempora viridi lauro ~ :</font>", "die Schl�fen mit frischem Lorbeer bekr�nzen"};
	static String[] bl = {"advento", "<u><b><font color=\"#FF0000\">adventare</font></u></b>", "heranr�cken"};
	static String[] bm = {"advero", "<u><b><font color=\"#FF0000\">adversare</font></u></b>", "st�ndig auf etw. richten", " ", "<font color=\"#6E6E6E\">animum sedulo ~:</font>", "die Aufmerksamkeit eifrig richten(auf)"};
	
	static String[] bn = {};
	
	
	
	public static String[][] zg = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, aa, ab, 
			ac, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar, as, at, au, av, aw, ax, ay, az, ba, bb, bc, bd,
			be, bf, bg, bh, bi, bj, bk, bl, bm};
	
	public static void auswahl() {
		for (int i = 0; i<zg.length; i++) {
		 if (zg[i][0].equals(gv)) {
			 
			ausgabe(i);
			break;
		 }			 
		}
	}
	
	public static void ausgabe(int z) {


		stringbuffer.append("<html>");
		stringbuffer.append(zg[z][1]);
		stringbuffer.append(" : <p/> <p/>");
				
		for (int i = 2; i < zg[z].length; i++) {
			stringbuffer.append(zg[z][i] + "<p/>");
			if (i == zg[z].length) {
				stringbuffer.append("<html/>");
			}
		}

		new �bergabe(stringbuffer.toString());
	}
	
	public static void ausgabeReverse(String s) {
		Start:
		for (int i = 0; i < zg.length; i++) {
			for (int z = 2; z < zg[i].length; z++) {
				if (s.equals(zg[i][z])){
					stringbuffer.append("<html>");
					stringbuffer.append(zg[i][1]);
					stringbuffer.append(" : <p/> <p/>");
					
					for (int t = 2; t < zg[i].length; t++){
						stringbuffer.append(zg[i][t] + "<p/>");
						if (t == zg[i].length) {
							stringbuffer.append("<html/>");
							break Start;
						}
					}
				}
			}
		}
	}
	
	public static StringBuffer getAusgabeReverse() {
		return stringbuffer;
	}
}