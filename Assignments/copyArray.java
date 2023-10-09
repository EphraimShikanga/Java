package Assignments;

public class copyArray {
	public static int[] cpArray(int[] numArray) {
		int[] arrayCopy = new int[numArray.length];

		for (int i = 0; i < numArray.length; i++)
			arrayCopy[i] = numArray[i];
		return arrayCopy;
	}

	public static void main(String[] args) {
		int[] mainArray = { 3, 2, 2, 5, 5 };
		int[] copyArray = cpArray(mainArray);

		for (int i = 0; i < copyArray.length; i++) {
			System.out.println(copyArray[i]);
		}
	}
}
