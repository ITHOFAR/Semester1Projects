
public class messinAround {

	public static void main(String[] args) {
		int randomArray[] = new int[1000];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (1 + Math.random() * 1000)/100;
		}

	}
}
