//Q8. Write a Java program to find the LCM of two numbers.
import java.util.Scanner;
public class Q8 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int lcm;
        if(num1>num2)
            lcm=num1;
        else
            lcm=num2;   
        while(true){
            if(lcm%num1==0 && lcm%num2==0){
                System.out.println(lcm);
                break;
            }
        }
    }
}