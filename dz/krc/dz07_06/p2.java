package dz.krc.dz07_06;

import java.util.Scanner;

public class p2{
    final int MAX=10;

    private int[]arr = new int[MAX]; 

    private Scanner s=new Scanner(System.in);

    void fillArr(){
        System.out.println(String.format("Input %d numbers:",MAX));
        for(int i=0;i<MAX;i++) arr[i]=s.nextInt();
    }

    void outPositives(){
        for(int i=0;i<MAX;i++) if(arr[i]>0) System.out.println(arr[i]);
    }

    public static void main(String[]s){
        p2 p=new p2();
        p.fillArr();
        p.outPositives();
    }
}