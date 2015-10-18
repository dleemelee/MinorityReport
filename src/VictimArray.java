import java.io.IOException;
import java.util.ArrayList;

import com.csvreader.CsvReader;


public class VictimArray {
	
	ArrayList<Victim> vtdb;
	
	public VictimArray(){
		vtdb = new ArrayList<Victim>();
		try {
			fillArrestArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fillArrestArray() throws IOException{
		CsvReader products = new CsvReader("src/FICT_VICTIM_DATA.csv");
		products.readHeaders();
		ArrayList<Victim> vtdb = new ArrayList<Victim>();
		while (products.readRecord()) {
			Victim v = new Victim(
					products.get("VICTIM_RECORD_NUM"),
					products.get("INCIDENT_DATE"),
					products.get("FINGERPRINT_ID"),
					products.get("FIRST_NAME"),
					products.get("LAST_NAME"),
					products.get("BIRTH_DATE"),
					products.get("GENDER"),
					products.get("INJURY_DESCR"),
					products.get("CASE_NUM")
					);
			vtdb.add(v);
		}
	}

	public ArrayList<Victim> getVtdb() {
		return vtdb;
	}


	
	
	
}

