package dz.krc.dz07_06;

public class pA{
    static long fibonacci_r(long f1,long f2,int n,int n1){
        if(n1<n-2) return fibonacci_r(f2,f1+f2,n,n1+1);
        else return f1+f2;
    }
    static long fibonacci(int n){
        if(n==0) return 0;
        else return fibonacci_r(0,1,n,0);
    }
    public static void main(String[]s){
        for(int i=0;i<12;i++)
        System.out.println(""+i+" "+fibonacci(i));
    }
}