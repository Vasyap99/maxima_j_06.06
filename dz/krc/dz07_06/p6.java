package dz.krc.dz07_06;

import java.util.Scanner;

public class p6{
    final int MAX=5;

    private int[]arr = new int[MAX]; 

    private Scanner s=new Scanner(System.in);

    void fillArr(){
        System.out.println(String.format("Input %d numbers:",MAX));
        for(int i=0;i<MAX;i++) arr[i]=s.nextInt();
    }

    int getMax(){
        int max=arr[0];
        for(int i=1;i<MAX;i++)  if(arr[i]>max)  max=arr[i];
        return max;
    }

    public static void main(String[]s){
        p6 p=new p6();
        p.fillArr();
        System.out.println(p.getMax());
    }
}