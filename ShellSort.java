import java.util.*;

public class ShellSort {

    public static int[] ShellSort(int[] N){

        int length = N.length;
        int h = 1;

        while (h < length/3){
            h=3*h +1;}

        while (h >=1) {

            for (int i = h; i < length; i++) {

                for (int j = i; j >= h; j-=h) {

                    if (N[j] < N[j - h]) {
                        int temp = N[j];
                        N[j] = N[j - h];
                        N[j - h] = temp;
                    } else {
                        break;
                    }
                }
            }
            h=h/3;
        }
        return N;
    }

    public static void main(String[] args) {
        int[] k = {2,4,3,54, 45, 1, 100};
        k = ShellSort.ShellSort(k);
        System.out.println(Arrays.toString((k)));

    }

}

