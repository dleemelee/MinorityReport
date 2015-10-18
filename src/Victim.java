
public class Victim {
	public String recordNumber;
	
	public String incidentDate;
	
	public String fingerPrintID;
	
	public String firstName;
	
	public String lastName;
	
	public String birthDate;
	
	public String gender;
	
	public String injuryDescription;
	
	public String caseNum;

	public Victim(String recordNumber, String incidentDate, String fingerPrintID,
			String firstName, String lastName, String birthDate, String gender,
			String injuryDescription, String caseNum) {
		super();
		this.recordNumber = recordNumber;
		this.incidentDate = incidentDate;
		this.fingerPrintID = fingerPrintID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.injuryDescription = injuryDescription;
		this.caseNum = caseNum;
	}

	public String getRecordNumber() {
		return recordNumber;
	}

	public void setRecordNumber(String recordNumber) {
		this.recordNumber = recordNumber;
	}

	public String getIncidentDate() {
		return incidentDate;
	}

	public void setIncidentDate(String incidentDate) {
		this.incidentDate = incidentDate;
	}

	public String getFingerPrintID() {
		return fingerPrintID;
	}

	public void setFingerPrintID(String fingerPrint) {
		this.fingerPrintID = fingerPrint;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInjuryDescription() {
		return injuryDescription;
	}

	public void setInjuryDescription(String injuryDescription) {
		this.injuryDescription = injuryDescription;
	}

	public String getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}
	
	

}
