import java.util.Scanner;
public class Q7{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp1=num;
        int temp=num;
        int digit=0;
        while(temp!=0){
            digit++;
            temp/=10;
        }
        while(num!=0){
            int rem=num%10;
            sum+=Math.pow(rem,digit);
            num/=10;
        }
        if(temp1==sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
  
        