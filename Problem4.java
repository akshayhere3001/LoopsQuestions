public class Problem4{
  public static void main(String[] args){
      
      
      // Problem-5 -> Write a Program to find factorial of given number
		System.out.println();
		
		int factorial = 1; // for Product initialize with 1 
							// for sum initialize with 0
		int number = 5;
		int iter = 1;
		while(iter <= number) {
			factorial *= iter;
			iter++;
		}
		
		System.out.println(factorial);
		
      
      
  }

}
