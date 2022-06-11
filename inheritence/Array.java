package com.company;

import java.util.Arrays;

public class Array {
    public void main()
    {
        int [] array = new int[10];
        System.out.println(Arrays.toString(array));
        int [] arr = {10,2,30,4,5,60,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int [] []  dar = new int [5][10];
        System.out.println(Arrays.deepToString(dar));
        String num = "1";
        System.out.println(Integer.parseInt(num));
    }
}
