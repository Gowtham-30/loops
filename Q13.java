//Q13. Write a Java program to check whether a given integer is a perfect square or not.
import java.util.Scanner;
public class Q13 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int root=(int)Math.sqrt(num);
        if(root*root==num){
            System.out.println("Perfect square.");
        } else {
            System.out.println("Not a perfect square.");
        }
    }
}