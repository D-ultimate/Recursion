import java.io.*;
import java.util.*;

public class PowerLogarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
      
        int r=power(x,n/2);
        int ans=n%2==0?r*r:r*r*x;   
        return ans;
    }

}