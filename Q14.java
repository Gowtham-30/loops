//Q14. Write a Java program to check whether a given number is a Strong Number or not.
import java.util.Scanner;
public class Q14 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==num)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");
    }

}