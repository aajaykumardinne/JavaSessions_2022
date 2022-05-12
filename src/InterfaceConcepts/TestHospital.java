package InterfaceConcepts;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.optServices();
		fh.mediaTraining();
		fh.entServices();
		USMedical.billing();
		fh.medInsurance();
		fh.covidTest();
		

		// top casting
		// child class object can be referred by parent interface ref name/variable
		USMedical usa = new FortisHospital();
		usa.physioServices();
		usa.oncologyServices();
		usa.emergencyServices();
		usa.cardioServices();
		usa.medInsurance();

		UKMedical uk = new FortisHospital();
		uk.entServices();
		uk.pediaServices();
		uk.emergencyServices();

		// down casting: compile time only not allowed
		// parent interface object can be referred by child class ref name/variable
		// FortisHospital fh1 = new USMedical();

	}

}
