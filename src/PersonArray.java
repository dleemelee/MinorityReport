import java.util.ArrayList;

public class PersonArray {

	ArrayList<Person> PA;

	ArrayHandler myAH;

	PersonArray() {
		this.PA = new ArrayList<Person>();
		myAH = new ArrayHandler();
		this.init();
	}

	void init() {
		int count = 0;

		ArrayList<Integer> ctain = new ArrayList<Integer>();

		for (Arrest a : myAH.getMyAA().getArdb()) {

			if (count % 1000 == 0) {
				System.out.println(count + " LOOPS");
			}
			count++;

			boolean isIn = false;

			for (int i = 0; i < ctain.size(); i++) {
				if (!a.fingerprintID.equals("")) {
					if (ctain.get(i) == Integer.parseInt(a.getFingerPrintID())) {
						isIn = true;
					}
				}
			}

			if (isIn) {
				for (int i = 0; i < PA.size(); i++) {
					if (a.getFingerPrintID().equals(
							PA.get(i).getFingerprintID())) {
						PA.get(i).Crimes.add(PA.get(i).setDegree(a.fbiCode));
					}
				}
			} else {
				if (!a.fingerprintID.equals("")) {
					ctain.add(Integer.parseInt(a.fingerprintID));
					// System.out.println(a.fingerprintID);
					PA.add(new Person(a.fingerprintID, a.factionNumber));
					// System.out.println(PA.get(PA.size() - 1).fingerprintID);
					PA.get(PA.size() - 1).addCrimeFreq(1);
				}

			}
		}

		for (Victim a : myAH.getMyVA().getVtdb()) {

			boolean isIn = false;

			for (int i = 0; i < ctain.size(); i++) {
				if (!a.fingerPrintID.equals("")) {
					if (ctain.get(i) == Integer.parseInt(a.getFingerPrintID())) {
						isIn = true;
					}
				}
			}

			if (isIn) {
				for (int i = 0; i < PA.size(); i++) {
					if (a.getFingerPrintID().equals(
							PA.get(i).getFingerprintID())) {
						PA.get(i).addVictimFreq(1);
					}
				}
			} else {
				ctain.add(Integer.parseInt(a.fingerPrintID));
				PA.add(new Person(a.fingerPrintID));
				PA.get(PA.size() - 1).addVictimFreq(1);
			}

		}

	}

}
