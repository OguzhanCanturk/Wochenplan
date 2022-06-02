package verwaltung;

public class Termin {

	public String name;
	public int beginn;
	public int ende;
	public int dauer;

	public Termin(String name, int beginn, int ende) {
		super();
		this.name = name;
		this.beginn = beginn;
		this.ende = ende;
		dauer = ende - beginn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBeginn() {
		return beginn;
	}

	public void setBeginn(int beginn) {
		this.beginn = beginn;
	}

	public int getEnde() {
		return ende;
	}

	public void setEnde(int ende) {
		this.ende = ende;
	}

	@Override
	public String toString() {
		int beginnStunden = (int) (beginn / 2);
		int endeStunden = (int) (ende / 2);
		int beginnMinuten = (int) (((double) (beginn) / 2 % 1) * 60);
		int endeMinuten = (int) (((double) (ende) / 2 % 1) * 60);

		return beginnStunden + ":" + beginnMinuten + "-" + endeStunden + ":" + endeMinuten + " Uhr: " + name;

	}
}
