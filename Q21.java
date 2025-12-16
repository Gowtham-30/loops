//Q21. Write a Java program to check whether a given integer is a power of 3 or not.
import java.util.Scanner;
public class Q21 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num%3==0){
            num=num/3;
        }
        if(num==1)
            System.out.println("Power of 3");
        else
            System.out.println("Not a power of 3");
    }
}