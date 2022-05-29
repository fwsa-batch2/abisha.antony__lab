import java.util.*;
import java.io.*;

    class Solution{
        public static void main(String []args){
          Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
          for(int i = 0;i < t;i++){
              int fst = sc.nextInt();
              int scnd = sc.nextInt();
              int n = sc.nextInt();
              int c = fst;
              for(int j= 0;j  < n;j++){
                  c += Math.pow(2,j)*scnd;
                  System.out.printf("%s ",c);
              }
              System.out.println();
          }
            sc.close();

        }
    }


