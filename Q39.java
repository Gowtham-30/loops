import java.util.Scanner;

class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean descending = true;

        while (n > 9) {
            if (n % 10 > (n / 10) % 10) {
                descending = false;
                break;
            }
            n /= 10;
        }

        System.out.println(descending ? "Descending order" : "Not descending");
    }
}
