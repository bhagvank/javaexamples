import java.util.Arrays;

import java.util.stream.IntStream;

public class FlattenArrayStreamsExample {

    public static void main(String[] args) {

        int[][] exarray2D = {

            {1, 2, 3},

            {4, 5, 6},

            {7, 8, 9}

        };


        int[] exarray1D = Arrays.stream(exarray2D)

                              .flatMapToInt(Arrays::stream)

                              .toArray();


        System.out.println(Arrays.toString(exarray1D));  

    }

}