import java.util.*;

public class Main {
    public static void main(String[] args) {
    Case2 case2 = new Case2(5);
    }
}
class Case2{
    public Case2(int n){
        int[][] array = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = rand.nextInt(100);
                array[i][j] = x;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
        System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println(FindNumber(array));
    }


    public static int FindNumber(int[][] array){
        int min = array[3][0];
        for (int i = 1; i < array.length; i++) {
            if (i != 2) {
                if (min > array[array.length - 1 - i][i]) {
                    min = array[array.length - 1 - i][i];
                }
            }
        }
        return min;
    }
}


