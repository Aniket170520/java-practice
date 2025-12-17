package dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(){
        int [] nums = {5, 1, 4, 2, 8, 3, 9, 6, 7, 0};

        for(int i = 0; i<nums.length; i++){
            boolean isSwapped= false;
            for(int j =0; j<nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp =  nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]= temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) break;
        }
        System.out.println(Arrays.toString(nums));
    }
}
