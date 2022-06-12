import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
          Scanner sc=new Scanner(System.in);
          int dr=sc.nextInt();
          int dc=sc.nextInt();
          printMazePaths(1,1,dr,dc,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
          if(sr==dr && sc==dc){
              System.out.println(psf);
              return;
          }
          if(sr>dr || sc>dc){
              return;
          }
          for( int i=1 ; i< Math.max(dr,dc) ;i++  ) {
              printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
          }
          for( int i=1 ; i< Math.max(dr,dc) ;i++  ) {
              printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
          }
          for( int i=1 ; i< Math.max(dr,dc) ;i++  ) {
              printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+i);
          }
          return;
    }

}