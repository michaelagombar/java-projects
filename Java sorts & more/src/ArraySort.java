import edu.princeton.cs.algs4.StdOut;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a = new String[] {"Joe", "Alfred", "Paul", "Mekke", "Taco"};
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);}
		System.out.println("-------------");
		Merge.sort(a);
		for (int i = 0; i < a.length; i++){
		System.out.println(a[i]);
		}
		
	}
}