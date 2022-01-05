import java.io.*;
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int t1=scn.nextInt();
        int t2=scn.nextInt();
        int t3=scn.nextInt();
        toh(n,t1,t2,t3);
    }

    public static void toh(int n,int src,int dest,int help){
        if(n==0){
            return;
        }
        toh(n-1,src,help,dest);
        System.out.println(n+"["+src+" -> "+dest+"]");
        toh(n-1,help,dest,src);
    }

}