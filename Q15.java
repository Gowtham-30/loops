//Q15. Write a Java program to check whether a given number is a Perfect Number or not.
import java.util.Scanner;
public class Q15 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(num==sum)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
    }
}