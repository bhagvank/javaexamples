import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class LowestArraysValue {

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 12, 5, 9, 8, 6};

        int minValue = Arrays.stream(arr).min().getAsInt();

        System.out.println("Minimum Value is : " + minValue);
		
		List<Integer> intList = new ArrayList<Integer>(arr.length);
		for (int i : arr)
		{
		    intList.add(i);
		}
		System.out.println("Index of the lowest value element: " + intList.indexOf(minValue));
		
		
        
   }
}