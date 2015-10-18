import java.util.ArrayList;


public class PersonArray {
	
	ArrayList<Person> PA;
	
	ArrayHandler myAH;
	
	
	PersonArray(){
		this.PA = new ArrayList<Person>();
		myAH = new ArrayHandler();
	}
	
	void init(){
		boolean isAlreadyThere;
		for( Arrest a : myAH.getMyAA().getArdb()) {
			isAlreadyThere = false;
			for( int i = 0; i < PA.size(); i++ ) {
				if( PA.get(i).fingerprintID.equals(a.fingerprintID) ){
					PA.get(i).Crimes.add(PA.get(i).setDegree(a.fbiCode));
					isAlreadyThere = true;
				}
			}
			if( !(isAlreadyThere)){
				PA.add(new Person(a.fingerprintID, a.factionNumber));
				PA.get(PA.size()-1).addCrimeFreq(1);
			}
			
			
		}
		
		
		for (Victim a: myAH.getMyVA().getVtdb()){
			System.out.println("c");
			isAlreadyThere = false;
			for (int i = 0; i < PA.size(); i++){
				if (PA.get(i).fingerprintID.equals(a.fingerPrintID)){
					
					PA.get(i).addVictimFreq(1);
					
					isAlreadyThere = true;
					
				}
			}
			if (!isAlreadyThere){
				PA.add(new Person(a.fingerPrintID));
				PA.get(PA.size()-1).addVictimFreq(1);
			}
		}
		
		
	}

}
