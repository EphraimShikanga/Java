package Assignments;

public class sumMultiDArray {
	public static int sumArray(int[][] numArray) {
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[i].length; j++) {
				sum += numArray[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] numArray = {
			{0, 2, 3, 2},
			{5, 5, 9},
			{7, 8, 9, 3, 10}
		};
		System.out.println(sumArray(numArray));
	}
}
