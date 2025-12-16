public class Q28 {
    public static void main(String[] args) {
        System.out.print("Vowels: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if ("aeiou".indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }

        System.out.print("\nConsonants: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if ("aeiou".indexOf(ch) == -1) {
                System.out.print(ch + " ");
            }
        }
    }
}
