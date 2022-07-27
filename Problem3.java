public class Problem3{
  public static void Main(String[] args){
  
  
    // Problem-3 -> Write a Programme to print multiplication table of given number n
		System.out.println();
		
		int tableOf = 2;
		int i = 0;
		for(i = 1; i<= 10; i++) {
			System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
		}
		
		// Problem-3.2 -> Writer a Programme to print Multiplication table in Reverse Order
		System.out.println();
		
		for(i = 10; i>0; i--) {
			System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
		}
    
    
  
  }
}
