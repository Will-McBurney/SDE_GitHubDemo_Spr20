
public class LoopExamples {
	private String[] A;
	private String[] B;
	
	public void loopExample() {
		for (int a = 0; a < A.length; a++) {
			String strA = A[a];
			for (int b = 0; b < B.length; b++) {
				someMethod(strA, B[b]);
			}
		}
	}

	private void someMethod(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}
