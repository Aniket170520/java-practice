package dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(){
        int [] nums = {5, 1, 4, 2, 8, 3, 9, 6, 7, 0};

        for(int i = 0; i< nums.length; i++){
            int max = 0;

            for(int j = 0; j<=nums.length-i-1; j++){
                if(nums [max]< nums[j]){
                    max = j;
                }
            }

            int temp = nums[max];
            nums[max]= nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
