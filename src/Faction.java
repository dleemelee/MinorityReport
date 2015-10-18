import java.util.ArrayList;


public class Faction {
	
	
	public String factionNumber;
	
	
	ArrayList<Integer> cases;
	
	

	public Faction(String factionNumber) {
		this.factionNumber = factionNumber;
		cases = new ArrayList<Integer>();
		
	}

	public String getFactionNumber() {
		return factionNumber;
	}

	public void setFactionNumber(String factionNumber) {
		this.factionNumber = factionNumber;
	}
	

	public String toString(){
		 
		return "[Faction Number: " + getFactionNumber();
		 
	}


	

}
