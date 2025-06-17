package array;

public class LowestAge {

	public static void main(String[] args) {
		int ages[] = {2,3,34,5,6,67,8,1,6,6};
		int lowestAge = ages[0];
		for(int age:ages) {
			if (lowestAge>age) {

				lowestAge = age;

			}

		}
		System.out.println(" The lowest age is:" +lowestAge);
	}

}
