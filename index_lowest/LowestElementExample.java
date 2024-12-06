public class LowestElementExample {

    public int findIndexOfLowestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minIndex = 0;  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;  
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
	
	    LowestElementExample example = new LowestElementExample();
        int[] test_array = {7, 1, 3, 1, 5, 9, 8, 6};
        int minIndex = example.findIndexOfLowestElement(test_array);
        System.out.println("Index of the lowest value element: " + minIndex + " Value of the lowest value is :"+ test_array[minIndex]);
    }
}