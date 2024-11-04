package dailyTask;

public class Pattern {

	static void patternSquare(int n) {

		for (int i = 0; i <= n; i++) {
			System.out.println("1234");

		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	static void rightAngle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	
	static void inverted(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
		
		
	

	public static void main(String[] args) {
		patternSquare(4);
		rightAngle(5);
		inverted(5);
	}

}
