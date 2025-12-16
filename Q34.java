import java.util.Scanner;

class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        System.out.println("First digit: " + n);
    }
}
