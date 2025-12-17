package dsa;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static void learnBinarySearch(){
        int n = 1_000_000;
        Random rand = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(500_000) + 1;
        }
        Arrays.sort(arr);

//        Question: Find an element in a sorted array.
//        2. First Occurrence of an Element
//        4. Count Occurrences of an Element
//        Search Insert Position
//        Find Square Root of a Number
//        7. Search in Rotated Sorted Array
//        position of element in infinite array

        int target = 380_012;

        System.out.println(searchTarget(arr, target));
        System.out.println(printLastOccurrence(arr, target));
        System.out.println(countOccurrenceOfElement(arr, target));
        System.out.println(sqrt(target));
    }

//        Question: Find an element in a sorted array.
    private static int binarySearch(int[] arr, int target){
        int low =0;
        int high = arr.length-1;

        while (low<=high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target) return mid;

            else if(arr[mid] < target) low = mid +1;

            else high = mid -1;
        }
        return -1;
    }

//        2. First Occurrence of an Element
    private static int printFirstOccurrence(int [] arr, int target){
        int low = 0;
        int high = arr.length -1;
        int num = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == target){
                num = mid;
                high = mid -1;
            }
            else if (arr[mid] < target) low = mid +1;
            else high = mid -1;
        }
        return num;
    }

    private static int printLastOccurrence(int [] arr, int target){
        int low = 0;
        int high = arr.length -1;
        int num = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == target){
                num = mid;
                low = mid +1;
            }
            else if (arr[mid] < target) low = mid +1;
            else high = mid -1;
        }
        return num;
    }

//    4. Count Occurrences of an Element
    private static int countOccurrenceOfElement(int [] arr, int target){
        return printLastOccurrence(arr, target) - printFirstOccurrence(arr, target) + 1;
    }

//    Search Insert Position
    private static int searchIndex(int []  arr, int target){
        int low = 0;
        int high = arr.length -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    private static int sqrt(int target){
        int low = 0;
        int high = target;
        int ans =0;


        while(low <= high){
            int mid = low + (high - low)/2;

            if ((long) mid * mid <= target){
                ans = mid;
                low = mid +1;
            }
            else high = mid-1;
        }
        return ans;
    }

    private static int searchTarget(int [] arr, int target){
        int low = 0;
        int high = arr.length -1;

        while (low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target) return mid;

            else if(arr[mid] > target) low = mid +1;

            else high = mid -1;
        }
        return -1;
    }

}