//Q18. Write a Java program to check whether a given number is a Buzz Number or not.
import java.util.Scanner;
public class Q18 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%10==7 || num%7==0)
            System.out.println("Buzz number");
        else
            System.out.println("Not a buzz number");
    }
}