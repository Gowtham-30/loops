import java.util.Scanner;

class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ascending = true;

        while (n > 9) {
            if (n % 10 < (n / 10) % 10) {
                ascending = false;
                break;
            }
            n /= 10;
        }

        System.out.println(ascending ? "Ascending order" : "Not ascending");
    }
}
