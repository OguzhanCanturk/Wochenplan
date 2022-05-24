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
		return beginn/2 + " - " + ende/2 + " Uhr: " + name;
		
	}
}
