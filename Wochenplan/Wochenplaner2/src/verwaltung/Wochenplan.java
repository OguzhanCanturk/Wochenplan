package verwaltung;

public class Wochenplan {
	
	Termin[][] termine = new Termin[7][48];

	public Wochenplan() {
		this(null);
	}
	
	public Wochenplan(Zeitplan plan) {
		if(plan == null)
			return;
		//TODO LOGIK MIT ZEITPLAN AUTOMATISCH TERMINE HINZUFÜGEN
	}
	
	public void addTermin(String name, int tag, int beginn, int ende) {
		for (int i = beginn; i < ende; i++) {
			termine[tag][i] = new Termin(name, beginn, ende);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		boolean anyTermin = false;
		for (int tag = 0; tag < 7; tag++) {
			for (int i = 0; i < 48; i++) {
				if (termine[tag][i] != null) {
					builder.append(termine[tag][i] + "/n");
					System.out.println();
					i += termine[tag][i].dauer;
					anyTermin = true;
				}
			}
		}
		
		if(!anyTermin)
			builder.append("Es wurden noch keine Termine eingetragen");
		
		return builder.toString();
	}
}
