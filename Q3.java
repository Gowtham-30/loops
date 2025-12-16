//Q3. Write a Java program to count the number of digits in a given number.
import java.util.Scanner;
public class Q3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}