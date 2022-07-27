public class Problem5{
  public static void main(String[] args){
  
    // Problem-6 -> Write a program to find the sum of the multiplication table of 8
		System.out.println();
		
		int table = 8;
		int item = 0;
		int sumOfTable = 0;
		for(item = 1; item<= 10; item++) {
			sumOfTable = sumOfTable + (table * item);
		}
		System.out.println(sumOfTable);
    
    
  }

}
