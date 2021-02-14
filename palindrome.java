package LAB;

import java.util.Scanner;

public class palindrome
{
    public static  void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        int r,sum=0;
        int temp=n;

        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}

