import java.util.Scanner;

class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, last = n % 10, first;

        while (temp >= 10)
            temp /= 10;
        first = temp;

        int digits = (int) Math.log10(n);
        int result = last * (int) Math.pow(10, digits)
                   + (n % (int) Math.pow(10, digits)) / 10 * 10
                   + first;

        System.out.println("Result: " + result);
    }
}
