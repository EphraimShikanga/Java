package Assignments;
class Hello {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = { 30, 70, 20, 60, 50, 40, 80, 90 };
        int m = 0;
        // int [] array2 = new int [10];
        int[][] array3 = new int[4][2];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = array[m];
                m++;
            }
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 30 70
// 20 60
// 50 40
// 80 90