import java.util.ArrayList;


public class FactionArray {
	
	ArrayList<Faction> myFA;
	ArrayHandler myAH;
	
	public FactionArray(){
		myFA = new ArrayList<Faction>();
		myAH = new ArrayHandler();
		this.initializeArray();
	}
	
	
	void initializeArray(){
		boolean isAlreadyThere;
		for( Arrest a : myAH.getMyAA().getArdb()) {
			isAlreadyThere = false;
			for( int i = 0; i < myFA.size(); i++ ) { //
				if( !a.getFactionNumber().equals("")){
					
					if( myFA.get(i).getFactionNumber().equals(a.getFactionNumber()) ){
						myFA.get(i).setFactionNumber(a.getFactionNumber());
						myFA.get(i).cases.add(Integer.parseInt(a.getFactionNumber()));
						isAlreadyThere = true;
					}
				}
				
				
			}
			

		
			if( !(isAlreadyThere)){
				if(!a.getFactionNumber().equals("")){
				myFA.add(new Faction(a.getFactionNumber()));
				}
			}
		}
	}

	
	public static void main(String[] args) {
		FactionArray myFA = new FactionArray();
		System.out.println(myFA.myFA);
		}
}
