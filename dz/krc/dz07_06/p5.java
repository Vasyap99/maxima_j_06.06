package dz.krc.dz07_06;

public class p5{
    private int[]arr = {1,-4, 5, 6, 10, -3, 2, -5, 5, 4}; 

    int sumArray(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        return sum;
    }

    public static void main(String[]s){
        p5 p=new p5();
        System.out.println(p.sumArray(p.arr));
    }
}