import java.util.ArrayList;

public class Person {

	public String fingerprintID;

	public int degreeOfCrime;
	
	ArrayList<Integer> Crimes;

	public int crimeFreq;

	public String factionNumber;

	public int victimFreq;
	
	public double points;

	public Person(String fingerprintID) {

		this(fingerprintID, "");
		
		
	}

	public Person(String fingerprintID, String factionNumber) {

		this.factionNumber = factionNumber;

		this.fingerprintID = fingerprintID;

		this.Crimes = new ArrayList<Integer>();
		
		this.crimeFreq = 0;

		this.victimFreq = 0;
		this.points = 0.0;
	}
	public String getFingerprintID()
	{
		return fingerprintID;
	}


	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public int getCrimeFreq() {
		return crimeFreq;
	}

	public void addCrimeFreq(int crimeFreq) {
		this.crimeFreq += crimeFreq;
	}

	public int setDegree(String s) {
		if (s.equals("04A")) {// Aggravated Battery
			return 7;
		} else if (s.equals("04B")) { // Aggravated Battery
			return 5;
		} else if (s.equals("01A")) { // Murder with weapon
			return 15;
		} else if (s.equals("01B")) { // ManSlaughter - involuntary, reckless
										// car w/e
			return 12;
		}
		return 1;

	}

	public int getVictimFreq() {
		return victimFreq;
	}

	public void addVictimFreq(int victimFreq) {
		this.victimFreq += victimFreq;
	}

	public String toString() {
		return "fingerprint ID: " + this.fingerprintID + " degree of crime: "
				+ this.degreeOfCrime + " crimeFreq: " + this.crimeFreq + "\n";
	}

}
