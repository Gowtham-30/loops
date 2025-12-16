import java.util.Scanner;

class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqSum = 0, cubeSum = 0;

        while (n != 0) {
            int d = n % 10;
            sqSum += d * d;
            cubeSum += d * d * d;
            n /= 10;
        }

        System.out.println("Sum of squares: " + sqSum);
        System.out.println("Sum of cubes: " + cubeSum);
    }
}
