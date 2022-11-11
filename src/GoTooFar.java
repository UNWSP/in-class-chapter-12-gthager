
public class GoTooFar {
	public static void main(String[] args) {
		int[] array = {5,4,3,2,1};
		int i = 0;
		try {
			while (true) {
				System.out.println(array[i]);
				i++;
			}
		}
		catch (Exception e) {
			System.out.println("Now you've gone too far");
		}
	}
}