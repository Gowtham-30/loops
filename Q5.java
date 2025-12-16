//Q5. Write a Java program to reverse a given number.
import java.util.Scanner;
public class Q5 {   
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        while(num!=0){
            reverse=reverse*10+(num%10);
            num/=10;
        }
        System.out.println(reverse);
    }
}