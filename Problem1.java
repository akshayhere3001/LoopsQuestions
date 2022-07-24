public class Problem1{
  public static void main(String[] args){
    
    // Problem-1 -> Write a Programme to print the Following Patterns
//		* * * *
//		* * *
//		* * 
//		*
		for(int i = 0; i<=5; i++) {
			for(int j = i + 1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Another Approach
		int n = 5;
		for(int i = n; i>0; i--) {
			for(int j = 0; j<i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
    
  }
}
