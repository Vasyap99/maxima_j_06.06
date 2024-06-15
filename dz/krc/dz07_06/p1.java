package dz.krc.dz07_06;

import java.util.Scanner;
import java.util.Random;

public class p1{

    public static void main(String[]s1){
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int n;
        Scanner s=new Scanner(System.in);   
        do{
            System.out.println("Enter Number:");
            n=s.nextInt();
            if(n<randomNumber)
                System.out.println("your number is less than Random");
            else if(n>randomNumber)
                System.out.println("your number is greather than Random");
            else break;
        }while(true);
        System.out.println("you guessed");
    }
}