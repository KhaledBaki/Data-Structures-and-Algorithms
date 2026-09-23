public class ReverseArray{
    public static <genericType> void reverseArray(genericType[] array){
        for (int i = 0; i < array.length / 2; i++){
            genericType temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static <genericType> void print(genericType[] array){

        // Print every element
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        final int NUMBER_OF_ELEMENTS_IN_ARRAY = 10;
        // create an array
        Integer[] integerArray = new Integer[NUMBER_OF_ELEMENTS_IN_ARRAY];

        // Add elements to the array
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = i;
        }

        // Print array
        System.out.println("Original Array:");
        ReverseArray.print(integerArray);

        // Reverse array
        ReverseArray.reverseArray(integerArray);
        System.out.println();

        // Print array
        System.out.println("Reversed Array:");
        ReverseArray.print(integerArray);
    }
}