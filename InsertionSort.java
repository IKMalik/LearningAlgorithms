import java.util.*;

public class InsertionSort {

    public static int[] InsertionSort(int[] N){

        int length = N.length;

        for (int i=0; i<length; i++){

            for (int j=i; j>0; j--){

                if (N[j] < N[j-1]){
                    int temp = N[j];
                    N[j] = N[j-1];
                    N[j-1] = temp;
                }
                else{
                    break;                }
            }
        }
        return N;
    }

    public static void main(String[] args) {
        int[] k = {2,4,3,54,1};
        k = InsertionSort.InsertionSort(k);
        System.out.println(Arrays.toString((k)));
    }

}

