/*Problem Statement:- You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.
If the second largest element doesn't exist then return -1.
*/

Problem Solution :-
 
class Solution {
    void pushZerosToEnd(int[] arr) {
        int nonZeroIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonZeroIndex];
                arr[nonZeroIndex]=temp;
                nonZeroIndex++;
            }
        }
    }
}