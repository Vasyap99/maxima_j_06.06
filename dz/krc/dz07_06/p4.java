package dz.krc.dz07_06;

import java.util.Scanner;

public class p4{
    static boolean isPrime(int n){
        for(int i=2;i<n;i++)
            if(n % i==0)
                return false;
        return true;
    }
    public static void main(String[]s){
        for(int i=2;i<20;i++)
            System.out.println("Number "+i+" is prime? "+isPrime(i));
    }
}