public class ConvertTwoDArrayToOneDExample {

    public static void main(String[] args) {

    int[][] exarray2D = {{1, 2, 3},{4, 5, 6}};   

    int rows = exarray2D.length;
    int cols = exarray2D[0].length;


    int[] exarray1D = new int[rows * cols];

    int index = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            exarray1D[index++] = exarray2D[i][j];
        }
    }

    System.out.println("1D Array contents:");
    for (int i = 0; i < exarray1D.length; i++) {
        System.out.print(exarray1D[i] + " ");
    }
}
}