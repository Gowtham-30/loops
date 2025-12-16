//Q19. Write a Java program to check whether a given number is an Automorphic Number or not.
import java.util.Scanner;
public class Q19 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int square=num*num;
        String str=String.valueOf(square);
        String numStr=String.valueOf(num);
        if(str.endsWith(numStr))
            System.out.println("Automorphic number");
        else
            System.out.println("Not an automorphic number");
    }
}