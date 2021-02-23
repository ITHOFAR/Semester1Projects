
public class HelloWorld {

	public static void main(String[] args) {
		String test = "Hello there my name is Isaac Harris";
		String[] testArray = test.split(" ");
		System.out.println(testArray.length);
		for (String value: testArray) {
			System.out.println(value);
		}
		
	}

}
