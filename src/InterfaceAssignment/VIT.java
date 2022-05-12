package InterfaceAssignment;

public class VIT extends Education implements USEducation,IndianEducation,UKEducation{

	

	//USA
	@Override
	public void conceptualUnderstanding() {
		System.out.println("VIT--conceptualUnderstanding");
		
	}

	@Override
	public void practicalknowledge() {
		System.out.println("VIT--practicalknowledge");
		
	}

	@Override
	public void assignmentsforSubjects() {
		System.out.println("VIT--assignmentsforSubjects");
		
	}

	@Override
	public void percentageCalculations() {
		System.out.println("VIT--percentageCalculations");
		
	}

	public void campusPlacements() {
		System.out.println("VIT--campusPlacements");
	}

	// Indian
	@Override
	public void theoriticalknowledge() {
		System.out.println("VIT--theoriticalknowledge");
		
	}

	@Override
	public void stressfulStudies() {
		System.out.println("VIT--stressfulStudies");
	}

	@Override
	public void weekendClasses() {
		System.out.println("VIT--weekendClasses");
		
	}

	@Override
	public void hourlyClasses() {
		System.out.println("VIT--hourlyClasses");
		
	}

	@Override
	public void onlineLearningPreferred() {
		System.out.println("VIT--onlineLearningPreferred");
		
	}

	@Override
	public void projectsImplementation() {
		System.out.println("VIT--projectsImplementation");
		
	}

	@Override
	public void internationalStandards() {
		System.out.println("VIT--internationalStandards");
		
	}
}
