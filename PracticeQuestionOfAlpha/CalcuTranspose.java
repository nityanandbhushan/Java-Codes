package PracticeQuestionOfAlpha;

public class CalcuTranspose {
    public static void transpose(int arr[][], int row, int column) {
        int trans[][] = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[0].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println("");

        }

    }

    public static void main(String args[]) {
        int array[][] = { { 11, 10, 9 }, { 6, 4, 2 } };
        int row = 2;
        int column = 3;
        transpose(array, row, column);
    }

}
