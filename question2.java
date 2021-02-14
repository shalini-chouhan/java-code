package LAB;

import java.util.Scanner;

public class question2
{
    public static void main(String args[]){
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter your mark");
        int score=mark.nextInt();

        if(score>90)
        {
            System.out.println("O");
        }
        else if(score>80 && score<90){
            System.out.println("E");

        }
        else if(score>70 && score<80)
        {
            System.out.println("A");

        } else if(score>60 && score<70){
            System.out.println("B");

        } else if(score>50 && score<60){
            System.out.println("C");

        }
        else if(score>40 && score<50){
            System.out.println("D");

        }
        else
        {
            System.out.println("fail");

        }

    }

}
