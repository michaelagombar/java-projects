public class TestMyBST {

    /**
     * @param args the command-line arguments
     */
    public static void main(String[] args) { 
        MyBST<String, Integer> st = new MyBST<String, Integer>();
		String[] array1 = {"Joe", "Bill", "Ann", "Omar", "Sydney", "Ellen", "Mark", "Marshall", "Earl", "Vicky"};
		String[] array2 = {"Adam", "Fred", "Louise", "Cindy"};
        
		System.out.println("Initializing...");
		for (int i = 0; i<array1.length; i++) {
            st.put(array1[i], i);
        }
        printST(st);
        
		System.out.println("Deleting Ann...");
        st.delete("Ann");
        printST(st);
        
		System.out.println("Adding 2nd array...");
		for (int i = 0; i<array2.length; i++) {
            st.put(array2[i], i);
        }
        printST(st);
        
		System.out.println("Deleting Omar, Cindy & Earl");
		st.delete("Omar");
        st.delete("Cindy");
        st.delete("Earl");
        printST(st);

    }

	private static void printST(MyBST<String, Integer> st) {
        for (String s : st.levelOrder())
            System.out.println(s + " " + st.get(s));

        System.out.println();

        for (String s : st.keys())
            System.out.println(s + " " + st.get(s));
	}

}
