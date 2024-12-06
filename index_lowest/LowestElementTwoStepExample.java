public class LowestElementTwoStepExample {
    
    public int findLowestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minElement = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];  
            }
        }

        return minElement;
    }


    public int findIndexOfElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; 
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6};

        LowestElementTwoStepExample example = new LowestElementTwoStepExample();
		
        int lowestElement = example.findLowestElement(array);

        
        int lowestIndex = example.findIndexOfElement(array, lowestElement);

        System.out.println("Lowest element: " + lowestElement);
        System.out.println("Index of the Lowest element: " + lowestIndex);
    }
}