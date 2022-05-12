package InterfaceAssignment;

public class TestEducation {

	public static void main(String[] args) {
		VIT vit = new VIT();
		vit.conceptualUnderstanding(); // overridden method
		vit.assignmentsforSubjects(); // overridden method
		vit.percentageCalculations(); // overridden method
		vit.practicalknowledge(); // overridden method
		vit.campusPlacements(); // individual method
		vit.theoriticalknowledge(); // overridden method
		vit.stressfulStudies(); // overridden method
		vit.weekendClasses(); // overridden method
		vit.hourlyClasses(); // overridden method
		vit.onlineLearningPreferred(); // overridden method
		vit.projectsImplementation(); // overridden method
		vit.internationalStandards(); // overridden method
		vit.necessityForPeople(); // inherited method
		
		
		IIT iit = new IIT();
		iit.conceptualUnderstanding();        // overridden method
		iit.assignmentsforSubjects();         // overridden method
		iit.percentageCalculations();         // overridden method
		iit.practicalknowledge();             // overridden method
		iit.AttendanceImportance();           // individual method
		iit.stressfulStudies();              // overridden method
		iit.theoriticalknowledge();           // overridden method
		iit.weekendClasses();                   // overridden method

		// child class object can be referred by parent interface ref variable
		// concept of reference type check

		// top casting for VIT class
		USEducation usa = new VIT();
		usa.conceptualUnderstanding();
		usa.practicalknowledge();
		usa.assignmentsforSubjects();
		usa.percentageCalculations();
		// parent interface reference name can not access child class method
		// campusPlacements method
		usa.internationalStandards();
		

		// top-casting
		IndianEducation ind = new VIT();
		ind.theoriticalknowledge();
		ind.stressfulStudies();
		ind.weekendClasses();
		ind.percentageCalculations();
		// parent interface reference name can not access child class method
		// campusPlacements method
		ind.internationalStandards();

		// top-casting
		UKEducation uk = new VIT();
		uk.hourlyClasses();
		uk.onlineLearningPreferred();
		uk.projectsImplementation();
		uk.percentageCalculations();
		// parent interface reference name can not access child class method
		// campusPlacements method
		uk.internationalStandards();
		
		// top-casting
		// child class object can be referred by parent class ref name
		Education ed = new VIT();
		ed.necessityForPeople();
		
		// child class object can be referred by grand parent interface ref name
		GlobalEducation globaled = new VIT();
		globaled.internationalStandards();
		
		
		//top-casting for IIT class
		USEducation us = new IIT();
		us.conceptualUnderstanding();
		us.practicalknowledge();
		us.assignmentsforSubjects();
		us.percentageCalculations();
		us.internationalStandards();
		
		IndianEducation india = new IIT();
		india.stressfulStudies();
		india.theoriticalknowledge();
		india.percentageCalculations();
		india.weekendClasses();
		india.internationalStandards();
		
		UKEducation uked = new IIT();
		uked.internationalStandards();
		uked.hourlyClasses();
		uked.onlineLearningPreferred();
		uked.percentageCalculations();
		uked.percentageCalculations();
		
		// top-casting
		// child class object can be referred by parent class ref name
		Education edu = new IIT();
		edu.necessityForPeople();
		
		// child class object can be referred by grand parent interface ref name
		GlobalEducation gledu = new IIT();
		gledu.internationalStandards();
		
		// parent interface reference name can not access child class method
		// attendanceImportance method

		// parent interface object can be referred by child class ref variable
		// down-casting is not allowed in compile time only
		// we can not create the object of Interface
//		VIT vt = new USEducation();

		// parent interface object can be referred by child class ref name
//		VIT vt = new IndianEducation();

	}

}
