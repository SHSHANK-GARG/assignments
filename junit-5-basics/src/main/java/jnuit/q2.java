package jnuit;

import java.util.Arrays;

public class q2 {

    public static String findMinMax2(int[] arr) {
        int min = (Arrays.stream(arr).min().getAsInt());
        int max = (Arrays.stream(arr).max().getAsInt());
        return "Min is "+ min+" Max is "+max;
    }
}