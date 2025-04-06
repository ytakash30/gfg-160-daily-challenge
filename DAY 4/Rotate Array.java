/*Problem Statement:- Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
*/

Problem Solution :-
 
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;

        d = d % n; // In case d > n

        reverse(arr, 0, d - 1);     // Reverse first d elements
        reverse(arr, d, n - 1);     // Reverse the rest
        reverse(arr, 0, n - 1);     // Reverse the whole array
    }

    
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
