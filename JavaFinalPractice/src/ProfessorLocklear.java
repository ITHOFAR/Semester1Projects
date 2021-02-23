import java.util.ArrayList;

public class ProfessorLocklear {

	public String degreeOfHandsomeness;
	
	public ProfessorLocklear(String D) {
		degreeOfHandsomeness = D;
	}
	
	public boolean equalsMe(Object o) {
		if(o.equals(this.degreeOfHandsomeness)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(Object o) {
		o = (ProfessorLocklear) o;
		boolean B = ((ProfessorLocklear) o).equalsMe(this.degreeOfHandsomeness);
		return B;
	}
	
/*	public test whatthe(String d) {
		test t = new test(d);
		return t;
	} */
	
	public static ArrayList<Integer> evenLeftOddRight(int[] v) {
		ArrayList<Integer> s = new ArrayList<>();
		
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		for (int i: v) {
			if (i % 2 == 0) {
				evens.add(i);
			}
			if (i % 2 == 1) {
				odds.add(i);
			}
		}
		s.addAll(evens);
		s.addAll(odds);
		
		return s;
	}
	
	public static void main(String[] args) {
		
		int[] v = {1, 3, 5, 7, 21, 4, 6, 18, 9};
		ArrayList<Integer> x = evenLeftOddRight(v);
		for (Integer i: x) {
			System.out.print(i + " ");
		}
  	}
}
