package verwaltung;

import java.util.Scanner;

public class Wochenplan {

	public static void main(String[] args) {

		int tagNr = 0;
		Termin[][] termine = new Termin[7][48];

		Scanner sc = new Scanner(System.in);

		System.out.printf(
				"Geben sie den Wochentag ein, an dem sie einen Termin hinzufügen wollen%n(Montag = 1, Dienstag = 2; Mittwoch = 3, Donnerstag = 4, Freitag = 5; Samstag = 6, Sonntag = 7)");
		int tag = sc.nextInt();

		System.out.println("Geben sie die Start- und Enduhrzeit an (z.B. 13:30 Uhr als 13,5)");
		double beginn = sc.nextDouble();
		double ende = sc.nextDouble();

		System.out.println("Geben sie den Namen des Termins ein");
		String TerminBezeichner = sc.next();

	}
}
