import java.io.IOException;
import java.util.ArrayList;

import com.csvreader.CsvReader;


public class ArrestArray {
	
	ArrayList<Arrest> ardb;
	
	public ArrestArray(){
		ardb = new ArrayList<Arrest>();
		try {
			fillArrestArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fillArrestArray() throws IOException{
		CsvReader products = new CsvReader("src/FICT_ARREST_DATA.csv");
		products.readHeaders();
		while (products.readRecord()) {
			Arrest a = new Arrest(
					products.get("ARREST_RECORD_NUM"),
					products.get("ARREST_DATE"),
					products.get("LOCATION_TYPE"),
					products.get("FINGERPRINT_ID"),
					products.get("FIRST_NAME"),
					products.get("LAST_NAME"),
					products.get("BIRTH_DATE"),
					products.get("GENDER"),
					products.get("FACTION_NUM"),
					products.get("PRIMARY_CHARGE"),
					products.get("CHARGE_TYPE_CD"),
					products.get("FBI_CODE"),
					products.get("CASE_NUM")
					);
			ardb.add(a);
		}
	}

	public ArrayList<Arrest> getArdb() {
		return ardb;
	}
	

	
	

}
