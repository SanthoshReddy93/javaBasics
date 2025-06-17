package experiments;

public class Experiment2 {

	public static void main(String[] args) {
		
			    int sum = 1;
			    int term = 1;

			    for (int i = 0; i < 30; i++) {
			      sum += term;
			      term *= 2;  // Multiply by 2 for the next term
			    }

			    System.out.println("Sum: " + sum); // Output: 63
			  }
			
	}


