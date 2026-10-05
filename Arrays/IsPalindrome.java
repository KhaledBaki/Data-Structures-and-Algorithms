public class IsPalindrome<genericType>{
    public static <genericType> boolean isPalindrome(genericType[] array){
        
        int n = array.length - 1;
        for (int i = 0; i < array.length / 2; i++){
            if (array[i] != array[n - i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        // Create Array
        Integer[] palindrome = {5,4,3,2,1,2,3,4,5};
        Integer[] notPalindrome = {1,2,3,4,5};

        // Verifying the Array that is a palindrome
        for (int i = 0; i < palindrome.length; i++){
            System.out.print(palindrome[i]);
        }
        System.out.println(", Palindrome: " + IsPalindrome.isPalindrome(palindrome));

        // Verifying the Array that is NOT a palindrome
        for (int i = 0; i < notPalindrome.length; i++){
            System.out.print(notPalindrome[i]);
        }
        System.out.println(", Palindrome: " + IsPalindrome.isPalindrome(notPalindrome));
    }
}