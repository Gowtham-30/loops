//Q17. Write a Java program to check whether a given number is a Harshad Number or not.
import java.util.Scanner;
public class Q17 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(temp%sum==0)
            System.out.println("Harshad number");
        else
            System.out.println("Not a Harshad number");
    }
}
