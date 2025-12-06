public class JavaBasics {

    public static void javaBasics(){
        //    Reverse a String
//    Input: "hello" → Output: "olleh"
        String s1 = "hello";
        StringBuilder stringBuilder = new StringBuilder(s1);
        System.out.println(stringBuilder.reverse());


//    Check for Palindrome
//    Input: "madam" → Output: true
        String s2 = "madam";
        if (isPalindrome(s2)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }


//    Find Factorial of a Number
//    Input: 5 → Output: 120
        System.out.println(factorial(5));


//    Find the Largest of Three Numbers
        System.out.println(largest(3, 1, 2));


//    Check if Number is Prime
        System.out.println(isPrime(53));

//    Print Fibonacci Series (Iterative & Recursive)
        int a = 7;

        for (int i = 0; i < a; i++){
            System.out.print(fibonacciSeries(i) + " ");
        }
        System.out.println();


//    Count Vowels and Consonants in a String
        countVowelsAndConsonants("consonants");


//    Find Duplicate Elements in an Array or String
//
//    Check if a Number is an Armstrong Number
//    Example: 153 = 1³ + 5³ + 3³
//
//    Swap Two Numbers Without Using a Temporary Variable
    }

private static boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
        if (s.charAt(i++) != s.charAt(j--)) {
            return false;
        }
    }
    return true;
}

private static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n-1);
}

private static int largest (int a, int b, int c){
        return Math.max(a, Math.max(b, c));
}

private static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
}

private static int fibonacciSeries(int n){
        if (n <= 1){
            return n;
        }

        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
}

private static void countVowelsAndConsonants(String s){
        int vowels = 0;
        int consonants = 0;

        String str = s.toLowerCase();

        for (char c : str.toCharArray()){
            if (Character.isLetter(c)){
                if ("aeiou".indexOf(c) != -1){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
    System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
}

}
