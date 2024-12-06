public class FlattenArrayExample {

  public static void main(String[] args) {

   int[][] exarray2D = { {1, 2, 3}, {4, 5, 6},{7, 8, 9}};


   int totalElements = 0;

   for (int[] row : exarray2D) {

      totalElements += row.length;

    }


   int[] exarray1D = new int[totalElements];

   int index = 0;


   for (int[] row : exarray2D) {

     for (int element : row) {

       exarray1D[index++] = element;

     }

   }


   for (int element : exarray1D) {

     System.out.print(element + " ");

   }

 }

}