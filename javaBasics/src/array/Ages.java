package array;

public class Ages {

	public static void main(String[] args) {
		int ages[] = {10,30,39,39,287,238};
	
	

		float avg, sum = 0;

		// Get the length of the array
		//int length = ages.length;

		// Loop through the elements of the array
		for (int age : ages) {
		  sum += age;
		}

	

		// Calculate the average by dividing the sum by the length
		//avg = sum /length;

		// Print the average
		//System.out.println("The average age is: " + avg);
		System.out.println("the sum of ages :"+ sum);
		//System.out.println("the length of ages:" +length);
	}
	
}
