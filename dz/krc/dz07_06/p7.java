package dz.krc.dz07_06;

public class p7{
    static long power(int base,int exponent){
        long res=1;
        for(int i=1;i<=exponent;i++) res*=base;
        return res;
    }
    public static void main(String[]s){
        System.out.println(power(2,5));
    }
}