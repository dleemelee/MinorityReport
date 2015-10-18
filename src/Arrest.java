
public class Arrest {
	public String arrestRecordNumber;
	
	public String arrestDate;
	
	public String locationType;
	
	public String fingerprintID;
	
	public String firstName;
	
	public String lastName;
	
	public String birthDate;
	
	public String gender;
	
	public String factionNumber;
	
	public String primaryCharge;
	
	public String chargeType;
	
	public String fbiCode;
	
	public String caseNum;

	public Arrest(String arrestRecordNumber, String arrestDate,
			String locationType, String fingerprintID,
			String firstName, String lastName, String birthDate, String gender,
			String factionNumber, String primaryCharge, String chargeType, String fbiCode,
			String caseNum) {
		this.arrestRecordNumber = arrestRecordNumber;
		this.arrestDate = arrestDate;
		this.locationType = locationType;
		this.fingerprintID = fingerprintID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.factionNumber = factionNumber;
		this.primaryCharge = primaryCharge;
		this.chargeType = chargeType;
		this.fbiCode = fbiCode;
		this.caseNum = caseNum;
	}

	public String getArrestRecordNumber() {
		return arrestRecordNumber;
	}

	public void setArrestRecordNumber(String arrestRecordNumber) {
		this.arrestRecordNumber = arrestRecordNumber;
	}

	public String getArrestDate() {
		return arrestDate;
	}

	public void setArrestDate(String arrestDate) {
		this.arrestDate = arrestDate;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getFingerPrintID() {
		return fingerprintID;
	}

	public void setFingerprintID(String fingerprintID) {
		this.fingerprintID = fingerprintID;
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

	public String getFactionNumber() {
		return factionNumber;
	}

	public void setFactionNumber(String factionNumber) {
		this.factionNumber = factionNumber;
	}

	public String getPrimaryCharge() {
		return primaryCharge;
	}

	public void setPrimaryCharge(String primaryCharge) {
		this.primaryCharge = primaryCharge;
	}

	public String getFbiCode() {
		return fbiCode;
	}

	public void setFbiCode(String fbiCode) {
		this.fbiCode = fbiCode;
	}

	public String getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	
	
	
	

}
