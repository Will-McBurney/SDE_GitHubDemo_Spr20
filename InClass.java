
public class InClass {
		
	public static boolean check(String test) {
		try {
			int i = Integer.parseInt(test);
			return	i >= 30 &&
					i < 400 &&
					test.charAt(0) == '3';
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	
	
	
	
	
	
	public static void lazyEvaluation() {
		int y = 5;
		if (y < 0) {
			return;
		}
		else {
			int x = reallyReallyLongMethod();
			//so something with x
		}
	}
	
	
	
	

	private static int reallyReallyLongMethod() {
		// TODO Auto-generated method stub
		return 0;
	}
}
