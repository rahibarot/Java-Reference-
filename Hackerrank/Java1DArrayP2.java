//https://www.hackerrank.com/challenges/java-1d-array
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return theGame(leap, game, 0);
    }
    private static boolean theGame(int m, int[] arr, int i){
        if(i<0|| arr[i]==1) return false;
        if((i== arr.length-1)|| i+m >arr.length-1) return true;

        arr[i]=1;

        return theGame(m,arr,i+1) || theGame(m,arr, i-1)|| theGame(m,arr, i+m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
