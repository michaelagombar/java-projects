import java.util.ArrayList;


public class CheckbookMerge {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		ArrayList<Checkbook_Class> checks = new ArrayList<Checkbook_Class>();
		
		checks.add(new Checkbook_Class(5, "Joe", new Double (100)));
		checks.add(new Checkbook_Class(2, "Mike", new Double (200)));
		checks.add(new Checkbook_Class(1, "Andy", new Double (14)));
		checks.add(new Checkbook_Class(3, "Taco", new Double (800)));
		checks.add(new Checkbook_Class(4, "Burrito", new Double (80085)));
		Checkbook_Class[] checksArray = checks.toArray(new Checkbook_Class[0]);
		
		for(Checkbook_Class checkbook: checks){
			System.out.println(checkbook);
		}
		//Checkbook_Class[] checksArray = checks.toArray(new Checkbook_Class[0]);
		System.out.println("--------------------");
		
		Merge.sort(checksArray);
		for(Checkbook_Class checkbook: checksArray){
			System.out.println(checkbook);
		
	}
	}
}