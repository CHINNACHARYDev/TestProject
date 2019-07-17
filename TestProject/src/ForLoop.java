
public class ForLoop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop("9581474449");
	}	
	
	public static Integer ForLoop(String string) {
		
		int num = 0;
		String val = "";
		for (int i = string.length()-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++)
                System.out.print(string.charAt(j));
            System.out.println();
        }
		
		System.out.println();
 
        for (int i = 0; i <= string.length()-1; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(string.charAt(j));
            System.out.println();
        }
        
        String mobile = "";
        for(int i = 0; i < 10; i++){
			mobile = mobile + string.charAt(i);
			System.out.println(mobile);
		}
 
        System.out.println();
        
		String mobileRe = "";
		for (int j = string.length()-1; j >= 0; j--){
			mobileRe = mobileRe + string.charAt(j);
			System.out.println(mobileRe);
		}
 
        System.out.println();
        
        for (int i = 0; i <= string.length()-1; i++) {
            for (int k = i; k >= 0; k--) 
                System.out.print(string.charAt(k));
            System.out.println();            
        }
        
        System.out.println();
		
		return num;
	}

	

}
