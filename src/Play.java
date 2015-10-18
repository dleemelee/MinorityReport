import java.util.ArrayList;


public class Play {
	
	public static void main(String[] args) {
		
		PersonArray PA = new PersonArray();
		FactionArray FA = new FactionArray();
		
		
		
		for(int i = 0; i < PA.PA.size(); i++){
			PointsHandler PH = new PointsHandler(PA.PA.get(i), FA);
			//double multiplier = PH.factionCrimes(PA.PA.get(i), FA);
			//PA.PA.get(i).setPoints((PH.Crimes(PA.PA.get(i)) * multiplier) + (PH.victimCounts(PA.PA.get(i)) * multiplier ));
			//System.out.println((PH.victimCounts(PA.PA.get(i)) * multiplier ));
			PA.PA.get(i).setPoints((PH.Crimes(PA.PA.get(i)) * PH.factionCrimes(PA.PA.get(i), FA)));
		}
		
		
		
		ArrayList<Person> criminalMax = new ArrayList<Person>(2000);
		int PAIndex=0;
		double tempMax = 0.0;

		for(int i= 0; i<2000; i++)
		{
			tempMax = 0.0;
			for(int x=0; x<PA.PA.size(); x++)
			{
				if(PA.PA.get(x).getPoints() > tempMax)
				{
					
					tempMax = PA.PA.get(x).getPoints();
					PAIndex = x;
				}
			}
		
			System.out.println("Points: " + PA.PA.get(PAIndex).getPoints());
			System.out.println("FID: "+PA.PA.get(PAIndex).getFingerprintID());
			criminalMax.add(PA.PA.get(PAIndex)); 
			PA.PA.get(PAIndex).setPoints(0);
			
		}
		for(int i=0; i<criminalMax.size(); i++)
		{
			System.out.println("Fingerprint ID #" + (i+1) + ": " + criminalMax.get(i).getFingerprintID());
		}
		
		
		
		
		
	}
}

