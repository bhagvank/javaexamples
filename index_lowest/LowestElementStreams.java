
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.Optional;
public class LowestElementStreams {

 
    public static void main(String[] args) {
	
        int[] test_array = {7, 1, 3, 12, 5, 9, 8, 6};
        int minValue=  IntStream.of(test_array).min().getAsInt(); 
        System.out.println(" Value of the lowest value is :"+ minValue);
		
		Optional<Integer> minIndexArr = IntStream.range(0, test_array.length).boxed()
		    .min(Comparator.comparingInt(i -> test_array[i]));
		
		
		System.out.println("Index of the lowest value element: " + minIndexArr.get());
    }
}