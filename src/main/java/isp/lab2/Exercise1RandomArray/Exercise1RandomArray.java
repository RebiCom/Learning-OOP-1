package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        //implement the logic to fill the array with random numbers
        Random random = new Random();
        for (int i = 0; i <n; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] findMinAndMax(int[] array) {
        int min=array[0];
        int max=array[0];
        for (int i=1; i< array.length; i++) {
            if (min > array[i])
                min = array[i];
            if (max < array[i])
                max = array[i];

        }
        return new int[] {min,max};
    }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMinAndMax(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
