public class Palindrome {
    private static boolean checkPalindrome(int num) {
        int sum = 0;
        int temp = num;
        while(num != 0){
            sum = sum*10 + num % 10;
            num = num / 10;
        }
        if(sum == temp)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int num = 1221;
        System.out.println(checkPalindrome(num));
    }
}
