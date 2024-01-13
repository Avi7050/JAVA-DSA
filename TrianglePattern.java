public class TrianglePattern {
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {
        char ch;
        for (int i = 1; i <= n; i++) {
            ch = 'E';
            for (int j = 1; j <= i ; j++) {
                System.out.print((ch) + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("Printing using numbers");
        pattern2(5);
        System.out.println("Printing using numbers in seq");
        pattern3(5);
        System.out.println("Printing using Alphabet in seq");
        pattern4(5);
        System.out.println("Printing using Alphabet in reverse");
        pattern5(5);
    }
}
