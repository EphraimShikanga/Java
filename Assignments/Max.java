package Assignments;

public class Max {
	public static int findMaxNum(int[] numArray) {
		int max = numArray[0];
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] > max) {
				max = numArray[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] numArray = { 4, 0, 9, 2, 15, 3 };
		System.out.println(findMaxNum(numArray));
	}
}
