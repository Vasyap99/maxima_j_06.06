package dz.krc.dz07_06;

import java.util.Scanner;

public class p3{
    static int maxOfThree(int a,int b,int c){
        if(a>b){
            if(a>c) return a;
            else return c; 
        }else{
            if(b>c) return b;
            else return c; 
        }
    }
    public static void main(String[]s){
        System.out.println(maxOfThree(1,3,5));
        System.out.println(maxOfThree(7,3,5));
        System.out.println(maxOfThree(1,0,2));
        System.out.println(maxOfThree(4,3,3));
    }
}