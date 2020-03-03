
public class Thing {

	public void method() {
		// TODO Auto-generated method stub
		
	}
	
	public static void shortCircuitExamples() {
		//put the faster operations first in the short circuit
		
		boolean b = fastMethod() || slowMethod();
		
		//order by likelihood of being true with ors, false with being ands
		boolean c1 = likelyTrue() || likelyFalse();
		boolean c2 = likelyFalse() && likelyTrue();
		
		if (fastMethod()) {
			
		}
		else if (slowMethod()) {
			
		}
	}

	private static boolean likelyTrue() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean likelyFalse() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean slowMethod() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean fastMethod() {
		// TODO Auto-generated method stub
		return false;
	}

}
