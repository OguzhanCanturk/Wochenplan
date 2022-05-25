package verwaltung;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Termin[][] termine = new Termin[7][48];

		menu();
		programm(termine);
	}

	public static void menu() {

		System.out.println("Was möchtest du tun?");
		System.out.println("Tippe A, um einen neuen Termin zu erstellen");
		System.out.println("Tippe B, um einen Termin umzubennen");
		System.out.println("Tippe C, um den Stundenplan auszugeben");
		System.out.println("Tippe E für Ende");
	}

	public static void programm(Termin[][] termine) {

		Scanner sc = new Scanner(System.in);

		String funct = sc.next();

		switch (funct) {
		case "A":
			System.out.printf(
					"Geben sie den Wochentag ein, an dem sie einen Termin hinzufügen wollen%n(Montag = 1, Dienstag = 2; Mittwoch = 3, Donnerstag = 4, Freitag = 5; Samstag = 6, Sonntag = 7)%n");
			int tag = sc.nextInt();

			System.out.println("Geben sie die Start- und Enduhrzeit an (z.B. 13:30 Uhr als 13,5)");
			int beginn = (int) (sc.nextDouble() * 2);
			int ende = (int) (sc.nextDouble() * 2);

			System.out.println("Geben sie den Namen des Termins ein");
			String TerminBezeichner = sc.next();

			for (int i = beginn; i < ende; i++) {
				termine[tag][i] = addTermin(TerminBezeichner, beginn, ende);
			}
			break;
		case "C":
			printTermine(termine);
			break;
		case "E":
			System.out.println("Thank you for using our software! Bye");
			System.exit(0);
			break;
		default:
			System.out.println("Keine gültige Eingabe!");
			programm(termine);
			break;
		}
		programm(termine);
	}

	public static Termin addTermin(String name, int beginn, int ende) {
		return new Termin(name, beginn, ende);
	}

	public static void printTermine(Termin[][] termine) {
		for (int tag = 0; tag < 7; tag++) {
			for (int i = 0; i < 48; i++) {
				if (termine[tag][i] != null) {
					System.out.println(termine[tag][i]);
					i += termine[tag][i].dauer;
				}
			}
		}
	}
}
