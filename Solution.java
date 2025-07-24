import java.util.*;
public class Solution {
    public static int linearSearch(int[] A, int B) {
        for(int i=0;i<A.length;i++){
            if(A[i]==B){
                return 1;
            }
        }
          return 0;
          
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[4];
        int B;
        for(int i=0;i<4;i++){
            A[i]=sc.nextInt();
        }
        B=sc.nextInt();
        System.out.println(linearSearch(A,B));
    }
}
