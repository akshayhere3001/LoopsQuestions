public class Problem2{
  public static void main(String[] args){
    
    // Problem-2 -> Write a Program to sum the first n even numbers
		int sum = 0;
		int num = 3;
		
		for(int i = 0; i<num; i++) {
			sum  = sum + (2*num); // (2*num) will give even numbers and (2*n + 1) will give odd Numbers
		}
		System.out.print("Sum is: " + sum);
    
  }
 }
