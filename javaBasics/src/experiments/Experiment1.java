package experiments;

public class Experiment1 {

	public static void main(String[] args) {
		
		//recursion
		//1,073,741,824
      int result = sum(3);
      System.out.println(result);
	}
 public static int sum(int k) {
	 if (k>0) {
		 return (k + sum(k - 1)*2) ;
		 
	 }
	 else {
		 return 0;
	 }
 }
}
