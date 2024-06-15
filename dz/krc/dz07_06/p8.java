package dz.krc.dz07_06;

import java.util.Scanner;
import java.util.Arrays;

public class p8{
    final int MAX=5;

    private int[]arr = new int[MAX]; 

    private Scanner s=new Scanner(System.in);

    void fillArr(){
        System.out.println(String.format("Input %d numbers:",MAX));
        for(int i=0;i<MAX;i++) arr[i]=s.nextInt();
    }

    int[] minMax(){
        int max=arr[0], min=arr[0];
        for(int i=1;i<MAX;i++){
            if(arr[i]>max)  max=arr[i];
            if(arr[i]<min)  min=arr[i];
        }
        return new int[]{min,max};
    }

    public static void main(String[]s){
        p8 p=new p8();
        p.fillArr();
        System.out.println(Arrays.toString(p.minMax()));
    }
}