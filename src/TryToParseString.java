
public class TryToParseString {

	public static void main(String[] args) {
		String word = "word";
		try {
			Integer.parseInt(word);
		}
		catch (Exception NumberFormatException) {
			System.out.print(NumberFormatException);
		}

	}

}
