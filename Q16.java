//Q16. Write a Java program to check whether a given number is a Neon Number or not.
import java.util.Scanner;
public class Q16 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==9)
            System.out.println("Neon number");
        else
            System.out.println("Not a Neon number");
    }
}
/*
logic of neon number
given number 9
square of given number 81
sum of digits in square
if(sum of digits in square == given number)
it is a neon number */
        