//Q6. Write a Java program to check whether a number is palindrome or not.
import java.util.Scanner;   
public class Q6 {   
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalNum=num;
        int reverse=0;
        while(num!=0){
            reverse=reverse*10+(num%10);
            num/=10;
        }
        if(originalNum==reverse){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}