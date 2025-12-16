import java.util.Scanner;

class Q48 {
    static String word(int d) {
        String[] w = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return w[d];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        while (rev != 0) {
            System.out.print(word(rev % 10) + " ");
            rev /= 10;
        }
    }
}
