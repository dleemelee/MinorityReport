public class PointsHandler {

	private int points;
	
	
	public PointsHandler(Person p, FactionArray FA) {

	}
	
	double Crimes(Person p){
		int temp = 0;
		for(int x:p.Crimes){
			temp += x;
		}
		return temp;
	}
	
	double factionCrimes(Person p, FactionArray FA) {
		double temp = 0;
		for(int i=0; i< FA.myFA.size(); i++){
			if(FA.myFA.get(i).getFactionNumber().equals(p.factionNumber)){
				temp += 0.01 * FA.myFA.get(i).cases.size();
			}
		}
		return (1 + temp/1000.0);
	}
	

	double victimCounts(Person p){
		System.out.println("Victim: " + p.getVictimFreq());
		return p.getVictimFreq();
	}
	


}
