package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int []arr={8,2,1,4,9,7};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if(length<=1) return; //base case

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr=new int[length-middle];

        int i=0;
        int j=0;
        for(;i<length;i++){
            if(i<middle){
                leftArr[i]=arr[i];
            }
            else{
                rightArr[j]=arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr,rightArr,arr);
    }
    public static void merge(int []leftArr, int[]rightArr, int[]arr){
        int leftSize= leftArr.length;
        int rightSize= rightArr.length;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if(leftArr[l]<rightArr[r]){
                arr[i]=leftArr[l];
                i++;
                l++;
            }
            else{
                arr[i]=rightArr[r];
                i++;
                r++;
            }
        }
        while(l<leftSize){
            arr[i]=leftArr[l];
            i++;
            l++;
        }
        while(r<rightSize){
            arr[i]=rightArr[r];
            i++;
            r++;

        }
    }
}
