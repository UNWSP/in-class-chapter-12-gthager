import java.sql.SQLException;

public class Assignment {

	public static void main(String[] args) {
		
		try {
			int i;
			//i = 1 / 0;
			int[] array = {1};
			i = array[1];
		}
		catch (ArithmeticException e){
			System.out.println("Invalid math");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Bad array");
		}


	}

}
