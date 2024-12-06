import java.util.ArrayList;
import java.util.List;
 
public class FlattenArrayListExample {
    public static void main(String[] args) {
        int[][] exarray2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> exlist = new ArrayList<>();
 

        for (int[] row : exarray2D) {
            for (int element : row) {
                exlist.add(element);
            }
        }
 

        int[] exarray1D = exlist.stream().mapToInt(Integer::intValue).toArray();
 

        for (int element : exarray1D) {
            System.out.print(element + " ");
        }
    }
}