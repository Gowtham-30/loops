//Q20. Write a Java program to check whether a given number is a Magic Number or not.
import java.util.Scanner;
public class Q20 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        int temp1=sum;
        while(sum!=0){
            int rem=sum%10;
            rev=(rev*10)+rem;
            sum/=10;
        }
        if((temp1*rev)==temp)
            System.out.println("Magic number");
        else
            System.out.println("Not a Magic number");

    }
    
}
