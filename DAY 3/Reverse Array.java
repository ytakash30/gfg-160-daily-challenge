/*Problem Statement:- You are given an array of integers arr[]. Your task is to reverse the given array.
*/

Problem Solution :-
 
class Solution {
    public void reverseArray(int arr[]) {
        int n =arr.length;
        for (int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            n--;
        }
        
        
    }
}