import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
            int number = sc.nextInt();    
            boolean status = isPalindrome(number);
            if(status == true){
                System.out.println("Number is Palindrome");
            } else {
                System.out.println("Number is not Palindrome");
            }
            sc.close();
    }
    public static boolean isPalindrome(int number){
        int n = number;
          if((n < 0) || (n != 0 && n % 10 == 0)){
                return false;
            }
            int rev = 0;
            while( n > 0){
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            if(number == rev){
                return true;
            }
        return false;
     }
}