
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop("9581474449");
	}

	public static void ForLoop(String string) {
		
//		for (int i = 0; i < string.length(); i++) {
//			for (int j = 0; j <= i; j++)
//			System.out.println("j " + string.charAt(j));
//			System.out.println();
//		}
		
		for (int k = 0; k <= string.length()-1; k++) {
			System.out.println("k " + string.charAt(k));
		}
		
		
	}

}
