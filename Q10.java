//Q10. Write a Java program to check whether a given number is prime or not.
import java.util.Scanner;
public class Q10 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;

        }
        if(count==2)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}