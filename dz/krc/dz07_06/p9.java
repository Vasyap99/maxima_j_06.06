package dz.krc.dz07_06;

public class p9{
    private static int[]arr = {1,-4, 5, 6, 10, -3, 2, -5, 5, 4}; 

    static boolean contains(int[]arr,int el){        
        for(int i=0;i<arr.length;i++) if(arr[i]==el)return true;
        return false;
    }

    public static void main(String[]s){
        System.out.println(contains(arr,6));
        System.out.println(contains(arr,4));
        System.out.println(contains(arr,44));

    }
}