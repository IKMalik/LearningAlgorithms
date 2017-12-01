import java.util.*;

public class Mergesort {

    public static void sort(int[] numbers){
        int[] temparray = new int[numbers.length];

        sort(numbers, temparray, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void sort(int[] numbers, int[] temparray, int low, int hi){

        if (hi <= low){
            return;
        }
        int midpoint = (hi+low)/2;
        sort(numbers, temparray, low, midpoint);
        sort(numbers, temparray, midpoint+1, hi);
        merge(numbers, temparray, midpoint, low, hi);
    }

    public static void merge(int[] numbers, int[] temparray, int midpoint ,int low, int hi){

        for (int i=low; i<= hi; i++){
            temparray[i] = numbers[i];
        }

        int lowpoint = low;
        int hipoint = midpoint+1;


        for (int j=low; j<=hi; j++){
            if (lowpoint > midpoint ){
                numbers[j] = temparray[hipoint++];
            }
            else if (hipoint > hi ){
                numbers[j] = temparray[lowpoint++];
            }
            else if (temparray[lowpoint] < temparray[hipoint]){
                numbers[j] = temparray[lowpoint++];
            }
            else{
                numbers[j] = temparray[hipoint++];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,787,34};
        Mergesort.sort(a);
    }

}

